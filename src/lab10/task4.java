package lab10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class task4 {
    public static void main(String[] args) {
        String sourceFilePath = "studentsEN.txt";
        String destinationFilePath = "studentsGrade5.txt";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t");

                if (parts.length == 3) {
                    String firstName = parts[0];
                    String lastName = parts[1];

                    try {
                        int grade = Integer.parseInt(parts[2]);
                        if (grade == 5) {
                            writer.write(firstName + "\t" + lastName + "\t" + grade);
                            writer.newLine();
                        }
                    } catch (NumberFormatException e) {
                        System.err.println("Error parsing grade for: " + firstName + " " + lastName);
                    }
                }
            }

            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}