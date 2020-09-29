package EVDict4_1;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryData {
    /**
     * Tu dien Anh-Viet.
     */
    public HashMap<String, String> EVDict = new HashMap<>();
    public ArrayList<String> word = new ArrayList<>();

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
    
    public HashMap<String, String> getEVDict() {
        return EVDict;
    }

    public void setEVDict(HashMap<String, String> EVDict) {
        this.EVDict = EVDict;
    }

    public ArrayList<String> getWord_target() {
        return word;
    }

    public void setWord_target(ArrayList<String> word) {
        this.word = word;
    }
}
