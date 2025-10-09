package org.example.Basics;

public class ConditionalStatements {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //Number is positive or negative
        int num1 = 56;
        if(num1>0){
            System.out.println(num1 + " the number is positive");
        }
        else if(num1<0){
            System.out.println(num1 + " the number is negative");
        }
        else {
            System.out.println(num1 + " the number is zero");
        }
        //Number is even or odd
        int num = 89;
        if(num%2 == 0){
            System.out.println(num + " the number is even");
        }
        else{
            System.out.println(num + " the number is odd");
        }
        //Find the largest number
        int a = 435,b = 566, c= 78;
        if(a>b && a>c){
            System.out.println(a + " the number is greater");
        }
        else if(b>c){
            System.out.println(b + " the number is greater");
        }
        else{
            System.out.println(c + " the number is greater");
        }
        //find largest number using ternary operator
        int x = 445, y = 859, z = 7888;
        int result = (x > y && x > z) ? x : (y>z) ? y : z;
        System.out.println(result + " the number is greater.");

    }

}
