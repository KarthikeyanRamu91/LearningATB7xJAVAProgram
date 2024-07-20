package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
//        Grade calculator
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        char grade='F';
//        System.out.println(grade);

        if (marks>=90 && marks<=100){
            grade='A';
        } else if (marks>=89 && marks<=80) {
            grade = 'C';

        }else if (marks>=79 && marks<=70) {
            grade = 'C';

        }else if (marks>=69 && marks<=60) {
            grade = 'D';

        }else if (marks>=59 && marks<=50) {
            grade = 'E';

        }else if(marks<0 || marks>100){
            System.out.println("Lol are you good");

        }else{
            grade='F';

        }
        System.out.println(grade);
sc.close();
    }
}
