package EVDict2;

import java.lang.reflect.Field;

public class DictionaryCommandLine {
    DictionaryManagement dict_man = new DictionaryManagement();
    public void showAllWords() {
        dict_man.show();
    }

    public void dictionaryBasic() {
        dict_man.insertFromCommandline();
        showAllWords();
    }

    public void dictionaryAdvanced() {
        dict_man.insertFromFile();
        showAllWords();
        dict_man.dictionaryLookup();
    }
}
