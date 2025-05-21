package ex_05_TypeCasting;

public class Lab047_typecasting_Narrowing {
    public static void main(String[] args) {
        int val= 500;
        //byte b= val;
        //implicit narrowing //assigning bigger data to smaller//not possible
        byte b1= (byte)val;
        System.out.println(val);
        //System.out.println(b);
        System.out.println(b1);//explicit narrowing possible still some data loss but it will store how much it can store and give the result.
    }
}
