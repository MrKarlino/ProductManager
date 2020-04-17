package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1, "Стихи", "Иванов");

    @Test
    void testMatchesBookAutor() {
        String testAuthor = book.getAuthor();
        boolean actual = book.matches(testAuthor);
        assertTrue(actual);
    }

    @Test
    void testMatchesFails() {
        boolean actual = book.matches("Лафкрафт");
        assertFalse(actual);
    }

    @Test
    void testMatchesBookName() {
        String testName = book.getName();
        boolean actual = book.matches(testName);
        assertTrue(actual);
    }
}
