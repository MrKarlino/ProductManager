package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testMatchesProduct() {
        Product product = new Product(1, "Cказки");
        String testName = product.getName();
        boolean actual = product.matches(testName);
        assertTrue(actual);
    }

    @Test
    void testMatchesFails() {
        Product product = new Product(1, "Cказки");
        boolean actual = product.matches("Тест");
        assertFalse(actual);
    }
}
