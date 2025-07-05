package ex_13_Functions;

import java.util.Scanner;

public class Lab0127_Userdefinde_Fun {
    public static void main(String[] args) {
        f1();
        String s1= f2();
        System.out.println(s1);
        f3("manjula",33,1000);
        f3("Jaashu",5,100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter age:");
        int age= scanner.nextInt();
        System.out.println("Enter Salary :");
        double salary1= scanner.nextDouble();
        f3(name,age,salary1);
        int f = f4(10,20);
        System.out.println(f);
        int f2=f5(6,7,8);
        System.out.println(f2);
        double f3=f6(0.6,0.7,0.8);
        System.out.println(f3);

    }
    // 1.Without Parameters and Without Return Type
    static void f1()
    {
        System.out.println("Welcome to functions");
    }
    // 2.Without Parameters but With Return Type
    static String f2()
    {
        return "How r u";
    }
    // 3.With Parameters and Without Return Type
    static void f3(String name, int age, double salary) {

        System.out.println("your name->" + name + "\n your age->" + age + "\n your salary->" + salary);
    }


    // 4.With Parameters and With Return Type
    static int f4(int a, int b)
    {
        return a+b;

    }
    static int f5(int a, int b,int c)
    {
        return a+b+c;

    }
    static double f6(double a, double b, double c)
    {
        return a+b+c;

    }
}
