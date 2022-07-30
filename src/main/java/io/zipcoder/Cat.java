package io.zipcoder;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    public String speak() {
        return "Meow!";
    }

    public String getPet() {
        return "Cat";
    }
}
