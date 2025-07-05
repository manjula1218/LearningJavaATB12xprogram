package ex_13_Functions;

import java.util.Scanner;

public class Lab0128_Arth_Opr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter integer");
        int b = readInt(scanner,"Enter Integer");
        int i = f1(a,b);
        System.out.println(i);
        int j = f2(a,b);
        System.out.println(j);
        int k = f3(a,b);
        System.out.println(k);
        int l = div(a,b);
        System.out.println(l);
        int m= f5(a,b);
        System.out.println(m);

    }
    //Scanner scanner = new Scanner(System.in);
    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter integer only");
            System.exit(0);
            return -1;
        }
    }
        static int f1(int a,int b)
        {
            return a + b;
        }
        static int f2(int a,int b)
        {
            return a - b;
        }
        static int f3(int a,int b)
        {
            return a * b;
        }
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
        static int f5(int a, int b)
        {
            return a % b;
        }
    }
