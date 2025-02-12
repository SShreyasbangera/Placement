/*Write a function to count the number of times each word appears in a given paragraph.

Input: "the cat and the hat"
Output: {"the": 2, "cat": 1, "and": 1, "hat": 1}*/

import java.util.*;

public class WordCount {
    public static Map<String, Integer> countWords(String paragraph) {
        Map<String, Integer> wordCount = new HashMap<>();
        
        String[] words = paragraph.toLowerCase().split("\\s+");
        
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", ""); // punctuation removal
            if (!word.isEmpty() && wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word)+1);
            }
            else if(!word.isEmpty()){
                wordCount.put(word,1);
            }
        }
        
        return wordCount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String paragraph = sc.nextLine();

        Map<String, Integer> result = countWords(paragraph);
        System.out.println(result);
    }
}