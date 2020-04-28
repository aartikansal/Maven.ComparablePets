package io.zipcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.sort;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  // Reading from System.in
        System.out.println("How many pets do you have?");
        int n = sc.nextInt(); // Scans the next token of the input as an int.


        ArrayList<Pet> list = new ArrayList<>();

        //Sorting list with pets by "compareTo method, which goes with Comparable<Pet> interface
        //natural order
        sort(list);

        //sorting list by compare method from petsComparator class, which goes with Comparator interface
        // my way to sort order
        sort(list, new PetsComparator());
        for (int i = 0; i <n ; i++) {

            Scanner dl = new Scanner(System.in);
            System.out.println("What type of pet is it?");
            String type = dl.nextLine();

            Scanner p = new Scanner(System.in);
            System.out.println("What is your pet name?");
            String name = p.nextLine();


            switch(type){
                case "dog":
                    Dog dog = new Dog(name);
                    list.add(dog);
                    break;
                case "cat":
                    Cat cat = new Cat(name);
                    list.add(cat);
                    break;
                case "pig":
                    Pig pig = new Pig(name);
                    list.add(pig);
                    break;
            }

        }
        for(Pet pet:list) {
            System.out.println(pet);

        }

        Pet cat = new Cat("bb");
        Dog dog = new Dog("dog");
        Pet pig = new Pig ("Lana");

        System.out.println(cat.getClass().getName() + "\n" + dog.getClass().getName() + "\n"  +pig.getClass().getName());
    }
}



