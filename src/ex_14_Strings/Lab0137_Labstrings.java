package ex_14_Strings;

import java.util.StringJoiner;

public class Lab0137_Labstrings {
    public static void main(String[] args) {
        String s= "Java";
        char c = s.charAt(2);
        System.out.println(c);
        System.out.println(s.codePointAt(3));
        int idx = "java".indexOf('a');
        System.out.println(idx);
        int idx2 = "java".lastIndexOf('a');
        System.out.println(idx2);
        int idx3 ="Java".codePointBefore(2);
        System.out.println(idx3);
        boolean b= " ".isEmpty();
        System.out.println(b);
        String s2= String.join("-","Java","Python");
        System.out.println(s2);
        String s3 = "Java".replace("a","o");
        System.out.println(s3);
        System.out.println("Java".startsWith("Ja"));


    }
}
