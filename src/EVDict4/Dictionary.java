package EVDict4;
import java.util.TreeSet;

public class Dictionary {
    TreeSet<Word> words = new TreeSet<Word>(Word::compare);   

    public TreeSet<Word> getWords() {
        return words;
    }

    public void setWords(TreeSet<Word> words) {
        this.words = words;
    }
    
}