public class User {
    private Multi currentQuestion = null;
    private int right = 0;

    public User(Multi question) {
        currentQuestion = question;

    }
     public void newQuestion(Multi question){
        currentQuestion = question;
    }

    public void answerQuestion(int num){
       boolean yes = currentQuestion.chooseAnswer(num);

       if(yes){
           right++;
       }

    }

    public int getRight(){
        return right;
    }
}
