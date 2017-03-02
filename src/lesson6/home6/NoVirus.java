package lesson6.home6;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Света on 02.03.2017.
 */
public class NoVirus {

    public static void main(String[] args) {
        File words = new File("res/words");
        ArrayList<String> wordsList = new ArrayList<>();

        try(BufferedReader buf = new BufferedReader(new FileReader(words))) {
            final StreamTokenizer tokenizer =new StreamTokenizer(buf);
            while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
                if (tokenizer.ttype == StreamTokenizer.TT_WORD) {
                    wordsList.add(tokenizer.sval);
                }
            }
                System.out.println(wordsList);
        } catch (IOException e){
            e.printStackTrace();
        }

        for (int i =0; i< wordsList.size();i++){
            wordsList.remove("virus");
        }
        System.out.println(wordsList);
        String noVirus = wordsList.toString();

        try (FileWriter fileWriter = new FileWriter(words)) {
            fileWriter.write(noVirus);
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
