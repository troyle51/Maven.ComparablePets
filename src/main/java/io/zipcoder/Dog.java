package io.zipcoder;

public class Dog extends Pet{

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "Bark!";
    }
    public String getPet() {
        return "Dog";
    }
}
