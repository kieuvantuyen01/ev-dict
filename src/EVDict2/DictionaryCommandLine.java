package EVDict2;

public class DictionaryCommandLine {
    DictionaryManagement dict_man = new DictionaryManagement();
    public void showAllWords() {
        dict_man.show();
    }

    public void dictionaryBasic() {
        dict_man.insertFromCommandline();
        showAllWords();
    }
}
