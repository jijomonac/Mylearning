
package com.java.collection;


import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hp
 */
public class PipelinesStreams {

    public static void main(String... args) {

        
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);
  
        // Using peek with count(), which
        // is a terminal operation
        list.stream().peek(System.out::println).count();
        
        System.out.println("Hi");
        
        Animal animal = new Animal();
        List<Animal> animalList = animal.getAnimalList();

        System.out.println("**** using regular for loop:");

        for (Animal a : animalList) {
            System.out.println(a.getName() + " " + a.getType());
        }

        System.out.println("**** iteration using stream forEach:");
        animalList.stream().forEach(
                a -> System.out.println(a.getName() + " " + a.getType()));

        System.out.println("**** stream with filter:");
        animalList
                .stream()
                .filter(a -> a.getType() == Animal.WILD)
                .forEach(
                        a -> System.out.println(a.getName() + " " + a.getType()));

        
        
        System.out.println("**** stream with filter and count:");
        long count = animalList.stream()
                .filter(a -> a.getType() == Animal.DOMESTIC).count();
        System.out
                .println("Count of " + Animal.DOMESTIC + " animals: " + count);

        System.out
                .println("**** stream with filters and average on a property:");
        double averageAge = animalList.stream()
                .filter(a -> a.getType() == Animal.WILD)
                .filter(a -> a.getAge() > 2).mapToDouble(Animal::getAge).average()
                .getAsDouble();
        System.out.println("Average age of " + Animal.WILD + " animals: "
                + averageAge);

    }

}
