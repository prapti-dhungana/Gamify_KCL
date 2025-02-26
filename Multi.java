import java.util.*;

public class Multi {
    private String question;
    private String answer;
    private ArrayList<String> answers;
    private String[] options = new String[3];
    private Random rand = new Random();
    private static ArrayList<String> randomAnswers = new ArrayList<>();

    public Multi(String question, String answer) {
        this.question = question;
        this.answer = answer;
        answers = new ArrayList<>();
        answers.add(answer);
        addRandomAnswer();
        addMoreAnswer(this.answer);
    }

    private void addMoreAnswer(String answer) {
        for (int i = 2 ; i > 0 ; i--){
            int randNum = rand.nextInt(randomAnswers.size());
            String randomAnswer = randomAnswers.get(randNum);

            if (randomAnswer.equals(answer)) {
                randomAnswers.remove(randNum);
                addMoreAnswer(randomAnswer);
            } else {
                answers.add(randomAnswers.get(randNum));
            }
        }



    }

    private void addRandomAnswer(){
        randomAnswers.add("O(1)");
        randomAnswers.add("Merge-sort");
        randomAnswers.add("O(n)");
        randomAnswers.add("WHERE");
        randomAnswers.add("ArrayList");
        randomAnswers.add("SELECT");
        randomAnswers.add("filter");
        randomAnswers.add("reduce");
        randomAnswers.add("Hardware costs");
        randomAnswers.add("O(nlogn)");
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean chooseAnswer(int num){
        if (answers.get(num).equals(answer)){
            return true;
        }
        return false;
    }
    
    public String getChoice(int num){
        return answers.get(num);
    }

    public ArrayList<String> geChoices() {
        return answers;
    }
}



