/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package haileyzoomanager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Huawei
 */
public class HaileyZooManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.println("Zoo Management System!");

        System.out.println();
        System.out.print("Enter the number of animals to create:");
        int numAnimals = in.nextInt();
        
        System.out.println();
        for (int i = 0; i < numAnimals; i++) {
            System.out.println();
            
            System.out.print("Choose Animal Type: (1. MAMMAL, 2.BIRD, 3.FISH, 4. REPTILE): ");
            int type = in.nextInt();
            System.out.println("Enter details for animal " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Age: ");
            int age = in.nextInt();
            System.out.print("Weight: ");
            double weight = in.nextDouble();
            
            
         System.out.println();
            switch (type) {
                case 1:
                    animals.add(new Mammal(name, age, weight));
                    break;
                case 2:
                    animals.add(new Bird(name, age, weight));
                    break;
                case 3:
                    animals.add(new Fish(name, age, weight));
                    break;
                case 4:
                    animals.add(new Reptile(name, age, weight));
                    break;
                default:
                    System.out.println("Invalid type. Animal not created.Please Try Again.");
            }
            System.out.println();
            System.out.println("VIEW ALL ANIMALS IN THE ZOO: ");
            for(Animal animal: animals){
              System.out.println(animal.getName() + " = "+ animal.getClass().getSimpleName() + " = " + "Age:" +(age) + " = " + "Weight:" + (weight));
           
         
            }
        }
        System.out.println();
        for (Animal animal : animals) {
            System.out.println();
            animal.makeSound();
            animal.eat();
            animal.sleep();
            
   
            if (animal instanceof Flyable) {
                ((Flyable) animal).fly();
            }
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
          
            
        }
        in.close();
    }
}


