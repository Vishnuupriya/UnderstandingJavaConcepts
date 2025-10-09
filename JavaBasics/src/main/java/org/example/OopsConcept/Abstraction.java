package org.example.OopsConcept;
//Abstract class cannot create objects
// on its own only its inherited child class can create new objects.

abstract class Computer1{
    public abstract void input();
    public abstract void process();
}
//every method in abstract class should be override/present in child class
class Laptop1 extends Computer1 //multiple inheritance
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
class Mobile1  extends Computer1 //multiple inheritance
{
    @Override //annotation
    public void input(){
        System.out.println("tapping the screen, speaking into mic, using camera");
    }
    public void storage(){
        System.out.println("In mobile, data is stored in internal memory or SD card");
    }
    public void process(){
        System.out.println("Opening an app Calculating total marks");
    }
public class Abstraction {
    public static void main(){
        Laptop1 laptop1 = new Laptop1();
        laptop1.input();
        laptop1.process();
        Mobile1 mobile1 = new Mobile1();
        mobile1.input();
        mobile1.process();

    }
}
}
