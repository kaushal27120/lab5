package lab7;
import java.util.Scanner;
class Person {
    String surname;
    String firstName;
    String street;
    String zipCode;
    String city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter surname:");
        surname = scanner.nextLine();

        System.out.println("Enter first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter street:");
        street = scanner.nextLine();

        System.out.println("Enter zip code:");
        zipCode = scanner.nextLine();

        System.out.println("Enter city:");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Surname: " + surname);
        System.out.println("First Name: " + firstName);
        System.out.println("Street: " + street);
        System.out.println("Zip Code: " + zipCode);
        System.out.println("City: " + city);
    }
}

class Staff extends Person {
    String education;
    String position;

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter education:");
        education = scanner.nextLine();


        System.out.println("Enter position:");
        position = scanner.nextLine();
}

    public void print1() {
        print();
        if (education.equals("")) {
            System.out.println("Education: " + education + "None");
        }
        else {
            System.out.println("Education: " + education);
        }

        if (position.equals("")) {
            System.out.println("Position: " + position + "None");
        }
        else {
            System.out.println("Position: " + position);
        }
    }
}

public class task1 {
    public static void main(String[] args) {
        Staff staffMember = new Staff();
        staffMember.initialize1();
        staffMember.print1();
    }
}
