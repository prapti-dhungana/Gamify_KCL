import java.time.LocalDate;
/**
 * Write a description of class Attendance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Attendance
{
    private int streak;
    private LocalDate lastAttendanceDate;
    private Levels levels;
    /**
     * Constructor for objects of class Attendance
     */
    public Attendance()
    {
        Levels levels = new Levels();
    }

    private void logAttendance() {
        LocalDate today = LocalDate.now();
            if(lastAttendanceDate == null) {
                streak = 1;
            } else {
                if (lastAttendanceDate.plusDays(1).equals(today)) {
                    streak++;
                    levels.addPoints(5);
                } else if (!lastAttendanceDate.equals(today)) {
                    streak = 1;
                }
        }
    }

    private void viewStreak() {
        System.out.println("Current Streak: " + streak);
    }
}
