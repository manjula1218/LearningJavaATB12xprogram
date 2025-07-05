package ex_11_while;

import java.util.Scanner;

public class Lab0113_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number:");
        //int n = scanner.nextInt();
        //System.out.println("enter the number:");
        int i = 1;
        int fact = 1;
        if (!scanner.hasNextInt())
            {
                System.out.println("Enter the int,rerun the programme");
            }
            int n = scanner.nextInt();
            if (n == 0) {
                System.out.println("factorial is->" + fact);
            }
            while (i <= n) {

                fact = i * fact;
                i++;
            }
            System.out.println(fact);


        }
    }

