package Quiz.Menus.Controllers.History;

import Quiz.Menus.QuizChooserController;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Quiz.ManagingQuestions.CreatingQuestions;
import Quiz.QuizTopics.History.QuestionHistoryMedium;
import java.net.URL;
import java.util.*;

public class QuizHistoryMediumController implements Initializable {
    public Label labelQuestionNumber;
    public TextArea questionsTA;
    public Button submitButton;
    public Button buttonAnswer, buttonAnswer1, buttonAnswer2, buttonAnswer3;
    int currentQuestion = 0;
    int correctAnswers = 0;

    List<QuestionHistoryMedium> questionsHistoryMedium;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gettingTopic();

    }
    public void gettingTopic(){
        QuizChooserController controller = new QuizChooserController();
        CreatingQuestions makingQuestions = new CreatingQuestions();
        // if(controller.topicCB.getSelectionModel().isSelected(0) && controller.difficultyCB.getSelectionModel().isSelected(0)) {
        questionsHistoryMedium = makingQuestions.getQuestionsHistoryMedium();
        Collections.shuffle(questionsHistoryMedium);
        labelQuestionNumber.setText("Question 1 of " + questionsHistoryMedium.size());
        loadQuestion(questionsHistoryMedium.get(currentQuestion));

    }

    public void handlerButtonSubmit(ActionEvent actionEvent) {
        currentQuestion++;
        if(currentQuestion < questionsHistoryMedium.size()){
            labelQuestionNumber.setText("Question " + (currentQuestion + 1 ) + " of " + questionsHistoryMedium.size());
            loadQuestion(questionsHistoryMedium.get(currentQuestion));
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("You finished the quiz!");
            alert.setContentText("Congratulations! Your score is: " + (correctAnswers * 100 / questionsHistoryMedium.size() + "%") );
            alert.showAndWait();
        }
    }

    public void loadQuestion(QuestionHistoryMedium question) {
        questionsTA.setText(question.getQuestion());
        List<String> choices  = question.getIncorrectAnswers();
        choices.add(question.getCorrectAnswer());
        Collections.shuffle(choices);

        List<Button> buttons = new ArrayList<>();
        buttons.add(buttonAnswer);
        buttons.add(buttonAnswer1);
        buttons.add(buttonAnswer2);
        buttons.add(buttonAnswer3);
        for(int i =0; i<choices.size(); i++){
            buttons.get(i).setText(choices.get(i));
        }
        for(Button button : buttons){
            button.setOnAction(actionEvent -> {
                if(button.getText().equals(question.getCorrectAnswer())){
                    correctAnswers++;
                }
            });
        }
    }
}
