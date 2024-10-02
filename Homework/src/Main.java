import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my Java Program! ;)");

        System.out.println("""
            Which Program do you want to run first?:
            - Type 1 to execute "MentorMarkers Corp."
            - Type 2 to execute "Monthly payment of a lease"
            Enter your value (0 to finish):
            """);

        int value = -1;

        do {
            if (value != -1) {
                System.out.println("""
                    Which Program do you want to run first?:
                    Type 1 to execute "MentorMarkers Corp."
                    Type 2 to execute "Monthly payment of a lease"
                    Enter your value (0 to finish):
                    """);
            }

            value = scanner.nextInt();
            switch (value){
                case 1:
                    Task1.start();
                    break;
                case 2:
                    Task2.start();
                    break;
                default:
                    System.out.println("Please type only the next options (1, 2, 0)");
                    break;
            }
        } while (value != 0);

        System.out.println("Good bye!");
        scanner.close();
    }
}
