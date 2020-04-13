package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductRepository repository;
    private Product product = new Product(1, "Cказки");

    private ProductManager manager = new ProductManager();

    @BeforeEach
    void setUp() {
    repository = new ProductRepository();
    repository.save(product);
    manager = new ProductManager(repository);
    }

    @Test
    void testFindBy() {
        int testId = 1;
        Product actual = manager.findById(testId);
        Product expected = product;
        assertEquals(expected, actual);
    }

    @Test
    void testSearchBy () {
        String testName = product.getName();
        Product[] actual = manager.searhBy(testName);
        Product[] expected = {product};
        assertArrayEquals(expected, actual);
    }

        @Test
    void testSave() {
        Product product1 = new Product(2, "Ужастики");
        manager.save(product1);
        int actual = repository.findAll().length;
        int expected = 2;
        assertEquals(expected, actual);
    }
}
