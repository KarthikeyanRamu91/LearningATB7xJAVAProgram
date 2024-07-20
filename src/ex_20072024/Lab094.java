package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter, I will tell you it is vowel or not");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("vowel");
                break;
            default:
                System.out.println("Not a vowel, It is Consonant");
        }
    }
}
