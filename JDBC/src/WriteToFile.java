import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the text to write into the file:");

        String data = userInput.nextLine();
        userInput.close();

        try {
            File file = new File("C:\\Users\\NIKHITHA REDDY\\Desktop\\gnits\\sample1.txt");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.write(data);

            writer.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}