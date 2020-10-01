package EVDict4_1;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;

public class DictionaryData {
    public String path = "src\\EVDict4_1\\E_V.txt";
    public int state = 0;

    public HashMap<String, String> DictData = new HashMap<>();
    public ArrayList<String> word = new ArrayList<>();
    
    public DefaultListModel initDict() {
        DefaultListModel dfl = new DefaultListModel();
        for(String new_word: word) {
            dfl.addElement(new_word);
        }
        return dfl;
    }

    public ArrayList<String> searchWord(String wordSearch, ArrayList<String> words){
        ArrayList<String> listWord = new ArrayList();
        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).length() >= wordSearch.length()) {
                if(words.get(i).substring(0, wordSearch.length()).equals(wordSearch)) {
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
