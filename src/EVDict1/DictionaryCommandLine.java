package EVDict1;

public class DictionaryCommandLine {
    DictionaryManagement dict_man = new DictionaryManagement();

    public void showAllWords() {
        System.out.println("No      |English        |Vietnamese");
        for (int i = 0; i < dict_man.nums; i++) {
            System.out.println((i + 1) + "          " + dict_man.dict.words[i].getWord_target() +
                    "       |" + dict_man.dict.words[i].getWord_explain());
        }
    }

    public void dictionaryBasic() {
        dict_man.insertFromCommandline();
        showAllWords();
    }
}
