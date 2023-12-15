package lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.HashSet;


public class task2 {
    public static void main(String[] args) {
        String filePath = "Listofemployees.txt";

        HashSet<String> uniqueEmployeeSet = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                uniqueEmployeeSet.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number of unique employees: " + uniqueEmployeeSet.size());

        System.out.println("Contents using standard loop:");
        for (String employee : uniqueEmployeeSet) {
            System.out.println(employee);
        }

        System.out.println("\nContents using Iterator:");
        Iterator<String> iterator = uniqueEmployeeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}