package lesson4.homeWork;

import java.io.FileNotFoundException;
import java.io.IOError;

/**
 * @author Света on 23.02.2017.
 */
public class NumberExceptions {

    public static void main(String[] args) {

        try {
            numEx(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void numEx(int x) throws Exception{

        switch (x){
            case 1:
                throw new ClassNotFoundException("ClassNotFoundException");
            case 2:
                throw new FileNotFoundException("FileNotFoundException");
            case 3:
                throw new StackOverflowError("StackOverflowError");
        }
    }
}
