package com.kodilla.patterns2.bookclasifier;

import com.kodilla.patterns2.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;


public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        // Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author1", "Title1", 1950, "0001"));
        bookSet.add(new Book("Author2", "Title2", 1960, "0002"));
        bookSet.add(new Book("Author3", "Title3", 1970, "0003"));
        bookSet.add(new Book("Author4", "Title4", 1980, "0004"));
        bookSet.add(new Book("Author5", "Title5", 1990, "0005"));
        bookSet.add(new Book("Author6", "Title6", 2000, "0006"));

        //When
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        //Then
        assertEquals(1975, median);

    }

}