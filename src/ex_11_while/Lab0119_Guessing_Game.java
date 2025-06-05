package ex_11_while;

import java.util.Random;
import java.util.Scanner;

public class Lab0119_Guessing_Game {
    public static void main(String[] args) {

        Random random = new Random();
        int Guessnumber = random.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int g;
        int attempts = 0;
        while (true) {
            //g= scanner.nextInt();
            if (!scanner.hasNext()) {
                System.out.println("Invalid input,enter correct number");

            }

            g = scanner.nextInt();
            attempts++;
            if (g<1 ||g>100)
            {
                System.out.println("Enter number between 1 to 100");
            }
            if (g<Guessnumber) {
                System.out.println("Number is too low");
            } else if (g>Guessnumber) {
                System.out.println("Number is too high");

            } else {
                System.out.println("your entered correct number in"+" "+attempts+" "+"attempts");
                break;
            }
        }
    }
}