package ru.netology.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private ProductRepository repository;
    private Product product1 = new Product(1, "Cказки");
    private Product product2 = new Product(2, "Ужастики");
    private Product[] products = {product1, product2};

    @BeforeEach
    void setUp() {
        repository = new ProductRepository();
        repository.setProducts(products);
    }

    @Test
    void testFindAll() {
        Product[] actual = repository.findAll();
        assertArrayEquals(products, actual);
    }

    @Test
    void testSave() {
        Product product3 = new Product(3, "Стихи");
        repository.save(product3);
        int actual = repository.findAll().length;
        int expected = products.length + 1;
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveById() {
        int index = product1.getId();
        repository.removeById(index);
        int actual = repository.findAll().length;
        int expected = products.length - 1;
        assertEquals(expected, actual);
    }
}