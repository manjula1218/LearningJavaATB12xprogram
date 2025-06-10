package ex_13_Functions;

public class Lab0126_WR_WP {
    public static void main(String[] args) {
        int sum = f1(5,6);
        int sum2 = f1(10,20);
        System.out.println(sum);
        System.out.println(sum2);

    }

    static int f1(int a, int b)
    {
        return a+b;
    }
}
