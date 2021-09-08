import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class Task1 extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {

        // Create a pane
        Pane pane = new Pane();

        double[] scores = {15, 20, 25, 35, 5};

        String[] grades = {"HD", "DI", "CR", "PS", "FL"};

        // Create four Arcs
        Arc arc1 = new Arc(100, 100, 80, 80, 0, 360 * (scores[0] / 100));
        arc1.setFill(Color.GREEN);
        arc1.setType(ArcType.ROUND);

        Arc arc2 = new Arc(100, 100, 80, 80, arc1.getStartAngle() +
                arc1.getLength(), 360 * (scores[1] / 100));
        arc2.setFill(Color.BLUE);
        arc2.setType(ArcType.ROUND);

        Arc arc3 = new Arc(100, 100, 80, 80, arc2.getStartAngle() +
                arc2.getLength(), 360 * (scores[2] / 100));
        arc3.setFill(Color.CYAN);
        arc3.setType(ArcType.ROUND);

        Arc arc4 = new Arc(100, 100, 80, 80, arc3.getStartAngle() +
                arc3.getLength(), 360 * (scores[3] / 100));
        arc4.setFill(Color.ORANGE);
        arc4.setType(ArcType.ROUND);

        Arc arc5 = new Arc(100,100,80,80,arc4.getStartAngle() +
                arc4.getLength(), 360 * (scores[4] / 100));
        arc5.setFill(Color.RED);
        arc5.setType(ArcType.ROUND);

        // Create four text objects
        Text t1 = new Text(120, 80,  grades[0] + "=" + (int) scores[0] + "%");
        Text t2 = new Text(80, 35,   grades[1] + "=" + (int) scores[1] + "%");
        Text t3 = new Text(25, 100,   grades[2] + "=" + (int) scores[2] + "%");
        Text t4 = new Text(100, 160, grades[3] + "=" + (int) scores[3] + "%");
        Text t5 = new Text(130, 110, grades[4] + "=" + (int) scores[4] + "%");

        pane.getChildren().addAll(arc1, arc2, arc3, arc4, arc5, t1, t2, t3, t4, t5);

        // Create a Scene and place it in the pane.
        Scene scene = new Scene(pane);

        primaryStage.setHeight(250);
        primaryStage.setWidth(300);
        primaryStage.centerOnScreen();
        // Make sure the window isn't resizeable.
        primaryStage.setResizable(false);
        primaryStage.setTitle("Grade Distribution"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}