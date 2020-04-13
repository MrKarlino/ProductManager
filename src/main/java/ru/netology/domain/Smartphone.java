package ru.netology.domain;

public class Smartphone extends Product {
    private String manufacturer;

    public Smartphone(int id, String name, String manufacturer) {
        super(id, name);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return getManufacturer().equalsIgnoreCase(search);
    }
}
