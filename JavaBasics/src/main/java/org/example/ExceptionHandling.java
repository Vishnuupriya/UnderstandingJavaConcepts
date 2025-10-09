package org.example;
class Hello{
    public void say1() throws Exception{
        System.out.println("Hello World");
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        int div = 0;
        try
        {
            Hello hello = new Hello();
            hello.say1();
            int quotient = 19/div;
            throw new ArithmeticException();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Something went wrong! " + e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
