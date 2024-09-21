package lista;
import java.util.List;

public class WordCounter {
    public static int countWordsStartingWith(List<String> words, char letter) {
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }
}
