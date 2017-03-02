package lesson6.home6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Света on 01.03.2017.
 */
public class Virus {

    public static void main(String[] args) {
        File words = new File("res/words");
        try (FileWriter fileWriter = new FileWriter(words, true)) {
            fileWriter.write(" virus bacteria virus  virus virus ");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
