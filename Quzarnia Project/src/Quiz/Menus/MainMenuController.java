package Quiz.Menus;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {


    public ImageView imageView;
    public Button closeButton;

    public void initialize(){

    }

    public void beginQuiz(ActionEvent actionEvent)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("QuizChooser.fxml"));
        Scene quizScene = new Scene(loader.load());
        QuizChooserController controller =loader.getController();



        Stage QuizChooserController = new Stage();
        QuizChooserController.setScene(quizScene);
        QuizChooserController.initModality(Modality.APPLICATION_MODAL);
        QuizChooserController.show();
    }

    public void exitMainMenu(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();

    }
}
