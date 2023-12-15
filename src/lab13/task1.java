package lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class task1 {
    public static void main(String[] args) {
                String filePath = "Listofemployees.txt";

                ArrayList<String> employeeList = new ArrayList<>();

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        employeeList.add(line);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

                System.out.println("Size of the collection: " + employeeList.size());

                System.out.println("\nusing standard loop:");
                for (int i = 0; i < employeeList.size(); i++) {
                    System.out.println(employeeList.get(i));
                }

                System.out.println("\nusing for-each loop:");
                for (String employee : employeeList) {
                    System.out.println(employee);
                }

                System.out.println("\nusing Iterator:");
                Iterator<String> iterator = employeeList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }
    }
}
