package lesson4.classWork;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Света on 21.02.2017.
 */
public class MainException {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        dinNull(2,0);
//        try {
//            spectr();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            casting("abc");
//        } catch (NumberFormatException | IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("It's finally");
//        }
        askUser ();

    }

    private static void askUser() {

        try {

            System.out.println("Enter some number");
            int num = scan.nextInt();
            System.out.println(num);
        } catch (Exception e) {
            System.err.println("Wrong data");

        }askUser();
    }

    private static void checkAgain() {
        System.out.println("Something vent wrong");
    }

    private static void check() {
        System.out.println("wrong number");
    }

    private static void casting(String s) throws NumberFormatException, IOException {

        if (s == null) {
            throw new NumberFormatException("This is my error massage");
        } else if (s.equals("abc")) {
            throw new IOException("This is IOException massage");
        } else {
            System.out.println("Nothing");
        }

    }





//    private static void spectr() throws FileNotFoundException {
//        File f = new File("/");
//        new BufferedReader(new FileReader(f));
//    }
//
//    private static int dinNull(int a, int b) {
//        int c = 0;
//        try {
//            System.out.println("42");
//            c = a / b;
////            throw new ArithmeticException();
//        } catch (ArithmeticException e) {
////            System.out.println("b=0");
//            e.printStackTrace();
////        } finally {
////            System.out.println("THis will work anyway");
////
//        }
//        System.out.println("42");
//
//        return c;
//
//    }


}
