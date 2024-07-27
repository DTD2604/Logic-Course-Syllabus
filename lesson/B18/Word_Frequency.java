import java.util.HashMap;

public class WordFrequency {
    public static void countWordFrequency(String str) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = str.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }

    public static void main(String[] args) {
        String str = "This is a test. This test is only a test.";
        countWordFrequency(str);
    }
}
