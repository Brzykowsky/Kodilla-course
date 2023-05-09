package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "List of homework";

    private static final String DESCRIPTOIN = "Do your Math homework";

    @Test
    public void testFindByListName(){

        //Given

        TaskList taskList = new TaskList(LISTNAME,DESCRIPTOIN);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> findTaskLists = taskListDao.findByListName(listName);
        //Then
        assertEquals(1,findTaskLists.size());

        //CleanUp
        int id = findTaskLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
