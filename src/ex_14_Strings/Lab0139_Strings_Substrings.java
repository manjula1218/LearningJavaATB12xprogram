package ex_14_Strings;

public class Lab0139_Strings_Substrings {
    public static void main(String[] args) {

        String s1="Manjula".substring(3);
        System.out.println(s1);
        System.out.println(s1.substring(1,4));
        char[] arr = "Manjula".toCharArray();
        System.out.println(arr);
        System.out.println(s1.trim());
        boolean b= " ".isBlank();
        System.out.println(b);
        String s2= "mm";
        System.out.println(s2.repeat(3));
        String s3 = "java";
        System.out.println(s3.equalsIgnoreCase("JAVA"));
       String s4 = String.format("%s = %d","age",25);
       System.out.println(s4);
       long s5 = "a\nb\nc".lines().count();
       System.out.println(s5);

    }
}
