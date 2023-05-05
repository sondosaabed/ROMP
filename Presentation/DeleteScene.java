package Presentation;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DeleteScene {
	private Button cancel2;
	private Button delete;
	private TextField id;
	private GridPane pane;

	public DeleteScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	   
        pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(50, 50, 50, 50));
        pane.setHgap(10.5);
        pane.setVgap(10.5);
        pane.setBackground(background);

        Image img01 = new Image("logo.png");
        ImageView v01 = new ImageView(img01);
        v01.setFitWidth(100);
        v01.setFitHeight(100);

        Button logo01 = new Button();
        GridPane.setHalignment(logo01, HPos.CENTER);
        logo01.setPrefSize(100, 100);
        logo01.setGraphic(v01);
        logo01.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
        pane.add(logo01, 1, 0);
        
        Label hello2 = new Label(("Only delete by ID: "));
        hello2.setFont(Font.font(16));
        //GridPane.setHalignment(namel, HPos.CENTER);
        hello2.setTextFill(Color.BLACK);
        pane.add(hello2, 0, 0);
        
        Label sample = new Label(("DNA id: "));
        sample.setFont(Font.font(16));
        //GridPane.setHalignment(namel, HPos.CENTER);
        sample.setTextFill(Color.BLACK);
        pane.add(sample, 0, 1);
        
        id = new TextField();
        id.setPrefSize(150, 30);
        GridPane.setHalignment(id, HPos.CENTER);
        pane.add(id, 1, 1);
        
        delete = new Button("Delete");
        delete.setPrefSize(100,30);
        delete.setFont(Font.font(14));
        delete.setTextFill(Color.WHITE);
        delete.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(delete, HPos.CENTER);
        pane.add(delete, 0, 4);
        
        cancel2 = new Button("Cancel");
        cancel2.setPrefSize(100,30);
        cancel2.setFont(Font.font(14));
        cancel2.setTextFill(Color.WHITE);
        cancel2.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(cancel2, HPos.CENTER);
        pane.add(cancel2, 1, 4);
        
        Scene scene2 = new Scene(pane);
        stage.setScene(scene2);
        stage.setTitle("The Recovery of Missing people");
        stage.getIcons().add(new Image("images/logo.png"));
        stage.show();
        
        cancel2.setOnAction(o -> stage.close());

        delete.setOnAction(o -> {
       	 Stage stage3 = new Stage();
            GridPane pane3 = new GridPane();
            pane3.setAlignment(Pos.CENTER);
            pane3.setPadding(new Insets(170,170,170,170));
            pane3.setHgap(15);
            pane3.setVgap(15);
            pane3.setBackground(background);

            Image img013 = new Image("logo.png");
            ImageView v013 = new ImageView(img013);
            v013.setFitWidth(100);
            v013.setFitHeight(100);

            Button logo013 = new Button();
            GridPane.setHalignment(logo013, HPos.CENTER);
            logo013.setPrefSize(100, 100);
            logo013.setGraphic(v013);
            logo013.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
            pane3.add(logo013, 1, 0);
            
            Label filel3 = new Label();
            filel3.setFont(Font.font(17));
            filel3.setTextFill(Color.BLACK);
            pane3.add(filel3, 0, 0);
            filel3.setText(query.delete(sam.getText().trim()));
            
            Button cancel2 = new Button("Cancel");
            cancel2.setPrefSize(100,30);
            cancel2.setFont(Font.font(14));
            cancel2.setTextFill(Color.WHITE);
            cancel2.setStyle("-fx-background-color: #517664;");
            GridPane.setHalignment(cancel2, HPos.CENTER);
            pane3.add(cancel2, 0, 1);
            cancel2.setOnAction(l -> stage3.close());
            
            Scene scene3 = new Scene(pane3);
            stage3.setScene(scene3);
            stage3.setTitle("The Recovery of Missing people");
            stage3.getIcons().add(new Image("logo.png"));
            stage3.show();
        });
	}
	
	
}
