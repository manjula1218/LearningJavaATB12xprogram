package ex_05_TypeCasting;

public class Lab045_Typecast01 {
    public static void main(String[] args) {
        int a= 10;
        long l1 =a;//Implicit
        long l2 = (long)a;//explicit
        System.out.println(a);
        System.out.println(l1);
        System.out.println(l2);
    }
}
