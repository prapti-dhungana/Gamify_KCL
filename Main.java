
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Leaderboard leaderboard = new Leaderboard();
        Scanner scanner = new Scanner(System.in);

        database.registerStudent("Alice", "alice123", "pass1");
        database.registerStudent("Bob", "bob123", "pass2");

        System.out.print("\nEnter username: ");
        String username = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();

        Student student = database.login(username, password);

        if (student != null) {
            System.out.println("Welcome, " + student.getName() + "!");
            student.addPoints(120);  // Example of earning points and leveling up
        }

        leaderboard.displayLeaderboard(database.getStudents());
    }
}
