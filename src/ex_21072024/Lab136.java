package ex_21072024;

import java.util.Scanner;

public class Lab136 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int sum_result=functype4(a,5);
        System.out.println(sum_result);
    }
    static int functype4(int a,int b){
        System.out.println("With Parameter and With return");
        return a+b;
    }
}
