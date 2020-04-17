package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone(1, "Нокиа", "Nokia Corp");

    @Test
    void testMatchesSmartphoneManufacturer() {

        String testManufacturer = smartphone.getManufacturer();
        boolean actual = smartphone.matches(testManufacturer);
        assertTrue(actual);
    }

    @Test
    void testMatchesFails() {
        boolean actual = smartphone.matches("Моторолла");
        assertFalse(actual);
    }

    @Test
    void testMatchesSmartphoneName() {
        String testName = smartphone.getName();
        boolean actual = smartphone.matches(testName);
        assertTrue(actual);
    }
}
