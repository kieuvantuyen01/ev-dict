package EVDict;
import java.util.TreeSet;

public class Dictionary {
    TreeSet<Word> wordsE_V = new TreeSet<Word>(Word::compare);   
    TreeSet<Word> wordsV_E = new TreeSet<Word>(Word::compare);   
}