import java.util.*;
public class Questions {

    private ArrayList<Multi> questions = new ArrayList<>();
    private Random rand = new Random();
    private Multi nextQuestion;
    private int questionNum = 0;

    public Questions() {
        addQuestion();
        getNextQuestion();
        nextQuestion = questions.get(questionNum);

    }

    private void addQuestion() {
        Multi q1 = new Multi ("What is the time complexity of the min method for the UnsortedPriorityQueue class?","O(n)\\n");
        questions.add(q1);
        Multi q2 = new Multi ("Which SQL clause is mandatory in a retrieval query","SELECT and FROM");
        questions.add(q2);
        Multi q3 = new Multi ("Which of the following algorithms has a worst-case running time of Ω(n2) on an n-element sequence?","Quick-select");
        questions.add(q3);
        Multi q4 = new Multi ("What is the result of the expression (n % 5) where n is a positive integer variable","An integer between 0 and 4");
        questions.add(q4);
        Multi q5 = new Multi ("What is meant by the concurrent execution of database transactions in a multiuser system?","Discuss why concurrency control is needed, and give informal examples.");
        questions.add(q5);
        Multi q6 = new Multi ("Which class contains static methods that can be used with collections such as ArrayList, LinkedList, HashMap, and HashSet","Collections");
        questions.add(q6);
        Multi q7 = new Multi ("What are the main characteristics of NOSQL systems in the areas related to distributed systems and distributed databases?","The source does not contain the answer.");
        questions.add(q7);
        Multi q8 = new Multi ("What happens when you try to look up a value and the key does not exist in the map","The source does not define what happens ");
        questions.add(q8);
        Multi q9 = new Multi ("What is the purpose of testing a requirement?","To ensure that you have coverage of the requirement");
        questions.add(q9);
        Multi q10 = new Multi ("What factor should be considered when assessing a system for re-engineering","The understandability of the source code");
        questions.add(q10);

    }

    public void nextQuestionIs() {
        if(questionNum < questions.size()) {
            nextQuestion = questions.get(questionNum + 1);
        }
    }
    public Multi getNextQuestion() {
        return nextQuestion;
    }

    public ArrayList<Multi> getQuestions() {
        return questions;
    }

    public int getQuestionSize() {
        return questions.size();
    }



}
