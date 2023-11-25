
    import java.util.Scanner;

    public class WordCountAndReverse {
        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a sentence
            System.out.print("Enter a sentence: ");
            String inputSentence = scanner.nextLine();

            // Close the scanner to prevent resource leak
            scanner.close();

            // Count the number of words in the sentence
            int wordCount = countWords(inputSentence);

            // Print the number of words
            System.out.println("Number of words in the sentence: " + wordCount);

            // Print the reverse of the sentence
            String reversedSentence = reverseSentence(inputSentence);
            System.out.println("Reverse of the sentence: " + reversedSentence);
        }

        // Method to count the number of words in a sentence
        private static int countWords(String sentence) {
            // Split the sentence into words using space as the delimiter
            String[] words = sentence.split("\\s+");

            // Return the number of words
            return words.length;
        }

        // Method to reverse a sentence
        private static String reverseSentence(String sentence) {
            // Convert the sentence to a character array
            char[] sentenceChars = sentence.toCharArray();

            // Reverse the character array
            for (int i = 0, j = sentenceChars.length - 1; i < j; i++, j--) {
                char temp = sentenceChars[i];
                sentenceChars[i] = sentenceChars[j];
                sentenceChars[j] = temp;
            }

            // Convert the character array back to a string
            return new String(sentenceChars);
        }
    }


