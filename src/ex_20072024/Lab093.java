package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a letter, I will tell you it is vowel or not");
        char user_input=sc.next().charAt(0);

        switch (user_input){
            case 'a':
                System.out.println("Vowel");
                break;

            case 'e':
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("Not a Vowel, It it Consonant");
            break;
        }

    }
}
