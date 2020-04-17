package ru.netology.manager;

import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import java.util.Arrays;

public class ProductManager {
    private ProductRepository repository;

    public ProductManager() { this.repository = new ProductRepository(); }

    public ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public Product findById(int id) {
        for (Product item: repository.findAll()) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void save(Product product) {
        repository.save(product);
    }

    public Product[] searhBy(String text) {
        Product[] allProducts = repository.findAll();
        Product[] temp = new Product[allProducts.length];
        int i = 0;
        for (Product item : allProducts) {
            if(item.matches(text)) {
                temp[i] = item;
                i++;
            }
        }
        return Arrays.copyOfRange(temp, 0, i);
    }
}
