package ex_10_Forloop;

public class Lab0108_Loop_With_break {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            //System.out.println(i);
            if(i==10)
            {

                System.out.println("value"+i);
                break;
            }
            System.out.println(i);
        }

    }
}
