package ex_09_Switch;

import java.util.Scanner;

public class Lab078_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter browser");
        String b= scanner.next();
        b =b.toLowerCase();

        switch (b)
        {
            case "chrome":
                System.out.println("Starting the browser");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the browser");
                System.out.println(".......");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            default:
                System.out.println("I have no idea which browser it is");


        }

    }
}
