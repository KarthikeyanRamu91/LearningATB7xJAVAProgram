package ex_20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        // Program to Check
        // if a Number is Positive
        // , Negative,
        // or Zero.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to find Positive or Negative or zero");
        int num=sc.nextInt();


        if (num> 0){
            System.out.println("number is positive");
        }else if (num<0){
            System.out.println("number is negative");
        }else System.out.println("number is zero");

    }
}
