package Quiz.Menus.Controllers.Biology;

import Quiz.Menus.QuizChooserController;
import Quiz.QuizTopics.Biology.QuestionBiologyEasy;
import Quiz.QuizTopics.Biology.QuestionBiologyMedium;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Quiz.ManagingQuestions.CreatingQuestions;
import java.net.URL;
import java.util.*;

public class QuizBiologyMediumController implements Initializable {
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

    List<QuestionBiologyMedium> questionsBiologyMedium;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gettingTopic();
        progressBar();
    }
    public void gettingTopic(){
        QuizChooserController controller = new QuizChooserController();
        CreatingQuestions makingQuestions = new CreatingQuestions();
        // if(controller.topicCB.getSelectionModel().isSelected(0) && controller.difficultyCB.getSelectionModel().isSelected(0)) {
        questionsBiologyMedium = makingQuestions.questionBiologyMedium;
        Collections.shuffle(questionsBiologyMedium);
        labelQuestionNumber.setText("Question 1 of " + questionsBiologyMedium.size());
        loadQuestion(questionsBiologyMedium.get(currentQuestion));

    }

    public void handlerButtonSubmit(ActionEvent actionEvent) {
        currentQuestion++;
        if(currentQuestion < questionsBiologyMedium.size()){
            progressBar();
            labelQuestionNumber.setText("Question " + (currentQuestion + 1 ) + " of " + questionsBiologyMedium.size());
            loadQuestion(questionsBiologyMedium.get(currentQuestion));
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("You finished the quiz!");
            alert.setContentText("Congratulations! Your score is: " + (correctAnswers * 100 / questionsBiologyMedium.size() + "%") );
            alert.showAndWait();

        }
    }

    public void progressBar(){
        progressBar.setProgress(progress);
        if(progress < questionsBiologyMedium.size()){
            progress += 0.076;
        }

    }

    public void loadQuestion(QuestionBiologyMedium question){
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
                    points +=5;
                    correctAnswers++;
                }
            });
        }
    }
}
