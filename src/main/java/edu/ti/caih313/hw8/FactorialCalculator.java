package edu.ti.caih313.hw8;

import java.util.Scanner;
import java.math.BigInteger;

public class FactorialCalculator {
    public static void main(String[] args) {
        String answer;
        do {
            System.out.println("Enter a number: ");
            Scanner keyboard = new Scanner(System.in);
            int number = keyboard.nextInt();
            BigInteger n = BigInteger.valueOf(number);
            System.out.println(n + "!= " + factorial(n));
            System.out.println("Type yes to enter another number. Type no to end the program. ");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("yes"));
    }
     public static BigInteger factorial(BigInteger n){
         if (n.equals(BigInteger.ZERO))
             return BigInteger.ONE;
         else
             return n.multiply(factorial(n.subtract(BigInteger.ONE)));
        }
}
//biggest int program can handle = 31! = 738197504
//biggest long program can handle = 31! = 4999213071378415616