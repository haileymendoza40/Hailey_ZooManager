/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package haileyzoomanager;

/**
 *
 * @author Huawei
 */
public class Mammal extends Animal{
    public  Mammal(String name,int age,double weight){
        
        super(name,age, weight);
    }
    
  
@Override
public void makeSound(){
System.out.println(getName() +" maaaa!!");

}

    @Override
 public void eat(){
System.out.println(getName() + " eats");

}
@Override
public void sleep(){
System.out.println(getName() + " sleeps");

 }

}
