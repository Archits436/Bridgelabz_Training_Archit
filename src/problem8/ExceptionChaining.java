package problem8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChaining {
    public static void readFile(String filePath) throws Exception {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new Exception("An error occurred while reading the file", e);
        }
    }
}
