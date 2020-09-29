package EVDict4_1;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryData {
    /**
     * Tu dien Anh-Viet.
     */
    public HashMap<String, String> EVDict1 = new HashMap<>();
    public ArrayList<String> word_target1 = new ArrayList<>();

    public HashMap<String, String> getEVDict1() {
        return EVDict1;
    }

    public void setEVDict1(HashMap<String, String> EVDict1) {
        this.EVDict1 = EVDict1;
    }

    public ArrayList<String> getWord_target1() {
        return word_target1;
    }

    public void setWord_target1(ArrayList<String> word_target1) {
        this.word_target1 = word_target1;
    }

    /**
     * Tu dien Viet-Anh.
     */
    public HashMap<String, String> EVDict2 = new HashMap<>();
    public ArrayList<String> word_target2 = new ArrayList<>();

    public HashMap<String, String> getEVDict2() {
        return EVDict2;
    }

    public void setEVDict2(HashMap<String, String> EVDict2) {
        this.EVDict2 = EVDict2;
    }

    public ArrayList<String> getWord_target2() {
        return word_target2;
    }

    public void setWord_target2(ArrayList<String> word_target2) {
        this.word_target2 = word_target2;
    }
    
    
}
