package lesson5.classWork;

import java.io.*;

/**
 * @author Света on 23.02.2017.
 */
public class Read {

    public static void main(String[] args) {

        File text = new File("res/file.txt");

//        try (FileWriter fileWriter = new FileWriter(text, true)){
//            fileWriter.write("shfjahsjkh");
//            fileWriter.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(text, true))) {
//            writer.write("Rrrrrrrr");
//            writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try(FileReader reader = new FileReader(text)){


            int r;
            while ((r = reader.read()) != -1) {
                System.out.print((char)r);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (BufferedReader readThis = new BufferedReader(new FileReader(text))) {
            String data;
            while ((data = readThis.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
