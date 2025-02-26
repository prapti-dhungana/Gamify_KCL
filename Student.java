import java.util.Objects;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student {
    private String name;
    private String username;
    private String password;
    private int points;
    private int level;

    public Student(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.points = 0;
        this.level = 1;
    }

    public String getName() { 
        return name; 
    }
    
    public int getLevel() {
        return level; 
    }
    
    public String getUsername() { 
        return username; 
    }
    
    public boolean checkPassword(String inputPassword) {
        return Objects.equals(this.password, inputPassword);
    }

    public void addPoints(int points) {
        this.points += points;
        if (this.points >= 100) { 
            level++;
            this.points = 0;
        }
    }

    @Override
    public String toString() {
        return name + " - Level " + level;
    }
}

