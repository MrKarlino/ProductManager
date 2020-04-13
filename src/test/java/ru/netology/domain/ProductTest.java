package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AProductTest {

    @Test
    void testMatchesProduct() {
        Product product = new Product(1, "Cказки");
        String testName = product.getName();
        boolean actual = product.matches(testName);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}