package Presentation;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
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

public class AddScene {
	private TextField namet;
	private TextField numt;
	private GridPane pane;
	private TextField samt;
	private Button add;
	private Button cancel2;


	public AddScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    
		pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(100,100,100,100));
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
        
        Label namee = new Label(("Name: "));
        namee.setFont(Font.font(16));
        //GridPane.setHalignment(namel, HPos.CENTER);
        namee.setTextFill(Color.BLACK);
        pane.add(namee, 0, 1);
        
        namet = new TextField();
        namet.setPrefSize(150, 30);
        GridPane.setHalignment(namet, HPos.CENTER);
        pane.add(namet, 1, 1);

        Label num = new Label(("Number: "));
        num.setFont(Font.font(16));
        //GridPane.setHalignment(namel, HPos.CENTER);
        num.setTextFill(Color.BLACK);
        pane.add(num, 0, 2);
        
        numt = new TextField();
        numt.setPrefSize(150, 30);
        GridPane.setHalignment(numt, HPos.CENTER);
        pane.add(numt, 1, 2);
        
        Label sample1 = new Label(("DNA sample: "));
        sample1.setFont(Font.font(16));
        sample1.setTextFill(Color.BLACK);
        pane.add(sample1, 0, 3);
        
        samt = new TextField();
        samt.setPrefSize(150, 30);
        GridPane.setHalignment(samt, HPos.CENTER);
        pane.add(samt, 1, 3);
        
        add = new Button("Add");
        add.setPrefSize(100,30);
        add.setFont(Font.font(14));
        add.setTextFill(Color.WHITE);
        add.setStyle("-fx-background-color: #517664;");
        GridPane.setHalignment(add, HPos.CENTER);
        pane.add(add, 0, 4);
        
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

        add.setOnAction(o -> {
       	 try {
                DNArecord record = new DNArecord(namet.getText().trim(),
               		 						Integer.parseInt(numt.getText().trim()),
               		 						samt.getText().trim());
                query.insertData(record);
                
                Stage stage3 = new Stage();
                GridPane pane3 = new GridPane();
                pane3.setAlignment(Pos.CENTER);
                pane3.setPadding(new Insets(50, 50, 50, 50));
                pane3.setHgap(10.5);
                pane3.setVgap(10.5);
                pane3.setBackground(background);
                
                Label hello3 = new Label("inserted successfully");
                hello3.setFont(Font.font(17));
                hello3.setTextFill(Color.GREY);
                pane3.add(hello3, 0, 0);
                
                Image img010 = new Image("logo.png");
                ImageView v001 = new ImageView(img010);
                v001.setFitWidth(170);
                v001.setFitHeight(170);
                
                Button logo5 = new Button();
                GridPane.setHalignment(logo01, HPos.CENTER);
                logo5.setPrefSize(130, 200);
                logo5.setGraphic(v001);
                logo5.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
                pane3.add(logo01, 1, 0);
                
                //Create Scene
                Scene scene3 = new Scene(pane3);
                stage3.setScene(scene3);
                stage3.setTitle("The Recovery of Missing people");
                stage3.getIcons().add(new Image("logo.png"));
                stage3.show();
            }catch (Exception l){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning Dialog");
                alert.setHeaderText("Look, a Warning Dialog");
                alert.setContentText("Please Make sure you are inputting the right input\n"+l.getMessage());
                alert.showAndWait();
            }
        }
        );
	}
}
