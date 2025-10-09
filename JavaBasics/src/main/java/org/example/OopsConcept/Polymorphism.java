package org.example.OopsConcept;
 /*
    Polymorphism means "many forms".
    In Java, it allows one thing (like a method or object)
    to behave differently based on the context.
    Types of Polymorphism in Java
        1) Compile-time Polymorphism (Method Overloading)
              Same method name, different parameter lists (different number/type of arguments).
              Decided at compile time.
        2) Runtime Polymorphism (Method Overriding)
              A child class provides a different implementation of a method
              that already exists in the parent class.
              Decided at runtime.
    * */

public class Polymorphism {
    public void start(String[] args) {
        System.out.println("i am a Polymorphism!");
    }
    //Example of Method overloading =>Compile-time Polymorphism
        //same method name "poly" with 2 integer parameters to add
        public int poly(int a, int b) {
            return a+b;
        }
        //same method name "poly" with 3  integer parameters to add
        public int poly(int a, int b, int c) {
            return a+b+c;
        }
        //same method name "poly" with 2  string parameters to concat
        public String poly(String a, String b) {
            return a+b;
        }

    //display method contains output to be used as whole in ClassandObjects class.
        public void display() {
            //same method name "poly" with 3  integer parameters to add
            int result = poly(8,9,7);
            System.out.println("result of 3 parameter : "+result);

            //same method name "poly" with 2 integer parameters to add
            System.out.println("result of 2 paramter : " + poly(9,5));

            //same method name "poly" with 2  string parameters to concat
            String concat = poly("Vishnuu","Priya");
            System.out.println("concat : "+concat);
        }
    //Example of Run-time Polymorphism in Inheritance and Interface.
}
