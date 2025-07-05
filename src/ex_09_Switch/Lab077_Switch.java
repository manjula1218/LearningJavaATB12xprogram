package ex_09_Switch;

import java.util.Scanner;

public class Lab077_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integral values 1 to 7:");
        int b= scanner.nextInt();
        switch(b)
        {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }

    }
}
