package Test;

public class Test1 {
    public static void main(String[] args) {
        int a= 10;
        int b= 2;
        //int c=0;
        try{
            b=a/b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I will be executed always");
        }
        System.out.println(b);
    }
}
