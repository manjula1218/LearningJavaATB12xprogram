package ex_06_TernaryOperator;

public class Lab055_Max_Three {
    public static void main(String[] args) {
        int n1= 10;
        int n2= 20;
        int n3= 30;
        int c = (n1>n2)? (n1>n3)? n1:n3:(n2>n3)?n2:n3;


        System.out.println(c);
    }
}
