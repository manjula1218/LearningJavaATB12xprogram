package ex_05_TypeCasting;

public class Lab046_typeCasting02 {
    public static void main(String[] args) {
        byte b=20;
        int a= b; //Implicit conversion of data widening
        int a1= (int)b;//widening explicitly
        System.out.println(b);
        System.out.println(a);
        System.out.println(a1);

    }
}
