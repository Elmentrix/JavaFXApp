import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DisplayName extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btn = new Button("Display");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Eyram");
            }
        });
        StackPane root=new StackPane();
        root.getChildren().add(btn);
        Scene scene = new Scene(root,600,400);
        primaryStage.setTitle("Name Display Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
