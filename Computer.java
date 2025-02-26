import java.util.*;
public class Computer {
    private Random rand = new Random();
    private Multi currentQuestion = null;
    private double probability = 0.2;
    private int right = 0;

    public Computer(Multi question) {
        currentQuestion = question;
    }



    public void answerQuestion( ){
//        String ans = currentQuestion.getAnswer();
//        int choice = currentQuestion.geChoices().indexOf(ans);

        if (rand.nextDouble() < probability) {
//            currentQuestion.chooseAnswer(choice);
            this.right++;
        }
        else{
            int randomNum = rand.nextInt(currentQuestion.geChoices().size());
            if (currentQuestion.chooseAnswer(randomNum)) {
                this.right++;
            }

        }

    }

    public void newQuestion(Multi question){
        currentQuestion = question;
    }

    public int getRight(){
        return right;
    }

}

