package ex_20072024;

import java.util.Scanner;

public class Lab092 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser name to start");
        String browser_name= sc.next();
        browser_name=browser_name.toLowerCase();

        switch (browser_name){
            case "chrome":
                System.out.println("start launching chrome browser");
                break;
            case "safari":
                System.out.println("start launching safari browser");
                break;

            case "firefox":
                System.out.println("start launching firefox browser");
                break;

            case "edge":
                System.out.println("start launching edge browser");
                break;

            default:
                    System.out.println("I have no idea which browser is this");
                break;
        }
    }
}
