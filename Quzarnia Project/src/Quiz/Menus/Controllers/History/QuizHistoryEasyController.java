package Quiz.Menus.Controllers.History;

import Quiz.Menus.QuizChooserController;
import Quiz.QuizTopics.History.QuestionHistoryEasy;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Quiz.ManagingQuestions.CreatingQuestions;
import javafx.stage.Stage;

import java.net.URL;
import java.util.*;

public class QuizHistoryEasyController implements Initializable {
    public Label labelQuestionNumber;
    public TextArea questionsTA;
    public Button submitButton;
    public Button buttonAnswer, buttonAnswer1, buttonAnswer2, buttonAnswer3;
    public ProgressBar progressBar;
    public double progress;
    public Label pointsLabel;
    public int points = 0;
    int currentQuestion = 0;
    int correctAnswers = 0;

    List<QuestionHistoryEasy> questionsHistoryEasy;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gettingTopic();
        progressBar();
    }
    public void gettingTopic(){
        QuizChooserController controller = new QuizChooserController();
        CreatingQuestions makingQuestions = new CreatingQuestions();
        // if(controller.topicCB.getSelectionModel().isSelected(0) && controller.difficultyCB.getSelectionModel().isSelected(0)) {
        questionsHistoryEasy = makingQuestions.getQuestionsHistoryEasy();
        Collections.shuffle(questionsHistoryEasy);
        labelQuestionNumber.setText("Question 1 of " + questionsHistoryEasy.size());
        loadQuestion(questionsHistoryEasy.get(currentQuestion));

    }

    public void handlerButtonSubmit(ActionEvent actionEvent) {
        currentQuestion++;
        if(currentQuestion < questionsHistoryEasy.size()){
            progressBar();
            labelQuestionNumber.setText("Question " + (currentQuestion + 1 ) + " of " + questionsHistoryEasy.size());
            loadQuestion(questionsHistoryEasy.get(currentQuestion));
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("You finished the quiz!");
            alert.setContentText("Congratulations! Your score is: " + (correctAnswers * 100 / questionsHistoryEasy.size() + "%") );
            alert.showAndWait();


        }
    }

    public void progressBar(){
        progressBar.setProgress(progress);
        if(progress < questionsHistoryEasy.size()){
            progress += 0.076;
        }

    }

    public void loadQuestion(QuestionHistoryEasy question){
        pointsLabel.setText("Points: " + String.valueOf(points));
        questionsTA.setText(question.getQuestion()); //set text area with question
        List<String> choices = question.getIncorrectAnswers();
        choices.add(question.getCorrectAnswer()); //adding possible choices to a list
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
                    points++;
                    correctAnswers++;
                }
            });
        }
    }
}
