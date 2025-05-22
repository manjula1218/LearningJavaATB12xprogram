package ex_07_Increment_Decrement_Operator;

public class Lab067_Task2 {
    public static void main(String[] args) {
        int a=11;
        int b= 22;
        int c = a + b+ a++ +b++ + ++a + ++b;
        System.out.println(c);//ans =1039
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

    }
}
