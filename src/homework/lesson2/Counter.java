package homework.lesson2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Света on 16.02.2017.
 */
public class Counter {
    private int e;
    private int ne;
    private void count(int counter) {
        int[] mas = new int[counter];

        Random r = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = 1+r.nextInt(100);
            if (mas[i] % 2 == 0) {
                e++;
            } else {
                ne++;
            }}

            int[] ev = new int[e];
        int[] nev = new int[ne];

        for (int ma : mas) {
            if (ma % 2 == 0) {

            }
        }

        int indexE=0;
        int indexNE=0;
        for (int ma : mas) {
            if (ma % 2 == 0) {
                ev[indexE] = ma;
                indexE++;
            } else {

                nev[indexNE] = ma;
                indexNE++;
            }
        }
                System.out.println(Arrays.toString(mas));
                System.out.println(Arrays.toString(ev));
                System.out.println(Arrays.toString(nev));
            }

    public static void main(String[] args) {
        Counter n = new Counter();
        n.count(5);
    }

}
