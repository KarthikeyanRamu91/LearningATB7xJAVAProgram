package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

//        Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st side length of the triangle");
        float side1_length=sc.nextFloat();

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the 2nd side length of the triangle");
        float side2_length=sc1.nextFloat();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter the 3rd side length of the triangle");
        float side3_length=sc2.nextFloat();

        if (side1_length == side2_length && side2_length==side3_length){
            System.out.println("equilateral");
            
        } else if (side1_length==side2_length && side2_length!=side3_length) {
            System.out.println("isosceles");

        } else if (side1_length!=side2_length && side2_length==side3_length) {
            System.out.println("isosceles");

        } else if (side1_length==side3_length && side1_length!=side2_length) {
            System.out.println("isosceles");

        } else {
            System.out.println("scalene");
        }


    }
}
