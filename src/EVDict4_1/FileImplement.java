package EVDict4_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class FileImplement extends DictionaryData {


    public FileImplement(int new_state) {
        if (new_state == 1) {
            this.path = "src\\EVDict4_1\\V_E.txt";
            this.state = new_state;
        }
        readFile();
    }

    public void editInDict(String old_word, String new_word, String meaning) {

        //System.out.println("Số lượng từ sau khi thêm là: " + DictData.size());
        removeFromDict(old_word);
        addIntoDict(new_word, meaning);
        //System.out.println("Số lượng từ sau khi xoá là: " + DictData.size());
    }

    public void removeFromDict(String new_word) {
        int id_remove = word.indexOf(new_word);
        if (id_remove != -1) {
            word.remove(new_word);
            DictData.remove(new_word);
            System.out.println("Số lượng từ sau khi xoá là: " + word.size());
        }
    }

    public void addIntoDict(String new_word, String meaning) {
        word.add(new_word);
        Collections.sort(word);

        DictData.put(new_word, meaning);
        System.out.println(word.contains(new_word));
        System.out.println("Số lượng từ sau khi thêm là: " + DictData.size());
    }

    public void readFile() {

        try {
            FileReader fis = new FileReader(path);
            BufferedReader br = new BufferedReader(fis);

            String line, new_word, meaning;
            int wordsNum = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("<html>");
                if (parts.length == 2) {
                    new_word = parts[0];
                    meaning = "<html>" + parts[1];
                    word.add(new_word);
                    DictData.put(new_word, meaning);
                    wordsNum++;
                }
            }
            br.close();
            System.out.println("Số lượng từ của từ điển là: " + DictData.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateFile() throws IOException {
        /*BufferedWriter writer = Files.newBufferedWriter(Paths.get(path));
        writer.write("");
        writer.flush();*/
        FileWriter fos = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fos);
        //System.out.println(word.get(0));
        for (String new_word : word) {
            bw.write(new_word + DictData.get(new_word) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
