package ex_06_TernaryOperator;

public class Lab052_Age_Classification {
    public static void main(String[] args) {
        int age = 15;
        String s1= (age>18)?(age>65)?"senior citizen":"Adult":"minor";
        System.out.println(s1);
    }
}
