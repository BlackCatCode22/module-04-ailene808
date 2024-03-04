package Java_Zoo;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to my Zoo\n\n");
        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);

        //These are variables
        String name;
        String species;
        int age;

        //ArrayList of objects
        ArrayList<Animal> animals = new ArrayList<>();

        //The external file contains the list of animals
        String filePath = "C:/2024_Spring/JAVA/Module04/arrivingAnimals.txt";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                //Age is in the first element of the array named parts
                String[] parts = line.split(",");

                //Check if the line has at least 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    System.out.println("ageAndSpecies: = + ageAndSpecies);

                    //Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split("");
                    for (int i=0; i<5; i++) {
                    System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                age = Integer.parseInt(theParts[0]);
                species = theParts(4);

                //Creating a new animal object
                Java_Zoo.Animal myAnimal = new Animal("name needed", species, age);

                //Add the new animal object to the ArrayList of Animals
                animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: "+ Animal.numofAnimals);
        }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }
    for (Animal animal : animals){
        System.out.println(animal);
        System.out.println("Animal name" + animal.getName()+ ", Age:" + animal.getAge() + " Species: " + animal.getSpecials());
    }


    }
}