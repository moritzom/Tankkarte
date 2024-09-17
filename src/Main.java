/*Erstellt von Nathan Barisic, Arpad Antal
Erstellt am 16.04.2024
Beschreibung: Umsetzung des ITP-Projektes
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("startmenu.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Screen screen = Screen.getPrimary();
        double screenWidth = screen.getBounds().getWidth();
        double screenHeight = screen.getBounds().getHeight();

        primaryStage.setScene(scene);
        //primaryStage.setFullScreen(true); //Wenn auf True wird das Spiel in Fullscreen aufgerufen
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);

        primaryStage.setTitle("Tankung");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}