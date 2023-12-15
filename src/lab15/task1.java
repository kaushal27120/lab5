package lab15;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
class Student {
    private String name;
    private String surname;
    private int score;

    public Student(String name, String surname, int score) {
        this.name = name;
        this.surname = surname;
        this.score = score;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", score=" + score +
                '}';
    }
}

public class task1 {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        fillTheList(students);

        // Stream 1: Find students with a grade of 5 and print them on the console
        System.out.println("Students with a grade of 5:");
        students.stream()
                .filter(student -> student.getScore() == 5)
                .forEach(System.out::println);

        // Stream 2: Calculate the average of all students' grades
        double averageScore = students.stream()
                .mapToInt(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage score of all students: " + averageScore);

        // Stream 3: Calculate how many students we have with a grade of 5
        long countOfStudentsWithGrade5 = students.stream()
                .filter(student -> student.getScore() == 5)
                .count();
        System.out.println("\nNumber of students with a grade of 5: " + countOfStudentsWithGrade5);
    }

    static void fillTheList(ArrayList<Student> students) {
        try (BufferedReader reader = new BufferedReader(new FileReader("studentsEN.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s");
                if (parts.length == 3) {
                    String surname = parts[0].trim();
                    String name = parts[1].trim();
                    int score = Integer.parseInt(parts[2].trim());
                    students.add(new Student(name, surname, score));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}