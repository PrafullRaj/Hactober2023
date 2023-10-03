import java.util.Scanner;

public class SentenceReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String reversedSentence = reverseSentence(sentence);

        System.out.println("Reversed sentence: " + reversedSentence);

        scanner.close();
    }

    public static String reverseSentence(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();

        // Reverse and append each word to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }

        return reversed.toString();
    }
}
