/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haileyzoomanager;

/**
 *
 * @author AMD
 */
public class Fish extends Animal implements Swimmable {
    public Fish (String name, int age, double weight){
        super(name, age, weight);

}
    @Override
   public void makeSound(){
       System.out.println(getName() + " clook clook!!");
   }
    @Override
   public void eat(){
       System.out.println(getName() + " eats");
   }
    @Override
   public void sleep(){
       System.out.println(getName() + " sleeps");
   }
    @Override
   public void swim(){
       System.out.println(getName() + " swims");
   }
}
