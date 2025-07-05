package ex_08_If_Condition;

import java.util.Scanner;

public class Lab072_Scanner {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
    if (a>18)
        {
            System.out.println("you can vote");
        }
        else {
            System.out.println("you can not ");
        }
    }
}
