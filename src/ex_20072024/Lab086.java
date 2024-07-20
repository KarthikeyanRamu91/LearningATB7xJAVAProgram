package ex_20072024;

import java.util.Scanner;

public class Lab086 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num 1");
        int num1=sc.nextInt();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the num 2");
        int num2=sc1.nextInt();

        if (num1>num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);

        }


    }
}
