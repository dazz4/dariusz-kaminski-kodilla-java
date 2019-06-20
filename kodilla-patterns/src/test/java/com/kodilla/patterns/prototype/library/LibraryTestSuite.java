package com.kodilla.patterns.prototype.library;

import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Library nr 1");
        Book book1 = new Book("Harry Potter", "J. K. Rowling",
                LocalDate.of(1997, 6,26));
        Book book2 = new Book("The Lord of the Rings", "J. R. R. Tolkien",
                LocalDate.of(1954, 7,29));
        Book book3 = new Book("A Song of Ice and Fire", "George R. R. Martin",
                LocalDate.of(1996,7,1));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        // make copy of the library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library nr 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library nr 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        clonedLibrary.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
    }
}
