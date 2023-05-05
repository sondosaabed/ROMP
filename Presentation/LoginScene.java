package Presentation;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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

public class LoginScene {
	private GridPane pane;
	private TextField name;
	private PasswordField pass;
	private Button run;
	private Button cancel;

	public LoginScene(Stage stage) {
		initialize(stage);
	}
	
	private void initialize(Stage stage) {
	    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
	    Background background = new Background(c);
	    
        pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(100, 170, 100, 170));
        pane.setHgap(20);
        pane.setVgap(10.5);
        pane.setBackground(background);

        Image img = new Image("logo.png");
        ImageView v = new ImageView(img);
        v.setFitWidth(130);
        v.setFitHeight(130);

        Button logo = new Button();
        GridPane.setHalignment(logo, HPos.CENTER);
        logo.setPrefSize(130, 130);
        logo.setGraphic(v);
        logo.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
        pane.add(logo, 1, 0);
	        
        Label hello = new Label(("Hello user"));
        hello.setFont(Font.font(17));
        hello.setTextFill(Color.BLACK);
        pane.add(hello, 0, 0);

        Label namel = new Label(("Username: "));
        namel.setFont(Font.font(16));
        namel.setTextFill(Color.BLACK);
        pane.add(namel, 0, 1);

        name = new TextField();
        name.setPrefSize(150, 30);
        GridPane.setHalignment(name, HPos.CENTER);
        pane.add(name, 1, 1);

        Label passl = new Label(("Password: "));
        passl.setFont(Font.font(16));
        passl.setTextFill(Color.BLACK);
        pane.add(passl, 0, 2);

        pass = new PasswordField();
        GridPane.setHalignment(pass, HPos.CENTER);
        pass.setPrefSize(150, 30);
        pane.add(pass, 1, 2);

        run = new Button("Run");
        run.setPrefSize(100,30);
        run.setFont(Font.font(14));
        run.setTextFill(Color.BLACK);
        run.setStyle("-fx-background-color: #9FD8CB;");
        GridPane.setHalignment(run, HPos.CENTER);
        GridPane.setHalignment(run, HPos.CENTER);
        pane.add(run, 0, 4);
        
        cancel = new Button("Cancel");
        cancel.setPrefSize(100,30);
        cancel.setFont(Font.font(14));
        cancel.setTextFill(Color.BLACK);
        cancel.setStyle("-fx-background-color: #9FD8CB;");
        GridPane.setHalignment(cancel, HPos.CENTER);
        pane.add(cancel, 1, 4);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("The Recovery of Missing people");
        stage.getIcons().add(new Image("images/logo.png"));
        stage.show();
	}

	public GridPane getPane() {
		return pane;
	}

	public void setPane(GridPane pane) {
		this.pane = pane;
	}

	public TextField getName() {
		return name;
	}

	public void setName(TextField name) {
		this.name = name;
	}

	public PasswordField getPass() {
		return pass;
	}

	public void setPass(PasswordField pass) {
		this.pass = pass;
	}

	public Button getRun() {
		return run;
	}

	public void setRun(Button run) {
		this.run = run;
	}

	public Button getCancel() {
		return cancel;
	}

	public void setCancel(Button cancel) {
		this.cancel = cancel;
	}
}
