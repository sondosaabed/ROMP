package Presentation;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ViewScene {
	public ViewScene(Stage stage) {
		initialize(stage);
	}

	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    	   	
	    GridPane pane2 = new GridPane();
	    pane2.setBackground(background);
	    pane2.setPadding(new Insets(100,100,100,100));
	    pane2.setAlignment(Pos.CENTER);
	    pane2.setHgap(10);
	    pane2.setVgap(10);

	    Image img01 = new Image("logo.png");
        ImageView v01 = new ImageView(img01);
        v01.setFitWidth(100);
        v01.setFitHeight(100);

        Button logo01 = new Button();
        GridPane.setHalignment(logo01, HPos.CENTER);
        logo01.setPrefSize(100, 100);
        logo01.setGraphic(v01);
        logo01.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
        pane2.add(logo01, 1, 0);
			        
        try {
            query.getData();

            //convert data from arraylist to observable arraylist
            query.dataList = FXCollections.observableArrayList(query.data);
            query.tableView(stage,pane2);

            stage.setTitle("The Recovery of Missing people");
            stage.getIcons().add(new Image("logo.png"));
            stage.show();
        } catch (SQLException f) {
            f.printStackTrace();
        } catch (ClassNotFoundException f) {
            f.printStackTrace();
        }		
			
	}
	
	
}
