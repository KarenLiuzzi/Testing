import java.util.Scanner;

public class Task1 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("############### MentorMarkers Corp. ###############");

        System.out.println("Insert your First Name: ");
        String firstName = scanner.nextLine();

        System.out.println("Insert your Last Name:");
        String lastName = scanner.nextLine();

        int age = -1;
        do {
            System.out.println("Insert your Age (0..100): ");
            age = scanner.nextInt();
            if (age <= -1 || age > 100) {
                System.out.println("Age should be between 0 and 100. Try again!");
            };
        } while (age <= -1 || age > 100);

        int employeeNumber = -1;
        do {
            System.out.println("Insert your Employee number (27560000...27569999): ");
            employeeNumber = scanner.nextInt();
            if (employeeNumber < 27560000 || employeeNumber > 27569999) {
                System.out.println("Employee number should be between 27560000 and 27569999. Try again!");
            };
        } while (employeeNumber < 27560000 || employeeNumber > 27569999);

        String email = firstName.toLowerCase().trim()
                     + "."
                     + lastName.toLowerCase().trim()
                     + "@mentormakers.com";

        System.out.printf(
                "First Name: %s\nLast Name: %s \nAge: %d \nEmployee number: %d \nEmail: %s",
                firstName, lastName, age, employeeNumber, email
        );
        System.out.println("\n");
    }
}
