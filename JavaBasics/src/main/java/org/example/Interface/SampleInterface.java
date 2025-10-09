package org.example.Interface;

//all the methods present in interface should be
// overriden in class that implements interface.


//example of normal interface -> which can have multiple abstract method.
interface SampleInterface {
    void dancing();//public abstract is default/ implicitly applied
    void eating();
}


//functional interface can have only one abstract method!
//only fuctional interface can use lambda functions

@FunctionalInterface
interface SampleFunctionalInterface {
    void driving();
}








