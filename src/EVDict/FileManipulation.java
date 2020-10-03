package EVDict;

import java.io.*;
import java.util.Collections;
import java.util.Scanner;

public class FileManipulation extends DictionaryManagement {
    int number_of_word;
    
    public FileManipulation() {}
    
    public FileManipulation(int new_check_language) {
        if (new_check_language == 1) {
            this.path = "src\\EVDict\\E_V.txt";
            this.check_language = new_check_language;
        }
        readFile();
    }
    
    public void removeFromDict(String word_removed) {
        int id_removed = word.indexOf(word_removed);
        if (id_removed != -1) {
            word.remove(id_removed);
            DictData.remove(id_removed);
        }
    }
    public void editInDict(String old_word, String new_word, String meaning) {
        addIntoDict(new_word, meaning);
        removeFromDict(old_word);
    }
    
    public void addIntoDict(String word_added, String meaning) {
        word.add(word_added);
        Collections.sort(word);
        DictData.put(word_added, meaning); 
    }

    public void readFile() {
        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));

            number_of_word = 0;
            String line, new_word, meaning;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("<html>");
                new_word = parts[0];
                meaning = "<html>" + parts[1];
                word.add(new_word);
                DictData.put(new_word, meaning);
                number_of_word++;
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
    
    public String[] insertGuide() {
        int iterator = 0;
        String[] dictionaries_guide = new String[100];
        try {
            File file = new File("guide.txt");
            Scanner input = new Scanner(file);
            String line;
            while (input.hasNextLine()) {
                line = input.nextLine();
                dictionaries_guide[iterator++] = line;
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dictionaries_guide;
    }
}
