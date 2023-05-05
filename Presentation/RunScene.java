package Presentation;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RunScene {
	//feilds
	private GridPane pane;
	private Button matchDNA;
	private Button exit;
	private Button add;
	private Button view;
	private Button search;
	private Button delete;

	public RunScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    
		pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(70, 70, 70, 70));
        pane.setHgap(10.5);
        pane.setVgap(10.5);
        pane.setBackground(background);

        Image img0 = new Image("images/logo.png");
        ImageView v0 = new ImageView(img0);
        v0.setFitWidth(150);
        v0.setFitHeight(150);

        Button logo0 = new Button();
        GridPane.setHalignment(logo0, HPos.CENTER);
        logo0.setPrefSize(150, 200);
        logo0.setGraphic(v0);
        logo0.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
        pane.add(logo0, 1, 0);

        Image img1 = new Image("images/Match DNA.png");
        ImageView v1 = new ImageView(img1);
        v1.setFitWidth(200);
        v1.setFitHeight(200);
                
	    search =new Button();
	    search.setPrefSize(200, 200);
	    search.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
	    search.setGraphic(v1);
	    pane.add(search, 0, 1);
                
	    Image img6 = new Image("images/exit.png");
        ImageView v6 = new ImageView(img6);
        v6.setFitWidth(200);
        v6.setFitHeight(200);
        
        exit = new Button();
        exit.setPrefSize(200, 200);
        exit.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
        exit.setGraphic(v6);
        pane.add(exit, 2, 2);
        
        Image img2 = new Image("images/two ppl.png");
        ImageView v2 = new ImageView(img2);
        v2.setFitWidth(200);
        v2.setFitHeight(200);
        
        matchDNA = new Button();
        matchDNA.setPrefSize(200, 200);
        matchDNA.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
        matchDNA.setGraphic(v2);
        pane.add(matchDNA, 1, 1);
        
        Image img3 = new Image("images/add.png");
        ImageView v3 = new ImageView(img3);
        v3.setFitWidth(200);
        v3.setFitHeight(200);
        
        add = new Button();
        add.setPrefSize(200, 200);
        add.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
        add.setGraphic(v3);
        pane.add(add, 2, 1);
        
        Image img4 = new Image("images/table.png");
        ImageView v4 = new ImageView(img4);
        v4.setFitWidth(200);
        v4.setFitHeight(200);
        
        view.setPrefSize(200, 200);
        view.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
        view.setGraphic(v4);
        pane.add(view, 0, 2);
        
        Image img5 = new Image("images/delete.png");
        ImageView v5 = new ImageView(img5);
        v5.setFitWidth(200);
        v5.setFitHeight(200);
        
        delete = new Button();
        delete.setPrefSize(200, 200);
        delete.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
        delete.setGraphic(v5);
        pane.add(delete, 1, 2);
        
        Scene scene1 = new Scene(pane);
        stage.setScene(scene1);
        stage.setTitle("The Recovery of Missing people");
        stage.getIcons().add(new Image("images/logo.png"));
        stage.show();
        
	}
}
