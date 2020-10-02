package EVDict;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;

public class DictionaryManagement {
    public String path = "C:\\Users\\Admin\\Desktop\\EVDict\\V_E.txt";
    public int check_language = 0;
    public HashMap<String, String> DictData = new HashMap<>();
    public ArrayList<String> word = new ArrayList<>();

    public DefaultListModel initDict() {
        DefaultListModel dfl = new DefaultListModel();
        for (String new_word: word) {
            dfl.addElement(new_word);
        }
        return dfl;
    }

    public ArrayList<String> searchWord(String wordSearch, ArrayList<String> words){
        ArrayList<String> listWord = new ArrayList();   
        int word_search_length = wordSearch.length();
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length() >= word_search_length) {
                if(words.get(i).substring(0, word_search_length).equals(wordSearch)) {
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