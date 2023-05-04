package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final String using;

    public DrivingTask(String taskName, String where, String using){

        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "Driving task has been executed";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
