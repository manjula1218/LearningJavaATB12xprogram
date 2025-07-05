package Test;

public class Test2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            b=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Cannot divide by zero Finally block executed");
        }
    }
}
