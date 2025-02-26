


public class Battle {

    public enum GameResult {
        // Enum constants with descriptions
        WIN("You won the game!"),
        LOSE("You lost the game."),
        DRAW("The game ended in a draw.");

        // Private field to store the description
        private String description;

        // Constructor to initialize the description
        private GameResult(String description) {
            this.description = description;
        }

        // Accessor (getter) method for description
        public String getDescription() {
            return description;
        }

        // Mutator (setter) method for description
        public void setDescription(String description) {
            this.description = description;
        }

        // Override toString() to display the enum constant and its description
        @Override
        public String toString() {
            return name() + ": " + description;
        }
    }

    private Questions questions = new Questions();
    private Computer computer;
    private User user;
    private GameResult result; //YOU WON

    public Battle() {
        Multi question = questions.getNextQuestion();
        computer = new Computer(question);
        user = new User(question);
    }


    private void fight() {
        for (int i = 0; i < questions.getQuestionSize(); i++) {
            computer.answerQuestion();
            // User answers
            user.answerQuestion(0); // change to pick for gui
            questions.nextQuestionIs();
            Multi question = questions.getNextQuestion();
            computer.newQuestion(question);
            user.newQuestion(question);

        }


    }

    private GameResult theResult() {
        if (user.getRight() > computer.getRight()) {
            result = GameResult.WIN;
        } else if (user.getRight() < computer.getRight()) {
            result = GameResult.LOSE;
        } else {
            result = GameResult.DRAW;
        }

        return result;

    }
    // Getter for the result
    public GameResult getResult() {
        return result;
    }

    // Main method to test the Battle class
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.fight();
        GameResult result = battle.theResult();
        System.out.println(result.getDescription()); // Print the result
    }
}



