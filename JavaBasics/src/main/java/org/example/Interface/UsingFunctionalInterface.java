package org.example.Interface;

public class UsingFunctionalInterface implements SampleFunctionalInterface {

    @Override
    public void driving(){
        System.out.println("driving");
    }
    public static void main(String[] args) {
        UsingFunctionalInterface f = new UsingFunctionalInterface();
        f.driving();
    }
}
