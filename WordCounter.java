import java.util.Scanner;

public class WordCounter {
    
    // Method to get sentence input from the user
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close(); // Close scanner to avoid memory leaks
        return sentence;
    }

    // Method to count the number of words in a given sentence
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0; // Return 0 for empty or null input
        }
        String[] words = sentence.trim().split("\\s+"); // Split by spaces (handles multiple spaces)
        return words.length;
    }

    // Main method to execute the program
    public static void main(String[] args) {
        String sentence = getSentenceInput(); // Get user input
        int wordCount = countWords(sentence); // Count words
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
