import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class leaderboard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Leaderboard {
    public void displayLeaderboard(HashMap<String, Student> students) {
        List<Student> sortedStudents = sortStudents(new ArrayList<>(students.values()));

        System.out.println("\nLeaderboard:");
        for (Student student : sortedStudents) {
            System.out.println(student);
        }
    }

    private List<Student> sortStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getLevel() < students.get(j).getLevel()) {
                    Student temp = students.get(i);
                    students.set(i, students.get(j));
                    students.set(j, temp);
                }
            }
        }
        return students;
    }
}

