import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    /**
     * Demonstrates Java text file input/output operations.
     *
     * Files in this folder:
     * - data.txt   : source/input text file
     * - output.txt : destination/output text file
     */
    public static void main(String[] args) {
        // -------------------------------
        // 1) FileReader (unbuffered read)
        // -------------------------------
        // Reads one character at a time.
        // Good for understanding basics, but slower for larger files.
        // try {
        //     FileReader fileReader = new FileReader("data.txt");
        //     int characterCode = fileReader.read();
        //
        //     while (characterCode != -1) {
        //         char character = (char) characterCode;
        //         System.out.print(character);
        //         characterCode = fileReader.read();
        //     }
        //
        //     fileReader.close();
        // } catch (IOException e) {
        //     System.out.println("An error occurred: " + e.getMessage());
        // }

        // -------------------------------------
        // 2) BufferedReader (buffered line read)
        // -------------------------------------
        // Wraps FileReader and reads line by line.
        // Faster and more convenient for text processing.
        // try {
        //     BufferedReader bufferedReader = new BufferedReader(
        //         new FileReader("data.txt")
        //     );
        //
        //     String line = bufferedReader.readLine();
        //     while (line != null) {
        //         System.out.println(line);
        //         line = bufferedReader.readLine();
        //     }
        //
        //     bufferedReader.close();
        // } catch (IOException e) {
        //     System.out.println("An error occurred: " + e.getMessage());
        // }

        // ---------------------------------
        // 3) FileWriter (unbuffered write)
        // ---------------------------------
        // Overwrites output.txt by default.
        // try {
        //     FileWriter fileWriter = new FileWriter("output.txt");
        //     fileWriter.write("Hello, this is a test.\n");
        //     fileWriter.write("This is the second line.");
        //     fileWriter.close();
        // } catch (IOException e) {
        //     System.out.println("An error occurred: " + e.getMessage());
        // }

        // ----------------------------------------
        // 4) BufferedWriter (buffered + append mode)
        // ----------------------------------------
        // new FileWriter("output.txt", true) enables append mode.
        // Data is added at the end instead of replacing old content.
        try {
            BufferedWriter bw = new BufferedWriter(
                new FileWriter("output.txt", true)
            );

            bw.newLine();
            bw.write("Hello, this is a test. from BufferedWriter\n");
            bw.write("This is the second line.");

            bw.close();
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}