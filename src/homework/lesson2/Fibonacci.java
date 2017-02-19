package homework.lesson2;

/**
 * @author Света on 15.02.2017.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int sum = 2;
        int f2 = 1;
        int f1 = 1;
        while (sum < 100)
        {   f1=f2;
            f2=sum;
            sum=f1+f2;
            System.out.println(f1);
        }
    }
}
