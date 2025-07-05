package ex_07_Increment_Decrement_Operator;

public class Lab068_Task3 {
    public static void main(String[] args) {
        int i = 1;
        int j= 2;
        int k=3;
        int m= i-- - j-- - k--;
        System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);
        //i-- now i value is1 and then o
        //-j -- now jisvalue is 2 and then 1
        //-k-- now k is 3 and then 2
        //now m =1-2-3 ans -4
    }
}
