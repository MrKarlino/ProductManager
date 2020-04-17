package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public Product[] findAll() {
        return products;
    }

    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[newProducts.length - 1] = product;
        products = newProducts;
    }

    public void removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product i : products) {
            if (i.getId() != id) {
                tmp[index] = i;
                index++;
            }
        }
        products = tmp;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
