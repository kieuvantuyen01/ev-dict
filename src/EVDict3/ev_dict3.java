package EVDict3;

public class ev_dict3 {

    /**
     * Method test the result.
     *
     * @param args are the list of the parameters passed.
     */

    public static void main(String[] args) {
        DictionaryCommandline dict_cmd = new DictionaryCommandline();
        /*dict_cmd.dictionaryBasic();
        dict_cmd.dictionaryLookup();
        dict_cmd.dictionarySearcher();*/
        dict_cmd.dictionaryAdvanced();
        dict_cmd.saveToBookmark(new Word("Hanoi", "thu do"));
        dict_cmd.saveToBookmark(new Word("car", "xe o to"));
//        dict_cmd.addNewWord();
//        dict_cmd.deleteWord();
//        dict_cmd.showAllWords();
//        dict_cmd.dictionaryExportToFile();
    }
}
