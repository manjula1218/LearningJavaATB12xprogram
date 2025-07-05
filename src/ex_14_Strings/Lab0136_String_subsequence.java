package ex_14_Strings;

public class Lab0136_String_subsequence {
    public static void main(String[] args) {

        String s1= "Manjula";
        System.out.println(s1.subSequence(1,4));//prints 1 to end-1 i.e., 1to 3
        System.out.println(s1.codePointAt(0));//will print ASCII value of char present at that index
    }
}
