package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

      //  URL url = getClass().getResource(fxmlString);
      //  borderPane = FXMLLoader.load(url);
        String fxmlString="/fxml/borderPaneMain.fxml";
    FXMLLoader loader=new FXMLLoader(this.getClass().getResource(fxmlString));
    BorderPane borderPane=loader.load();


        Scene scene=new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moja biblioteka");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
