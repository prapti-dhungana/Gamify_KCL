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
    // private int points;
    
    public int points = 0;
    private int currentLevel = 1;
    private int nextLevel;
    private int LEVEL_UP_POINTS = 100;
    private Attendance attendance;
    

    public Student(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        nextLevel = currentLevel + 1;
        attendance = new Attendance();
    }

    public String getName() { 
        return name; 
    }
    
    
    
    public String getUsername() { 
        return username; 
    }
    
    public boolean checkPassword(String inputPassword) {
        return Objects.equals(this.password, inputPassword);
    }

    
    public void checkAttendance(){
        if (attendance.getStreak() == 1){
            incrementPoints(5);
        }
        else if (attendance.getStreak() > 1){
            incrementPoints(10);
        }
    }
    
     public void incrementPoints(int xp) {
        if (!maxLevel()) {
            points += xp;
            levelUp();
        } else {
            points = points;
        }
    }

    private void levelUp() {
        if (getPoints() > LEVEL_UP_POINTS && !maxLevel()) {
            currentLevel = nextLevel;
            nextLevel = currentLevel + 1;
            points = 0;
            LEVEL_UP_POINTS += 25;
        } else if(maxLevel()) {
            System.out.println("Max Level");
        }
    }
    
    public int getPoints() {
        return points;
    }

    public int getLevel() {
        return currentLevel;
    }

    private void showLevel () {
        if (maxLevel()) {
            System.out.println("Max Level");
        }else {
            System.out.println("Level: " + currentLevel);
        }
    }

    private boolean maxLevel () {
        return getLevel() >= 100;
    }
    
    public Attendance getAttendance(){
        return attendance;
    }
}
