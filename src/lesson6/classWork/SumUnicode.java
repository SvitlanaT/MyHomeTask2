package lesson6.classWork;

/**
 * @author Света on 28.02.2017.
 */
public class SumUnicode {

   private static String[] mass = {"Summer", "Spring", "Winter"};

    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        for (String s : mass) {
            build.append(s);
        }
        char[] chars = build.toString().toCharArray();
        int sum=0;
        for (char c : chars) {
           sum +=(int)c;
        }
        System.out.println(sum);
    }

}
