package Quiz.Menus.Controllers.History;

import Quiz.QuizTopics.History.QuestionHistoryHard;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import Quiz.ManagingQuestions.CreatingQuestions;

import java.net.URL;
import java.util.*;

public class QuizHistoryHardController implements Initializable {
    public Label labelQuestionNumber;
    public TextArea questionsTA;
    public Button submitButton;
    public Button buttonAnswer, buttonAnswer1, buttonAnswer2, buttonAnswer3;
    int currentQuestion = 0;
    int correctAnswers = 0;

    List<QuestionHistoryHard> questionsHistoryHard;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gettingTopic();

    }
    public void gettingTopic(){
        CreatingQuestions makingQuestions = new CreatingQuestions();
        questionsHistoryHard = makingQuestions.getQuestionsHistoryHard();
        Collections.shuffle(questionsHistoryHard);
        labelQuestionNumber.setText("Question 1 of " + questionsHistoryHard.size());
        loadQuestion(questionsHistoryHard.get(currentQuestion));
    }
    public void handlerButtonSubmit(ActionEvent actionEvent) {
        currentQuestion++;
        if(currentQuestion < questionsHistoryHard.size()){
            labelQuestionNumber.setText("Question " + (currentQuestion + 1 ) + " of " + questionsHistoryHard.size());
            loadQuestion(questionsHistoryHard.get(currentQuestion));
        }else{
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("You finished the quiz!");
            alert.setContentText("Congratulations! Your score is: " + (correctAnswers * 100 / questionsHistoryHard.size() + "%") );
            alert.showAndWait();
        }
    }


    public void loadQuestion(QuestionHistoryHard question){
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
                    correctAnswers++;
                }
            });
        }
    }

    }

