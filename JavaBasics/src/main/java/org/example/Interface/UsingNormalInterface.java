package org.example.Interface;

public class UsingNormalInterface implements SampleInterface {
    @Override
    public void dancing() {
        System.out.println("dancing");
    }
    @Override
    public void eating() {
        System.out.println("eating");
    }
    public static void main(String[] args) {
        UsingNormalInterface l1 = new UsingNormalInterface();
        l1.eating();
        l1.dancing();

    }
}
