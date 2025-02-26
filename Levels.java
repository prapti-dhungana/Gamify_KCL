
/**
 * Write a description of class Levels here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Levels
{
    // instance variables - replace the example below with your own
    public int points = 0;
    private int currentLevel = 1;
    private int nextLevel;
    private int LEVEL_UP_POINTS = 100;

    /**
     * Constructor for objects of class Levels
     */
    public Levels()
    {
        nextLevel = currentLevel + 1;
    }

    //need to add correctAnswer call
    public void addPoints(int xp) {
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
}