package io.zipcoder;

public class Bird extends Pet{

    public Bird(String name) {
        super(name);
    }
    public String speak(){
        return "Chirp!";
    }
    public String getPet() {
        return "Bird";
    }
}