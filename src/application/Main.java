package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Agent;

public class Main extends Application {
    private static Agent user;
    public static Stage stg;
//    private double x,y;
    //getters and setters
    public static Agent getUser() {
        return user;
    }
    public static void setUser(Agent user) {
        Main.user = user;
    }
    //startup view LOGINDISPLAY
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.stg = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("../fxml/LoginDisplay.fxml"));
        primaryStage.setTitle("User Login");
        stg.setScene(new Scene(root, 800, 600));
        stg.initStyle(StageStyle.DECORATED);
        //make window draggable
//        root.setOnMousePressed(event -> {
//            x = event.getSceneX();
//            y = event.getSceneY();
//        });
//        root.setOnMouseDragged(event -> {
//            stg.setX(event.getScreenX() - x);
//            stg.setY(event.getScreenY() - y);
//        });
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
