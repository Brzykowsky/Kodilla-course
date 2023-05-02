package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2000,12,12));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001,1,10));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2002,2,8));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(2003,3,6));

        Library library = new Library("Library 1");
        library.addBooks(book1);
        library.addBooks(book2);
        library.addBooks(book3);
        library.addBooks(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 2");

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3,library.getBooks().size());
        assertEquals(3,clonedLibrary.getBooks().size());
        assertEquals(4,deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(),library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
