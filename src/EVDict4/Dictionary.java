package EVDict4;

import java.util.TreeSet;

public class Dictionary {
    TreeSet<Word> words = new TreeSet<Word>(Word::compare);
}
