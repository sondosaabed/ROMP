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

public class SearchScene {
	private GridPane pane;
	private TextField sample;
	private Button search;
	private Button cancel2;

	public SearchScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    
		pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(170,170,170,170));
        pane.setHgap(15);
        pane.setVgap(15);
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
        
        Label filel = new Label(("Copy & Paste DNA:"));
        filel.setFont(Font.font(17));
        filel.setTextFill(Color.BLACK);
        pane.add(filel, 0, 0);
        
        Label samplel = new Label(("DNA sample: "));
        samplel.setFont(Font.font(16));
        samplel.setTextFill(Color.BLACK);
        pane.add(samplel, 0, 1);
        
        sample = new TextField();
        sample.setPrefSize(150, 30);
        GridPane.setHalignment(sample, HPos.CENTER);
        pane.add(sample, 1, 1);
        
        search = new Button("Search");
        search.setPrefSize(100,30);
        search.setFont(Font.font(14));
        search.setTextFill(Color.WHITE);
        search.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(search, HPos.CENTER);
        pane.add(search, 0, 2);
        
        cancel2 = new Button("Cancel");
        cancel2.setPrefSize(100,30);
        cancel2.setFont(Font.font(14));
        cancel2.setTextFill(Color.WHITE);
        cancel2.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(cancel2, HPos.CENTER);
        pane.add(cancel2, 1, 2);
        
        Scene scene2 = new Scene(pane);
        stage.setScene(scene2);
        stage.setTitle("Search DNA");
        stage.getIcons().add(new Image("images/logo.png"));
        stage.show();	
        
        cancel2.setOnAction(o -> 
	    	stage.close()
	    );
        
        search.setOnAction(o -> {
            GridPane pane3 = new GridPane();
            pane3.setAlignment(Pos.CENTER);
            pane3.setPadding(new Insets(100,100,100,100));
            pane3.setHgap(15);
            pane3.setVgap(15);
            pane3.setBackground(background);

            Image img013= new Image("logo.png");
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
            pane3.add(filel3, 0, 2);
            filel3.setText(query.search(sample.getText().trim(), pane3, 1, 1));

            Button cancel = new Button("Cancel");
            cancel.setPrefSize(100,30);
            cancel.setFont(Font.font(14));
            cancel.setTextFill(Color.WHITE);
            cancel.setStyle("-fx-background-color: #517664;");
            GridPane.setHalignment(cancel, HPos.CENTER);
            pane3.add(cancel, 1, 2);
            cancel.setOnAction(l -> 
            	stage.close()
            );
            
            Scene scene3 = new Scene(pane3);
            stage.setScene(scene3);
            stage.setTitle("Search DNA");
            stage.getIcons().add(new Image("images/logo.png"));
            stage.show();
        });
      	
	}
	
	
}
