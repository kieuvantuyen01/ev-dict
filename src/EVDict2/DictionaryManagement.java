package EVDict2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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

    public void insertFromFile() {
        /*FileDict file = new FileDict();
        file.WriteAFile();
        file.ReadAndWrite();
        ArrayList<String> list = new ArrayList<String>();
        file.TextFile(list);*/
        ArrayList<String> list = new ArrayList<String>();

        try {
              File file = new File("dictionaries.txt");
            Scanner input = new Scanner(file);
            String line = null;
            while (input.hasNextLine()) {
                line = input.nextLine();
                String[] results = line.split("	");
                for (String temp : results) {
                    list.add(temp);
                }
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int m = list.size();
        nums = m/2;
        int index = 0;
        dict.words = new Word[nums];
        for (int i = 0; i <= m-2; i+=2) {
            String word_target = list.get(i);
            String word_explain = list.get(i+1);
            dict.words[index] = new Word(word_target, word_explain);
            index++;
        }
    }

    public void dictionaryLookup() {
        System.out.println("Word you need find: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int t = 0;
        for (int i = 0; i < nums; i++) {
            if (dict.words[i].getWord_target().equals(s)) {
                System.out.println("Meaning: " + dict.words[i].getWord_explain());
                break;
            }
            else t++;
        }
        if (t == nums) {
            System.out.println("Not have in our dict!!!");
        }
    }
}