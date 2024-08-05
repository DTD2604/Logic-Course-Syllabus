import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> permutations = permute(str);
        System.out.println("Permutations of " + str + ": " + permutations);
    }

    public static List<String> permute(String str) {
        List<String> result = new ArrayList<>();
        if (str.isEmpty()) {
            result.add("");
            return result; // Điểm dừng
        }
        char firstChar = str.charAt(0);
        String remainingString = str.substring(1);
        List<String> words = permute(remainingString);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String permutation = word.substring(0, i) + firstChar + word.substring(i);
                result.add(permutation);
            }
        }
        return result;
    }
}
