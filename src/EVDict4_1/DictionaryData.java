package EVDict4_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;

public class DictionaryData {
    public String path = "src\\EVDict4_1\\E_V.txt";
    public int state = 0;

    public HashMap<String, String> DictData = new HashMap<>();
    public ArrayList<String> word = new ArrayList<>();
    
    public ArrayList<String> recentWord = new ArrayList<>();
    public ArrayList<String> markedWord = new ArrayList<>();

    public ArrayList<String> getRecentWord() {
        return recentWord;
    }

    public void setRecentWord(ArrayList<String> recentWord) {
        this.recentWord = recentWord;
    }
    
    public void removeInList(ArrayList<String> list, String new_word) {
        int id_remove = list.indexOf(new_word);
        list.remove(list.get(id_remove));
    }
    
    public void readFromFile(ArrayList<String> list, String new_path) {
        try {
            FileReader fis = new FileReader(new_path);
            BufferedReader br = new BufferedReader(fis);

            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void readToFile(ArrayList<String> list, String new_path) throws IOException {
        FileOutputStream fos = new FileOutputStream(new_path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));

        for (String new_word : list) {
            bw.write(new_word + "\n");
        }
        bw.close();
    }
    
    public void saveToRencent(String new_word) {
        recentWord.add(new_word);
        if (recentWord.size() > 50) {
            recentWord.remove(recentWord.get(0));
        }
    }
    
    public void saveToBookmark(String newWord) {
        markedWord.add(newWord);
        if (markedWord.size() > 50) {
            markedWord.remove(markedWord.get(0));
        }
    }
    
    public DefaultListModel initRecentList(ArrayList<String> list) {
        DefaultListModel dfl = new DefaultListModel();
        for(String new_word: list) {
            dfl.addElement(new_word);
        }
        return dfl;
    }
    
    public DefaultListModel initDict() {
        DefaultListModel dfl = new DefaultListModel();
        for(String new_word: word) {
            dfl.addElement(new_word);
        }
        return dfl;
    }

    public ArrayList<String> searchWord(String wordSearch, ArrayList<String> words){
        ArrayList<String> listWord = new ArrayList();   
        int len = wordSearch.length();
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).length() >= len) {
                if(words.get(i).substring(0, len).equals(wordSearch)) {
                    listWord.add(words.get(i));
                }
            }
        }
        return listWord;
    } 
    
    public HashMap<String, String> getDictData() {
        return DictData;
    }

    public void setDictData(HashMap<String, String> DictData) {
        this.DictData = DictData;
    }

    public ArrayList<String> getWord() {
        return word;
    }

    public void setWord(ArrayList<String> word) {
        this.word = word;
    }
}
