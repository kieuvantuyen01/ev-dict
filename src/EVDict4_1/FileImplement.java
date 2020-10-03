package EVDict4_1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileImplement extends DictionaryData {
    

    public FileImplement(dictionaryType new_state) {
        if (new_state == dictionaryType.VE) {
            this.path = "src\\EVDict4_1\\V_E.txt";
            this.state = new_state;
        }
        readFile();
    }
    
    public void editInDict(String old_word, String new_word, String meaning) {
        addIntoDict(new_word, meaning);
        removeFromDict(old_word);
    }
    
    public void removeFromDict(String new_word) {
        int id_remove = word.indexOf(new_word);
        if (id_remove != -1) {
            word.remove(id_remove);
            DictData.remove(id_remove);
        }
    }
    
    public void addIntoDict(String new_word, String meaning) {
        word.add(new_word);
        Collections.sort(word);
        DictData.put(new_word, meaning); 
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));

            String line, new_word, meaning;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("<html>");
                new_word = parts[0];
                meaning = "<html>" + parts[1];
                word.add(new_word);
                DictData.put(new_word, meaning);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void updateFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));

        for (String new_word : word) {
            bw.write(new_word + DictData.get(new_word) + "\n");
        }
        bw.close();        
    }
}
