import java.util.HashMap;

/**
 * Write a description of class StudentDatabase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDatabase {
    private HashMap<String, Student> students = new HashMap<>();

    public boolean registerStudent(String name, String username, String password) {
        if (students.containsKey(username)) {
            System.out.println("Username already taken.");
            return false;
        }
        students.put(username, new Student(name, username, password));
        return true;
    }

    public Student login(String username, String password) {
        if (students.containsKey(username)) {
            Student student = students.get(username);
            if (student.checkPassword(password)) {
                return student;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }
}

