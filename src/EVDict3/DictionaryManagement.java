package EVDict3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dict = new Dictionary();
    int number_of_words;
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
            dict.words.add(new_word);
        }
    }

    public void showAllWords() {
        int sequence_number = 0;
        System.out.printf("%-4s |%-15s |%-15s%n", "No", "English", "Vietnamese");
        for (Word word_iterator : dict.words) {
            System.out.printf("%-4d |%-15s |%-15s%n", sequence_number + 1,
                    word_iterator.getWord_target(), word_iterator.getWord_explain());
            sequence_number++;
        }
    }

    public void insertFromFile() {
        ArrayList<String> list = new ArrayList<>();

        try {
            File file = new File("dictionaries.txt");
            Scanner input = new Scanner(file);
            String line;
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
        number_of_words = m / 2;
        for (int i = 0; i <= m - 2; i += 2) {
            String word_target = list.get(i);
            String word_explain = list.get(i + 1);
            dict.words.add(new Word(word_target, word_explain));
        }
    }

    public void dictionaryLookup() {
        System.out.print("\n" + "Word you need to find: ");
        String keyword_to_find = sc.next();
        int dictionary_iterator = 0;
        for (Word word_iterator : dict.words) {
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
            dict.words.add(new Word(word_target, word_explain));
        }
    }

    public void deleteWord() {
        System.out.print("Type the word you want to delete: ");
        String word_target = sc.nextLine();
        for (Word word_iterator : dict.words) {
            if (word_iterator.getWord_target().equals(word_target)) {
                dict.words.remove(word_iterator);
                break;
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
            for (Word word_iterator : dict.words) {
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
            for (Word word_iterator : dict.words) {
                if (word_iterator.getWord_target().equals(fix_word)) {
                    word_iterator.setWord_explain(new_meaning);
                    break;
                }
            }
        }
    }

    public void dictionarySearcher() {
        System.out.print("\n" + "Characters suggested: ");
        Scanner sc = new Scanner(System.in);
        String keyword_suggested = sc.next();
        int keyword_suggested_length = keyword_suggested.length();
        System.out.println("The list of words begins with characters suggested: ");
        for (Word word_iterator : dict.words) {
            String subWord = word_iterator.getWord_target().substring(0, keyword_suggested_length);
            if (subWord.equals(keyword_suggested)) {
                System.out.print(word_iterator.getWord_target() + ", ");
            }
        }
        System.out.println();
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
