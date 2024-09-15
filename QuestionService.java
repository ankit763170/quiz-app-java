public class QuestionService {
    Question[] questions = new Question[3];
int score;
    public void initializequestion() {
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new Question(1, "que", "okkkkkkkkkkk", "1", "2", "3", "4");
        }
    }

    public void getdata() {
        for (Question q : questions) {
            if (q != null) {
                System.out.println(q.getQuestion());
                System.out.println(q.getAnswer());
            } else {
                System.out.println("Question object is null");
            }
        }
    }
    
}