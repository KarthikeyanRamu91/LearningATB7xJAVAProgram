package ex_20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1=sc.nextInt();

        System.out.println("Enter the num2");
        int num2=sc.nextInt();

        System.out.println("Enter the num3");
        int num3=sc.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println(num1);
        }else if (num2>=num1 && num2>=num3){
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
    //Program to Find the Largest Among Three Numbers:




}
