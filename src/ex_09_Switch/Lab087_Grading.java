package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Marks");
        int Marks = scanner.nextInt();
        int Marks1 = Marks/10;

        switch (Marks1) {

            case 10,9,8:
                 System.out.println("Excellent");
                 break;

           case 7:
                System.out.println("Very Good");
                break;

            case 6:
                System.out.println("Needs Improvement");
                break;

            case 5:
                 System.out.println("Pass");
                 break;

            case 3,2,1:

                    System.out.println("Fail");
                    break;


            default:
                System.out.println("Invalid Grade");

        }

    }
}