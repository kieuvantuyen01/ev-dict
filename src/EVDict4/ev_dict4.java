package EVDict4;

public class ev_dict4 {
    
    /**
     * Ham test ket qua.
     * @param args tra ve ket qua.
     */
    
    public static void main(String[] args) {
        DictionaryCommandline dictionary_cmd = new DictionaryCommandline();    
        dictionary_cmd.dictionaryAdvanced();
        dictionary_cmd.dictionarySearcher();
        dictionary_cmd.addNewWord();
        dictionary_cmd.deleteWord(); 
        dictionary_cmd.showAllWords();
        dictionary_cmd.dictionaryExportToFile(); 
    } 
}