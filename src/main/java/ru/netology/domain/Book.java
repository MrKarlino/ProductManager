package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Book extends Product {
    private String author;

    public Book(int id, String name, String author) {
        super(id, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return getAuthor().equalsIgnoreCase(search);
    }
}
