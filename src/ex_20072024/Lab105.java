package ex_20072024;

import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char, I will tell you it is vowel or consonent");
        char letter=sc.next().charAt(0);

        if (letter =='a'|| letter=='e'|| letter=='i'|| letter=='o'|| letter=='u'){
            System.out.println("It is Vowel");
        }else {
            System.out.println("Not vowel, it is Consonent");
        }
    }
}
