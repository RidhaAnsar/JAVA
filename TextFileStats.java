import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileStats {
    public static void main(String[] args) {
        String filename = "input.txt"; // Change this to the name of your text file

        int charCount = 0;
        int lineCount = 0;
        int wordCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                // Splitting the line into words based on whitespace
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
    }
}
