package EVDict;

public class DictionaryCommandline extends DictionaryManagement {
    
    /** 
     * hàm override lại phương thức của lớp DictionaryManagement
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
        super.showAllWords();
        super.dictionaryLookup();
    }
    
}