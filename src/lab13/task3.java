package lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class task3 {
    public static void main(String[] args) {

                String filePath = "Listofemployees.txt";

                TreeSet<String> sortedEmployeeSet = new TreeSet<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        sortedEmployeeSet.add(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Number of employees: " + sortedEmployeeSet.size());

                for (String employee : sortedEmployeeSet) {
                    System.out.println(employee);
                }
    }
}
