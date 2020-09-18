package EVDict3;

import java.util.Scanner;

public class DictionaryManagement {
    Dictionary dict = new Dictionary();
    int number_of_words;
    
    public void  insertFromCommandline() {
        Scanner sc = new Scanner(System.in);
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
        //TreeSet<Word> newDict = new TreeSet<Word>(dict.words);
        for (Word word_iterator : dict.words) {
            System.out.printf("%-4d |%-15s |%-15s%n", sequence_number+1,
                              word_iterator.getWord_target(), word_iterator.getWord_explain());
            sequence_number++;
        }
    }   
    
    public void insertFromFile() {
        
    }
    
    public void dictionaryLookup() {
        System.out.print("\n" + "Word you need to find: ");
        Scanner sc = new Scanner(System.in);
        String keyword_to_find = sc.next();
        int dictionary_iterator = 0;
        for (Word word_iterator : dict.words) {
            if (word_iterator.getWord_target().equals(keyword_to_find)) {
                System.out.println("Meaning: " + word_iterator.getWord_explain());
                break;
            }
            else {
               dictionary_iterator++; 
            }
        }
        if (dictionary_iterator == number_of_words) {
            System.out.println("Not have in our dict!!!");
        }
    }
    
    void addNewWord() {
        System.out.print("\n" + "Number of words added: ");
        Scanner sc = new Scanner(System.in);
        int number_of_words_added = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Type list of words: ");
        for(int i=0; i < number_of_words_added; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            System.out.print("Meaning: ");
            String word_explain = sc.nextLine();
            dict.words.add(new Word(word_target, word_explain));
        }
    }
    
    void deleteWord() {
        System.out.print("\n" + "Number of words deleted: ");
        Scanner sc = new Scanner(System.in);
        int number_of_words_deleted = sc.nextInt();
        String s = sc.nextLine();
        System.out.println("Type list of words: ");
        for(int i=0; i < number_of_words_deleted; i++) {
            System.out.print("Word_Target: ");
            String word_target = sc.nextLine();
            for (Word word_iterator : dict.words) {
                if(word_iterator.getWord_target().equals(word_target)) {
                    dict.words.remove(word_iterator);
                }
            }
        }
    }
    
    void fixWord() {
        
    }
    
    public void dictionarySearcher() {
        System.out.print("\n" + "Characters suggested: ");
        Scanner sc = new Scanner(System.in);
        String keyword_suggested = sc.next();
        System.out.println("The list of words begins with characters suggested: ");
        for (Word word_iterator : dict.words) {
            if (word_iterator.getWord_target().contains(keyword_suggested)) {
                System.out.print(word_iterator.getWord_target() + ", ");
            }
        }
        System.out.println();
    }     
}
