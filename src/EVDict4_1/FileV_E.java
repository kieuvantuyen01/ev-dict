package EVDict4_1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileV_E extends DictionaryData {

    public FileV_E() {
        readFile();
    }

    String path = "src\\EVDict4_1\\V_E.zip";

    public void readFile() {


        try {
            FileInputStream file = new FileInputStream(path);
            ZipInputStream zipStream = new ZipInputStream(file);
            ZipEntry entry = zipStream.getNextEntry();

            BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream, "utf-8"));

            String line, word, meaning;
            int wordsNum = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("<html>");
                word = parts[0];
                meaning = "<html>" + parts[1];                   
                word_target1.add(word);
                EVDict1.put(word, meaning);
                wordsNum++;
            }
            reader.close();

            System.out.println("Số lượng từ Viet-Anh " + wordsNum + " words");


        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
