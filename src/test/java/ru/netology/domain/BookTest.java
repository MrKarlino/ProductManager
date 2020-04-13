package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1, "Стихи", "Иванов");
    @Test
    void testMatchesBookAutor() {
        String testAuthor = book.getAuthor();
        boolean actual = book.matches(testAuthor);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    void testMatchesBookName() {
        String testName = book.getName();
        boolean actual = book.matches(testName);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}