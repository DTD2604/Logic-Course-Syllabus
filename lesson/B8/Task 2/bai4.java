import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String text = "hello world hello";
        Map<String, Integer> wordCount = countWords(text);
        System.out.println("Word count: " + wordCount);
    }

    public static Map<String, Integer> countWords(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        return wordMap;
    }
}
