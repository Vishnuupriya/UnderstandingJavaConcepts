package org.example.Basics;

public class LoopStatements {
    public static void main(String[] args) {
        //factorial of number
        int num = 5,fact=1;
        for(int i =1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println(fact);
        //fibonnaci series
        int number = 4,num1 =0,num2 =1;
        System.out.println(num1);
        System.out.println(num2);
        for(int i = 2;i<=number;i++){
            int num3 = num1+num2;
            num1 =num2;
            num2 =num3;
            System.out.println(num3);
        }
        // sum of digits
        int n = 123,sum = 0;
        while(n>0){
            int digit = n%10;
            sum += digit ;
            n=n/10;
        }
        System.out.println(sum);

        //reverse a number
        int givenNum = 123, rev = 0;
        while(givenNum != 0){
            int digit = givenNum % 10;
            rev = rev * 10 + digit;
            givenNum = givenNum/10;
        }
        System.out.println(rev);

        //palindrome of number
        int Num = 1111 , reverse = 0 ;
        int original = Num;
        while(Num != 0){
            int digit = Num % 10;
            reverse = reverse * 10 + digit;
            Num = Num/10;
        }
        if(original == reverse){
            System.out.println( original + " is a palindrome");
        }
        else{
            System.out.println(original + " is not a palindrome");
        }
        //palindrome of string
//        Scanner sc = new Scanner(System.in);
        String str = "hat";
        String  reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reverseStr)){
            System.out.println( str + " is a palindrome");
        }
        else{
            System.out.println(str + " is not a palindrome");
        }


    }
}
