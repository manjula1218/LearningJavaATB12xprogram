package ex_14_Strings;

public class Lab0135_Strings_Interview2 {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "Hello";
        String s3= "hello";

        String s4= new String("Hello");
        String s5 = new String("hello");
        String s6 = new String("Hello");
        System.out.println(s1==s2);
        System.out.println(s1==s4);
        System.out.println(s4==s6);
        System.out.println(s1.equals(s4));
        System.out.println(s2.equals(s4));
    }
}
