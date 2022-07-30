package io.zipcoder;


import java.util.List;
import java.util.Scanner;

public class Application {
    public static Scanner input = new Scanner(System.in);
    public static Integer numOfPets;
    public List<Pet> petList;
    Pet pet = new Pet();
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Pet pet = new Pet();
        pet.getNumOfPetsPrompt();
        pet.getPetTypePrompt();
        //pet.askPetName();
        pet.outputPet();
    }
}
