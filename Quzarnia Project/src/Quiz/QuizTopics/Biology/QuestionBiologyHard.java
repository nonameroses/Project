package Quiz.QuizTopics.Biology;

import Quiz.QuizTopics.Question;

import java.util.List;

public class QuestionBiologyHard extends Question {
    private String hint;
    public QuestionBiologyHard(String question, String correctAnswer,  String hint,List<String> incorrectAnswers) {
        super(question, correctAnswer, incorrectAnswers);
        this.hint=hint;
    }

    public String getQuestion() {

        return super.getQuestion();
    }

    public String getHint() {
        return hint;
    }
}
