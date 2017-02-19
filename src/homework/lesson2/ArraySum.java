package homework.lesson2;

import java.util.Random;

/**
 * @author Света on 19.02.2017.
 */
public class ArraySum {
    int finsum=0;
    int[] a;

    public static void main(String[] args) {

        ArraySum test = new ArraySum();
        test.sum(5);

    }
    private void sum(int n) {
        int[] a = new int[n];
        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
            System.out.println(a[i]);
        } sumRecursion (a);

//        for (int i = 0; i < a.length; i++) {
//            this.finsum = finsum + a[i];
//            }

//        for(int e :a){
//            this.finsum = finsum + e;
//        }

//        int w = 0;
//        while ( w < a.length){
//            this.finsum = finsum + a[w];
//            w++;
//        }

//        System.out.println(finsum);
    }
    int n =0;
    StringBuilder sumN = new StringBuilder();
    private void sumRecursion(int[]a){

        if (n<a.length-1){
            sumN.append(a[n]);
            n++;
            sumRecursion(a);

        }else {
            System.out.println(sumN);
        }
    }
}
