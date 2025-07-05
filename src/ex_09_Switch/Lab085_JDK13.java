package ex_09_Switch;

public class Lab085_JDK13 {
    public static void main(String[] args) {
        int item_Code =001;
        switch (item_Code)
        {
            case 001,002,003:
                System.out.println("print all");
                break;
            case 004,005,006:
                System.out.println("print few");
                break;
            default:
                System.out.println("no print");
        }
    }
}
