package english_dictionary;
import java.util.TreeSet;

public class Dictionary {
    TreeSet<Word> words = new TreeSet<Word>(Word::compare);   
}