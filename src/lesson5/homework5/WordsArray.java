package lesson5.homework5;

import java.io.*;

/**
 * @author Света on 25.02.2017.
 */
public class WordsArray {

    public static void main(String[] args) {

        File words = new File("res/words");
        File file = new File("res/file.txt");
        int numberOfWords = 0;
        String [] wordsArray = new String[5];
          try(BufferedReader buf = new BufferedReader(new FileReader(words))) {
            final StreamTokenizer tokenizer =new StreamTokenizer(buf);
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    wordsArray[numberOfWords] = tokenizer.sval;
                    System.out.println(tokenizer.sval);
                    numberOfWords++;
                }

            }
              for (String e : wordsArray) {
                  System.out.println(e);
              }

                  } catch (IOException e){
           e.printStackTrace();
        }

        try (FileWriter fileWriter = new FileWriter(file, true)) {

            for (int i = 4; i >= 0; i--)
                fileWriter.write(wordsArray[i] + " ");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileReader reader = new FileReader(words)) {

            int r;
            int sum = 0;
            while ((r = reader.read()) != -1) {
                System.out.println(r);
                sum = sum + r;
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
