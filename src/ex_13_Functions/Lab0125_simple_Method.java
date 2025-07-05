package ex_13_Functions;

public class Lab0125_simple_Method {
    public static void main(String[] args) {
        non_return_fun();
        String s1= with_return_type_wp();
        System.out.println(s1);
       int a = With_int();
        System.out.println("Int value is:"+a);
        boolean b= With_boolean();
        System.out.println("bool value is:"+b);
        float f = With_float();
        System.out.println("float value is:"+f);
        long l=With_long();
        System.out.println("long value is:"+l);


    }

    static void non_return_fun() {
        System.out.println("Hi, how r u");
    }

    static String with_return_type_wp() {
        return "hi";
    }

    static int With_int() {
        return 10;
    }
    static float With_float() {
        return 3.14f;
    }
    static long With_long() {
        return 10l;
    }
    static boolean With_boolean() {
        return true;
    }
}