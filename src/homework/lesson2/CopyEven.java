package homework.lesson2;

import java.util.Arrays;

/**
 * @author Света on 16.02.2017.
 */
public class CopyEven {
    private int n=0;
    private int [] mas = {1,2,3,4,5,6,7};
    private int[] arr = new int[mas.length];
    private void findN(){

        for(int i=0;i<mas.length;i++){
            if (mas[i]%2==0& mas[i]!=0){
                arr[n]=mas[i];
                n++;
            }else {arr[n]=0; n++;}
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        CopyEven test = new CopyEven();
        test.findN();

    }

}
