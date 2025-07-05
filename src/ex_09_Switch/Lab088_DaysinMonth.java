package ex_09_Switch;

import java.util.Scanner;

public class Lab088_DaysinMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        System.out.println("Month");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Number of days in" +" "+month+" " + "month of year" + year + "is 31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("Number of days in" +" "+month+" " + "month of year" + year + "is 30 days");
                break;
            case 2:
                if (year / 4 == 0 && !(year / 100 == 0) || year / 400 == 0) {
                    System.out.println("Number of days in" +" "+month+" " + "month of year" + year + "is 29 days");
                } else {
                    System.out.println("Number of days in" +" "+month+" " + "month of year" + year + "is 28 days");
                }
                break;
            default:
                System.out.println("Enter valid year and valid month");

        }
    }
}
