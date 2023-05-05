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

public class MatchDNAScene {
	private GridPane pane;
	private TextField sample1;
	private TextField sample2;
	private Button match;
	private Button cancel2;

	public MatchDNAScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    
		pane = new GridPane();
	    pane.setAlignment(Pos.CENTER);
	    pane.setPadding(new Insets(170,170,170,170));
	    pane.setHgap(10.5);
	    pane.setVgap(10.5);
	    pane.setBackground(background);

	    Image img01 = new Image("images/logo.png");
	    ImageView v01 = new ImageView(img01);
	    v01.setFitWidth(100);
	    v01.setFitHeight(100);

	    Button logo01 = new Button();
	    GridPane.setHalignment(logo01, HPos.CENTER);
	    logo01.setPrefSize(100, 100);
	    logo01.setGraphic(v01);
	    logo01.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
	    pane.add(logo01, 1, 0);
     
		Label filel = new Label(("Chose samples files"));
		filel.setFont(Font.font(17));
		filel.setTextFill(Color.BLACK);
		pane.add(filel, 0, 0);
     
	    Label sample1 = new Label(("DNA sample 1: "));
	    sample1.setFont(Font.font(16));
	    sample1.setTextFill(Color.BLACK);
	    pane.add(sample1, 0, 1);
     
	    this.sample1 = new TextField();
        this.sample1.setPrefSize(150, 30);
        GridPane.setHalignment(sample1, HPos.CENTER);
        pane.add(sample1, 1, 1);
     
	    Label sample2 = new Label(("DNA sample 2: "));
	    sample2.setFont(Font.font(16));
	    sample2.setTextFill(Color.BLACK);
	    pane.add(sample2, 0, 2);
     
	    this.sample2 = new TextField();
        this.sample2.setPrefSize(150, 30);
        GridPane.setHalignment(sample2, HPos.CENTER);
        pane.add(sample2, 1, 2);
     
    	match = new Button("Match");
    	match.setPrefSize(100,30);
    	match.setFont(Font.font(14));
    	match.setTextFill(Color.WHITE);
    	match.setStyle("-fx-background-color: #517664;");
    	pane.add(match, 0, 3);
     
    	cancel2 = new Button("Cancel");
        cancel2.setPrefSize(100,30);
        cancel2.setFont(Font.font(14));
        cancel2.setTextFill(Color.WHITE);
        cancel2.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(cancel2, HPos.CENTER);
        pane.add(cancel2, 1, 3);
        
        Scene scene2 = new Scene(pane);
        stage.setScene(scene2);
        stage.setTitle("Recovery of Missing people");
        stage.getIcons().add(new Image("logo.png"));
        stage.show();		
        
        cancel2.setOnAction(o -> stage.close());

        match.setOnAction(o -> {
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
	         String sampl = sample2.getText().trim();
	         String samp2 = sample2.getText().trim();
	
	         if(samp2.equals(sampl))
	        	 filel3.setText("Sample match");
	         else
	        	 filel3.setText("Sample doesn't match");
	
	         Button cancel2 = new Button("Cancel");
	         cancel2.setPrefSize(100,30);
	         cancel2.setFont(Font.font(14));
	         cancel2.setTextFill(Color.WHITE);
	         cancel2.setStyle("-fx-background-color: #517664;");
	         GridPane.setHalignment(cancel2, HPos.CENTER);
	         pane3.add(cancel2, 0, 1);
	         cancel2.setOnAction(l -> stage.close());
	         
	         Scene scene3 = new Scene(pane3);
	         stage.setScene(scene3);
	         stage.setTitle("The Recovery of Missing people");
	         stage.getIcons().add(new Image("logo.png"));
	         stage.show();
     });
     
	}
	
}
