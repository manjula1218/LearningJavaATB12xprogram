package ex_08_If_Condition;

public class Lab074_Task_Ternary {
    public static void main(String[] args) {

       int n1 = Integer.parseInt(args[0]);
       int n2 = Integer.parseInt(args[1]);
       int n3 = Integer.parseInt(args[2]);

 String s1 =((n1==n2)&&(n2==n3))?"acute angles":((n1==n2)||(n2==n3))?"Isosceles angles":"scalene angle";
        System.out.println(s1);
}}
