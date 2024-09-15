public class Question {
    private int id;
    private String question="ok ";
    private String answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;

    // Constructor with parameters
    public Question(int id, String question, String answer, String option1, String option2, String option3, String option4) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

    // Method to print the question
    public String getQuestion() {
        return question;
    }

    // Method to return an array of options
    public String[] getOptions() {
        return new String[]{option1, option2, option3, option4};
    }

    // Method to return the answer
    public String getAnswer() {
        return answer;
    }
}