package lista;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = WordCounterHelper.getWords();
        char letter = 'e';
        int count = WordCounter.countWordsStartingWith(words, letter);
        System.out.println("Número de palabras que comienzan con '" + letter + "': " + count);
    }
}
