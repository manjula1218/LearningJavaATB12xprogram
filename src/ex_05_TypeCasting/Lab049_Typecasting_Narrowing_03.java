package ex_05_TypeCasting;

public class Lab049_Typecasting_Narrowing_03 {
    public static void main(String[] args) {
        int a =100;
        float b =10.25f;
        //int b1 = a+b;//implicit narrowing not possible//without converting float in to int trying to allocated in to int not possible
        int b1= a+(int)b;//explicit narrowing//converting float in to int first and result allocating in to int possible
        float b2 = a+b;
        System.out.println(b1);
        System.out.println(b2);

    }
}
