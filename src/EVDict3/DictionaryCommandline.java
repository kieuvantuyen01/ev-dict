package EVDict3;

public class DictionaryCommandline extends DictionaryManagement {

    /**
     * Methods are overridden from the class DictionaryManagement.
      */
    @Override
    
    public void showAllWords() {
        super.showAllWords();
    }
    
    public void dictionaryBasic() {
        super.insertFromCommandline();
        showAllWords();
    }
    
    public void dictionaryAdvanced() {
        super.insertFromFile();
        super.showAllWords();
        super.dictionaryLookup();
    }
}
