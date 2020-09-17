package EVDict2;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dict = new Dictionary();
    int nums;
    public void insertFromCommandline(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of words: ");
        nums = sc.nextInt();
        String s = sc.nextLine();
        dict.words = new Word[nums];
        System.out.println("Type list of words: ");
        for (int i = 0; i < nums; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            System.out.print("Meaning: ");
            String word_explain = sc.nextLine();
            dict.words[i] = new Word(word_target, word_explain);
        }
    }

    public void show() {
        System.out.println("No      |English        |Vietnamese");
        for (int i = 0; i < nums; i++) {
            System.out.println((i+1)+"          "+dict.words[i].getWord_target()+
                    "       |"+dict.words[i].getWord_explain());
        }
    }
}
