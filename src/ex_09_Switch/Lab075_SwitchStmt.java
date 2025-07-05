package ex_09_Switch;

import java.util.Scanner;

public class Lab075_SwitchStmt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer between 1 to 7:");
        //int b=1;
      //  int b = scanner.nextInt();
        if (scanner.hasNextInt()) {
             int b= scanner.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("Enter integer only between 1 to 7");
            }
        }
            else{

                System.out.println("Enter only integers");
        }

    }
}
