package ex_06_TernaryOperator;

public class Lab057_Cmd_arg {
    public static void main(String[] args) {
        //int age=20;
        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
        System.out.println(age);

        String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);
        String s1 = args[0];
        String s2 = args[1];
        String s3 = args[2];
        String s4 = args[3];
        int age1 = Integer.parseInt(s1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);


    }
}
