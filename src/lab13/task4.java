package lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class task4 {
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

            System.out.println("Number of employees: " + employeeList.size());

            Collections.sort(employeeList, Collections.reverseOrder());


            System.out.println("Contents in reverse order:");
            for (String employee : employeeList) {
                System.out.println(employee);
            }
        }
}

