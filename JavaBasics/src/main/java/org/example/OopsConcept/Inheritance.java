package org.example.OopsConcept;
class Computer{
    public void input(){
        System.out.println("The computer takes data from the user or another device.");
    }
    public void process(){
        System.out.println("The computer’s CPU or processor works on the data");
    }
}
class Laptop extends Computer //multiple inheritance
 {
     @Override //example for RunTime Polymorphism
     public void input(){
         System.out.println("typing on keyboard, clicking mouse, using webcam or mic");
     }
     @Override
     public void process(){
         System.out.println("Opening an app Calculating total marks");
     }

}
class Mobile  extends Computer //multiple inheritance
 {
     @Override //annotation
     public void input(){
         System.out.println("tapping the screen, speaking into mic, using camera");
     }
     public void storage(){
         System.out.println("In mobile, data is stored in internal memory or SD card");
     }
}
public class Inheritance {
    public static void main(String[] args) {
        System.out.println("=======================================");
        Mobile computer = new Mobile();
        computer.input();
        System.out.println("=======================================");
        computer.storage();
        System.out.println("=======================================");
        Laptop laptop = new Laptop();
        laptop.input();
        System.out.println("=======================================");
        laptop.process();
    }



}
