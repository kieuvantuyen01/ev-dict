package EVDict4_1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileImplement extends DictionaryData {

    public FileImplement(String path, int state) {
        readFile(path, state);
    }

    public void readFile(String path, int state) {
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
                if (state == 0) {
                    word_target1.add(word);
                    EVDict1.put(word, meaning);
                } else if (state == 1) {
                    word_target2.add(word);
                    EVDict2.put(word, meaning);
                }
                wordsNum++;
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
