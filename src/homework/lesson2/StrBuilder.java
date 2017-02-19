package homework.lesson2;

/**
 * @author Света on 19.02.2017.
 */
public class StrBuilder {
    static String s1 = "Hello ";
    static String s2 = "my ";
    static String s3 = "name ";
    static String s4 = "is ";
    static String s5 = "your name ";
    static String s6 = "I ";
    static String s7 = "like ";
    static String s8 = "java ";


    public static void main(String[] args) {
        StringBuilder build = new StringBuilder();
        build.append(s1);
        build.append(s2);
        build.append(s3);
        build.append(s4);
        build.append(s5);
        build.append(s6);
        build.append(s7);
        build.append(s8);
        System.out.println(build.toString());
    }

}
