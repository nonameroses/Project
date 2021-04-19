package Quiz.Menus;

import Quiz.Menus.Controllers.Biology.QuizBiologyEasyController;
import Quiz.Menus.Controllers.Biology.QuizBiologyHardController;
import Quiz.Menus.Controllers.Biology.QuizBiologyMediumController;
import Quiz.Menus.Controllers.History.QuizHistoryEasyController;
import Quiz.Menus.Controllers.History.QuizHistoryHardController;
import Quiz.Menus.Controllers.History.QuizHistoryMediumController;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class QuizChooserController  {


    public void initialize(){
       

    }

    public void goBack(ActionEvent actionEvent) {
    }

    public void beginQuiz(ActionEvent actionEvent) throws IOException {

    }


    public void beginHistoryEasy(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Controllers/History/FXML/QuizHistoryEasy.fxml"));
        Scene quizGameScene = new Scene(loader.load());
        QuizHistoryEasyController controller =loader.getController();

        Stage QuizController = new Stage();
        QuizController.setScene(quizGameScene);
        QuizController.initModality(Modality.APPLICATION_MODAL);
        QuizController.show();


    }

    public void beginHistoryMedium(ActionEvent actionEvent)throws IOException {
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
       alert.setContentText("Not available yet!");
       alert.showAndWait();

    }

    public void beginHistoryHard(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Not available yet!");
        alert.showAndWait();

    }

    public void beginBiologyMedium(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Controllers/Biology/FXML/QuizBiologyMedium.fxml"));
        Scene quizGameScene = new Scene(loader.load());
        QuizBiologyMediumController controller =loader.getController();

        Stage QuizController = new Stage();
        QuizController.setScene(quizGameScene);
        QuizController.initModality(Modality.APPLICATION_MODAL);
        QuizController.show();

    }

    public void beginBiologyEasy(ActionEvent actionEvent)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Controllers/Biology/FXML/QuizBiologyEasy.fxml"));
        Scene quizGameScene = new Scene(loader.load());
        QuizBiologyEasyController controller =loader.getController();

        Stage QuizController = new Stage();
        QuizController.setScene(quizGameScene);
        QuizController.initModality(Modality.APPLICATION_MODAL);
        QuizController.show();
    }

    public void beginBiologyHard(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Controllers/Biology/FXML/QuizBiologyHard.fxml"));
        Scene quizGameScene = new Scene(loader.load());
        QuizBiologyHardController controller =loader.getController();

        Stage QuizController = new Stage();
        QuizController.setScene(quizGameScene);
        QuizController.initModality(Modality.APPLICATION_MODAL);
        QuizController.show();
    }

    public void beginComputingEasy(ActionEvent actionEvent) {
    }

    public void beginComputingMedium(ActionEvent actionEvent) {
    }

    public void beginComputingHard(ActionEvent actionEvent) {
    }
}
