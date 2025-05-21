package ex_06_TernaryOperator;

public class Lan053_InterviewQa8 {
    public static void main(String[] args) {
        int age = 29;

       // String s = "you can not go goa";
        String s1 = age>25? (age>30? "In goa, you can drink":"you can't drink"):"you can not go goa";
        System.out.println(s1);

        int number = 17;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);
    }
}
