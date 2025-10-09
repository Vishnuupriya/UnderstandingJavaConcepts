package org.example.OopsConcept;

public class ClassandObjects {
    public static void main(String[] args) {
        //Creating object for Class "Polymorphism"
        Polymorphism pp = new Polymorphism();
        pp.start(args);
        pp.display();
        System.out.println("====================================================");

        //Creating object for Class "Encapsulation"
        Encapsulation e = new Encapsulation();
        e.setAge(21);//set the age value through method
        e.setName("PRIYA");// set the name value through method
        //get the value through method
        System.out.println("i am a Encapsulation!");
        System.out.println("Name is "+e.getName() + " and she is " + e.getAge() + " years old");
        System.out.println("====================================================");
    }
}
