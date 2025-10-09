package org.example.Basics;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int num1 = 500;
        int num2 = 300;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
//        ArithmeticOperations.choice('+',70,34);
        //swap 2 numbers using third variable
        int a =8,b =9;
        System.out.println("a:"+a+" b:"+b);
        int temp = a;
        a =b;
        b =temp;
        System.out.println("a:"+a+" b:"+b);
        //swap 2 numbers without using third variable
        int x =90, y =45;
        System.out.println("x:"+x+" y:"+y);
        x = x - y;
        y = x + y;
        x = y - x;
        System.out.println("x:"+x+" y:"+y);
        //swap 2 numbers using bitwise or operator
        int xy =190, yx =145;
        System.out.println("xy:"+xy+" yx:"+yx);
        xy = xy ^ yx;
        yx = xy ^ yx;
        xy = yx ^ xy;
        System.out.println("xy:"+xy+" yx:"+yx);
    }
}

