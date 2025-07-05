package ex_09_Switch;

import java.util.Scanner;

public class Lab076_SwitchwithoutBreak {
    public static void main(String[] args) {
        System.out.println("enter number between 1 to 7:");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        //System.out.println("enter number between 1 to 7:");


        switch (b) {
            case 1:
                System.out.println("mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("wed");
            case 4:
                System.out.println("thur");
            case 5:
                System.out.println("fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("Enter only integers from 1 to 7");


        }
    }
}
