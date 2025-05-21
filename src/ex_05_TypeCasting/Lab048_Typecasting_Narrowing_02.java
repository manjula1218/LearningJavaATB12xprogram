package ex_05_TypeCasting;

public class Lab048_Typecasting_Narrowing_02 {
    public static void main(String[] args) {
        long ph_num = 8792946675l;
        //short s = ph_num; implicit narrowing not possible
        short s = (short) ph_num;
        System.out.println(ph_num);
        System.out.println(s);
        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit
        short s1 = (short) phone_no; // Narrowing - Explicit
        System.out.println(s1); // 5866

    }
}
