package EVDict;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DictionaryManagement {
    Dictionary dict = new Dictionary();
    int number_of_words;
    String path;
    Scanner sc = new Scanner(System.in);

    public void insertFromCommandline() {
        System.out.print("Number of words: ");
        number_of_words = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Type list of words: ");
        for (int i = 0; i < number_of_words; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            System.out.print("Meaning: ");
            String word_explain = sc.nextLine();
            Word new_word = new Word(word_target, word_explain);
            dict.wordsE_V.add(new_word);
        }
    }

    public void showAllWords() {
        int sequence_number = 0;
        System.out.printf("%-4s |%-15s |%-15s%n", "No", "English", "Vietnamese");
        for (Word word_iterator : dict.wordsE_V) {
            System.out.printf("%-4d |%-15s |%-15s%n", sequence_number + 1,
                    word_iterator.getWord_target(), word_iterator.getWord_explain());
            sequence_number++;
        }
    }
    
    public void insertFromFileV_E() {
        try {
            String line, word_target, word_explain;
            number_of_words = 0;
            path = "V_E.zip";
            FileInputStream file = new FileInputStream(path);
            ZipInputStream zipStream = new ZipInputStream(file);
            ZipEntry entry = zipStream.getNextEntry();      
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream,"utf-8"));   
            while ((line = reader.readLine()) != null) {
                int index = line.indexOf("<html>");

                if (index != -1) {
                    word_target = line.substring(0, index);
                    word_target = word_target.trim();
                    word_explain = line.substring(index);
                    dict.wordsV_E.add(new Word(word_target, word_explain));
                    number_of_words++;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void insertFromFileE_V() {
        try {
            String line, word_target, word_explain;
            number_of_words = 0;
            path = "E_V.zip";
            FileInputStream file = new FileInputStream(path);
            ZipInputStream zipStream = new ZipInputStream(file);
            ZipEntry entry = zipStream.getNextEntry();      
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream,"utf-8"));   
            while ((line = reader.readLine()) != null) {
                int index = line.indexOf("<html>");

                if (index != -1) {
                    word_target = line.substring(0, index);
                    word_target = word_target.trim();
                    word_explain = line.substring(index);
                    dict.wordsE_V.add(new Word(word_target, word_explain));
                    number_of_words++;
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void saveToBookmark(Word new_word) {
        System.out.println("Do you want to save to bookmark, Yes or No? Type [y]/[n]:");
        String answer = sc.next();
        if (answer.equals("y")) {
            try {
                FileWriter output = new FileWriter("Bookmark_Dict.txt", true);
                String line;
                line = new_word.getWord_target() + "  " + new_word.getWord_explain() + "\n";
                output.write(line);

                output.close();

                System.out.println("fn");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void dictionaryLookup() {
        System.out.print("\n" + "Word you need to find: ");
        String keyword_to_find = sc.next();
        int dictionary_iterator = 0;
        for (Word word_iterator : dict.wordsE_V) {
            if (word_iterator.getWord_target().equals(keyword_to_find)) {
                System.out.println("Meaning: " + word_iterator.getWord_explain());
                break;
            } else {
                dictionary_iterator++;
            }
        }
        if (dictionary_iterator == number_of_words) {
            System.out.println("Not have in our dict!!!");
        }
    }

    public void addNewWord() {
        System.out.print("\n" + "Number of words added: ");
        int number_of_words_added = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Type list of words: ");
        for (int i = 0; i < number_of_words_added; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            System.out.print("Meaning: ");
            String word_explain = sc.nextLine();
            dict.wordsE_V.add(new Word(word_target, word_explain));
        }
    }

    public void deleteWord() {
        System.out.print("\n" + "Number of words deleted: ");
        Scanner sc = new Scanner(System.in);
        int number_of_words_deleted = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Type list of words: ");
        for(int i=0; i < number_of_words_deleted; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            for (Word word_iterator : dict.wordsE_V) {
                if(word_iterator.getWord_target().equals(word_target)) {
                    dict.wordsE_V.remove(word_iterator);
                    break;
                }
            }
        }
    }

    public void fixWord() {
        System.out.println("What do you want to fix: Word or Meaning ? Type [w]/[m]:");
        String answer = sc.nextLine();
        while (!answer.equals("w") && !answer.equals("m")) {
            System.out.println("Please type again: ");
            answer = sc.nextLine();
        }

        if (answer.equals("w")) {
            System.out.println("Type the word you want to fix: ");
            String fix_word = sc.nextLine();
            System.out.println("Type the word you want to replace: ");
            String new_word = sc.nextLine();
            for (Word word_iterator : dict.wordsE_V) {
                if (word_iterator.getWord_target().equals(fix_word)) {
                    word_iterator.setWord_target(new_word);
                    break;
                }
            }
        }
        if (answer.equals("m")) {
            System.out.println("Type the word you want to fix its meaning: ");
            String fix_word = sc.nextLine();
            System.out.println("Type the meaning you want to replace: ");
            String new_meaning = sc.nextLine();
            for (Word word_iterator : dict.wordsE_V) {
                if (word_iterator.getWord_target().equals(fix_word)) {
                    word_iterator.setWord_explain(new_meaning);
                    break;
                }
            }
        }
    }
    
    public String[] dictionarySearcherV_E(String keyword_suggested) {
        int keyword_suggested_length = keyword_suggested.length();
        int iterator = 0;
        String[] word_Find = new String[100000];
        for (Word word_iterator : dict.wordsV_E) {
            if (word_iterator.getWord_target().length() >= keyword_suggested_length) {
                String subWord = word_iterator.getWord_target().substring(0, keyword_suggested_length);
                if (subWord.equals(keyword_suggested)) {
                    word_Find[iterator++] = word_iterator.getWord_target();
                }
            }
        }
        return word_Find;
    }
    
    public String[] dictionarySearcherE_V(String keyword_suggested) {
        int keyword_suggested_length = keyword_suggested.length();
        int iterator = 0;
        String[] word_Find = new String[100000];
        for (Word word_iterator : dict.wordsE_V) {
            if (word_iterator.getWord_target().length() >= keyword_suggested_length) {
                String subWord = word_iterator.getWord_target().substring(0, keyword_suggested_length);
                if (subWord.equals(keyword_suggested)) {
                    word_Find[iterator++] = word_iterator.getWord_target();
                }
            }
        }
        return word_Find;
    }
    
    public void dictionaryExportToFile() {
        try {
            FileWriter file_writer = new FileWriter("dictionaries2.txt");
            File file_dict = new File("dictionaries.txt");
            Scanner output = new Scanner(file_dict);
            String line;
            while (output.hasNextLine()) {
                line = output.nextLine();
                file_writer.write(line);
                file_writer.write("\n");
            }
            file_writer.close();
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}