/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haileyzoomanager;

/**
 *
 * @author Huawei
 */
public abstract class Animal {
  protected String name;
  protected int age;
  protected double weight;
  
  public Animal(String name, int age, double weight){
  this.name = name;
  this.age = age;
  this.weight = weight;
    
}
   public abstract void makeSound();
   public abstract void eat();
   public abstract void sleep();

  

  public String getName(){
      return name;
  }
   public void setName(String name){
       this.name = name;
      
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age = age;
   }
   public double getWeight(){
       return weight;
   }
   public void setWeight(double weight){
       this.weight = weight;
   }
   
}