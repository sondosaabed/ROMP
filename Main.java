import java.io.IOException;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	//colors of the project
	Color c1 = Color.valueOf("#CACFD6");
	Color c2 = Color.valueOf("#D6E5E3");
	Color c3 = Color.valueOf("#9FD8CB");
	Color c4 = Color.valueOf("#517664");
	
    BackgroundFill c = new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY);
    Background background = new Background(c);

    Query query = new Query();
    
	public static void main(String[] args){
        launch(args);
	}
	
	@Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
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
        //GridPane.setHalignment(namel, HPos.CENTER);
        namel.setTextFill(Color.BLACK);
        pane.add(namel, 0, 1);

        TextField name = new TextField();
        name.setPrefSize(150, 30);
        GridPane.setHalignment(name, HPos.CENTER);
        pane.add(name, 1, 1);

        Label passl = new Label(("Password: "));
        passl.setFont(Font.font(16));
        passl.setTextFill(Color.BLACK);
        //GridPane.setHalignment(passl, HPos.CENTER);
        pane.add(passl, 0, 2);

        PasswordField pass = new PasswordField();
        GridPane.setHalignment(pass, HPos.CENTER);
        pass.setPrefSize(150, 30);
        pane.add(pass, 1, 2);

        Button run = new Button("Run");
        run.setPrefSize(100,30);
        run.setFont(Font.font(14));
        run.setTextFill(Color.BLACK);
        run.setStyle("-fx-background-color: #9FD8CB;");
        GridPane.setHalignment(run, HPos.CENTER);
        GridPane.setHalignment(run, HPos.CENTER);
        pane.add(run, 0, 4);
        run.setOnAction(e -> {
        	Login login = new Login();
            try {
                if(login.login(name.getText().trim(),pass.getText().trim()) == true) {
                    Stage stage1 = new Stage();
                    GridPane pane1 = new GridPane();
                    pane1.setAlignment(Pos.CENTER);
                    pane1.setPadding(new Insets(70, 70, 70, 70));
                    pane1.setHgap(10.5);
                    pane1.setVgap(10.5);
                    pane1.setBackground(background);

                    Image img0 = new Image("logo.png");
                    ImageView v0 = new ImageView(img0);
                    v0.setFitWidth(150);
                    v0.setFitHeight(150);

                    Button logo0 = new Button();
                    GridPane.setHalignment(logo0, HPos.CENTER);
                    logo0.setPrefSize(150, 200);
                    logo0.setGraphic(v0);
                    logo0.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 0;-fx-background-color: transparent;");
                    pane1.add(logo0, 1, 0);

                    Image img1 = new Image("Match DNA.png");
                    ImageView v1 = new ImageView(img1);
                    v1.setFitWidth(200);
                    v1.setFitHeight(200);
                    
                    Button addd =new Button();
                    addd.setPrefSize(200, 200);
                    addd.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    addd.setGraphic(v1);
                    pane1.add(addd, 0, 1);
                    addd.setOnAction(k -> {   
                    	 Stage stage2 = new Stage();
                         GridPane pane2 = new GridPane();
                         pane2.setAlignment(Pos.CENTER);
                         pane2.setPadding(new Insets(170,170,170,170));
                         pane2.setHgap(15);
                         pane2.setVgap(15);
                         pane2.setBackground(background);

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
                         
                         Label filel = new Label(("Copy & Paste DNA:"));
                         filel.setFont(Font.font(17));
                         filel.setTextFill(Color.BLACK);
                         pane2.add(filel, 0, 0);
                         
                         Label sample = new Label(("DNA sample: "));
                         sample.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
                         sample.setTextFill(Color.BLACK);
                         pane2.add(sample, 0, 1);
                         
                         TextField sam = new TextField();
                         sam.setPrefSize(150, 30);
                         GridPane.setHalignment(sam, HPos.CENTER);
                         pane2.add(sam, 1, 1);
                         
                         Button search = new Button("Search");
                         search.setPrefSize(100,30);
                         search.setFont(Font.font(14));
                         search.setTextFill(Color.WHITE);
                         search.setStyle("-fx-background-color: #517664;");
                         GridPane.setHalignment(search, HPos.CENTER);
                         pane2.add(search, 0, 2);
                         search.setOnAction(o -> {
                        	 Stage stage3 = new Stage();
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
                             filel3.setText(query.search(sam.getText().trim(), pane3, 1, 1));

                             Button cancel2 = new Button("Cancel");
                             cancel2.setPrefSize(100,30);
                             cancel2.setFont(Font.font(14));
                             cancel2.setTextFill(Color.WHITE);
                             cancel2.setStyle("-fx-background-color: #517664;");
                             GridPane.setHalignment(cancel2, HPos.CENTER);
                             pane3.add(cancel2, 1, 2);
                             cancel2.setOnAction(l -> 
                             	stage3.close()
                             );
                             
                             Scene scene3 = new Scene(pane3);
                             stage3.setScene(scene3);
                             stage3.setTitle("Search DNA");
                             stage3.getIcons().add(new Image("logo.png"));
                             stage3.show();
                         });
                         
                         Button cancel2 = new Button("Cancel");
                         cancel2.setPrefSize(100,30);
                         cancel2.setFont(Font.font(14));
                         cancel2.setTextFill(Color.WHITE);
                         cancel2.setStyle("-fx-background-color: #517664;");
                         GridPane.setHalignment(cancel2, HPos.CENTER);
                         pane2.add(cancel2, 1, 2);
                         cancel2.setOnAction(o -> 
                         	stage2.close()
                         );
                         
                         Scene scene2 = new Scene(pane2);
                         stage2.setScene(scene2);
                         stage2.setTitle("Search DNA");
                         stage2.getIcons().add(new Image("logo.png"));
                         stage2.show();
                    });

                    Image img2 = new Image("two ppl.png");
                    ImageView v2 = new ImageView(img2);
                    v2.setFitWidth(200);
                    v2.setFitHeight(200);
                    
                    Button del = new Button();
                    del.setPrefSize(200, 200);
                    del.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    del.setGraphic(v2);
                    pane1.add(del, 1, 1);
                    del.setOnAction(k -> {
	                   	 Stage stage2 = new Stage();
	                     GridPane pane2 = new GridPane();
	                     pane2.setAlignment(Pos.CENTER);
	                     pane2.setPadding(new Insets(170,170,170,170));
	                     pane2.setHgap(10.5);
	                     pane2.setVgap(10.5);
	                     pane2.setBackground(background);
	
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
	                     
	                     Label filel = new Label(("Chose samples files"));
                         filel.setFont(Font.font(17));
                         filel.setTextFill(Color.BLACK);
                         pane2.add(filel, 0, 0);
                         
                         Label sample = new Label(("DNA sample 1: "));
                         sample.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
                         sample.setTextFill(Color.BLACK);
                         pane2.add(sample, 0, 1);
                         
                         TextField sam = new TextField();
                         sam.setPrefSize(150, 30);
                         GridPane.setHalignment(sam, HPos.CENTER);
                         pane2.add(sam, 1, 1);
                         
                         Label sample1 = new Label(("DNA sample 2: "));
                         sample1.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
                         sample1.setTextFill(Color.BLACK);
                         pane2.add(sample1, 0, 2);
                         
                         TextField sam1 = new TextField();
                         sam1.setPrefSize(150, 30);
                         GridPane.setHalignment(sam1, HPos.CENTER);
                         pane2.add(sam1, 1, 2);
                         
                         Button search = new Button("Match");
                         search.setPrefSize(100,30);
                         search.setFont(Font.font(14));
                         search.setTextFill(Color.WHITE);
                         search.setStyle("-fx-background-color: #517664;");
                         //GridPane.setHalignment(search, HPos.CENTER);
                         pane2.add(search, 0, 3);
                         search.setOnAction(o -> {
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
                             String sampl = sam1.getText().trim();
                             String samp2 = sam.getText().trim();

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
    	                     cancel2.setOnAction(l -> stage3.close());
    	                     
    	                     Scene scene3 = new Scene(pane3);
    	                     stage3.setScene(scene3);
    	                     stage3.setTitle("The Recovery of Missing people");
    	                     stage3.getIcons().add(new Image("logo.png"));
    	                     stage3.show();
                         });
                         
	                     Button cancel2 = new Button("Cancel");
	                     cancel2.setPrefSize(100,30);
	                     cancel2.setFont(Font.font(14));
	                     cancel2.setTextFill(Color.WHITE);
	                     cancel2.setStyle("-fx-background-color: #517664;");
	                     GridPane.setHalignment(cancel2, HPos.CENTER);
	                     pane2.add(cancel2, 1, 3);
	                     cancel2.setOnAction(o -> stage2.close());
	                     
	                     Scene scene2 = new Scene(pane2);
	                     stage2.setScene(scene2);
	                     stage2.setTitle("Recovery of Missing people");
	                     stage2.getIcons().add(new Image("logo.png"));
	                     stage2.show();
                    });
                    
                    Image img3 = new Image("add.png");
                    ImageView v3 = new ImageView(img3);
                    v3.setFitWidth(200);
                    v3.setFitHeight(200);
                    
                    Button search = new Button();
                    search.setPrefSize(200, 200);
                    search.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    search.setGraphic(v3);
                    pane1.add(search, 2, 1);
                    search.setOnAction(k -> {
	                   	 Stage stage2 = new Stage();
	                     GridPane pane2 = new GridPane();
	                     pane2.setAlignment(Pos.CENTER);
	                     pane2.setPadding(new Insets(100,100,100,100));
	                     pane2.setHgap(10.5);
	                     pane2.setVgap(10.5);
	                     pane2.setBackground(background);
	
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
	                     
	                     Label namee = new Label(("Name: "));
	                     namee.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
	                     namee.setTextFill(Color.BLACK);
                         pane2.add(namee, 0, 1);
                         
                         TextField namet = new TextField();
                         namet.setPrefSize(150, 30);
                         GridPane.setHalignment(namet, HPos.CENTER);
                         pane2.add(namet, 1, 1);

                         Label num = new Label(("Number: "));
	                     num.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
	                     num.setTextFill(Color.BLACK);
                         pane2.add(num, 0, 2);
                         
                         TextField numt = new TextField();
                         numt.setPrefSize(150, 30);
                         GridPane.setHalignment(numt, HPos.CENTER);
                         pane2.add(numt, 1, 2);
                         
	                     Label sample1 = new Label(("DNA sample: "));
                         sample1.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
                         sample1.setTextFill(Color.BLACK);
                         pane2.add(sample1, 0, 3);
                         
                         TextField samt = new TextField();
                         samt.setPrefSize(150, 30);
                         GridPane.setHalignment(samt, HPos.CENTER);
                         pane2.add(samt, 1, 3);
                         
	                     Button ad = new Button("Add");
	                     ad.setPrefSize(100,30);
	                     ad.setFont(Font.font(14));
	                     ad.setTextFill(Color.WHITE);
	                     ad.setStyle("-fx-background-color: #517664;");
	                     GridPane.setHalignment(ad, HPos.CENTER);
	                     pane2.add(ad, 0, 4);
	                     ad.setOnAction(o -> {
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
	                     
	                     Button cancel2 = new Button("Cancel");
	                     cancel2.setPrefSize(100,30);
	                     cancel2.setFont(Font.font(14));
	                     cancel2.setTextFill(Color.WHITE);
	                     cancel2.setStyle("-fx-background-color: #517664;");
	                     GridPane.setHalignment(cancel2, HPos.CENTER);
	                     pane2.add(cancel2, 1, 4);
	                     cancel2.setOnAction(o -> stage2.close());
	                     
	                     Scene scene2 = new Scene(pane2);
	                     stage2.setScene(scene2);
	                     stage2.setTitle("The Recovery of Missing people");
	                     stage2.getIcons().add(new Image("logo.png"));
	                     stage2.show();
                    });

                    Image img4 = new Image("table.png");
                    ImageView v4 = new ImageView(img4);
                    v4.setFitWidth(200);
                    v4.setFitHeight(200);
                    
                    Button view = new Button();
                    view.setPrefSize(200, 200);
                    view.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    view.setGraphic(v4);
                    pane1.add(view, 0, 2);
                    view.setOnAction(k -> {
                    	Stage stage2 = new Stage();
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
	                         query.tableView(stage2,pane2);

	                         stage2.setTitle("The Recovery of Missing people");
		                     stage2.getIcons().add(new Image("logo.png"));
		                     stage2.show();
	                     } catch (SQLException f) {
	                         f.printStackTrace();
	                     } catch (ClassNotFoundException f) {
	                         f.printStackTrace();
	                     }
                    });
                    
                    Image img5 = new Image("delete.png");
                    ImageView v5 = new ImageView(img5);
                    v5.setFitWidth(200);
                    v5.setFitHeight(200);
                    
                    Button dele = new Button();
                    dele.setPrefSize(200, 200);
                    dele.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    dele.setGraphic(v5);
                    pane1.add(dele, 1, 2);
                    dele.setOnAction(k -> {
	                   	 Stage stage2 = new Stage();
	                     GridPane pane2 = new GridPane();
	                     pane2.setAlignment(Pos.CENTER);
	                     pane2.setPadding(new Insets(50, 50, 50, 50));
	                     pane2.setHgap(10.5);
	                     pane2.setVgap(10.5);
	                     pane2.setBackground(background);
	
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
	                     
	                     Label hello2 = new Label(("Only delete by ID: "));
	                     hello2.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
	                     hello2.setTextFill(Color.BLACK);
                         pane2.add(hello2, 0, 0);
                         
                         Label sample = new Label(("DNA id: "));
                         sample.setFont(Font.font(16));
                         //GridPane.setHalignment(namel, HPos.CENTER);
                         sample.setTextFill(Color.BLACK);
                         pane2.add(sample, 0, 1);
                         
                         TextField sam = new TextField();
                         sam.setPrefSize(150, 30);
                         GridPane.setHalignment(sam, HPos.CENTER);
                         pane2.add(sam, 1, 1);
                         
                         Button ad = new Button("Delete");
	                     ad.setPrefSize(100,30);
	                     ad.setFont(Font.font(14));
	                     ad.setTextFill(Color.WHITE);
	                     ad.setStyle("-fx-background-color: #517664;");
	                     GridPane.setHalignment(ad, HPos.CENTER);
	                     pane2.add(ad, 0, 4);
	                     ad.setOnAction(o -> {
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
	                     Button cancel2 = new Button("Cancel");
	                     cancel2.setPrefSize(100,30);
	                     cancel2.setFont(Font.font(14));
	                     cancel2.setTextFill(Color.WHITE);
	                     cancel2.setStyle("-fx-background-color: #517664;");
	                     GridPane.setHalignment(cancel2, HPos.CENTER);
	                     pane2.add(cancel2, 1, 4);
	                     cancel2.setOnAction(o -> stage2.close());
	                     
	                     Scene scene2 = new Scene(pane2);
	                     stage2.setScene(scene2);
	                     stage2.setTitle("The Recovery of Missing people");
	                     stage2.getIcons().add(new Image("logo.png"));
	                     stage2.show();
                    });

                    Image img6 = new Image("exit.png");
                    ImageView v6 = new ImageView(img6);
                    v6.setFitWidth(200);
                    v6.setFitHeight(200);
                    
                    Button exit = new Button();
                    exit.setPrefSize(200, 200);
                    exit.setStyle("-fx-border-color: transparent;-fx-border-width: 0;-fx-background-radius: 7;-fx-background-color:#9FD8CB;");
                    exit.setGraphic(v6);
                    pane1.add(exit, 2, 2);
                    exit.setOnAction(k -> {
                        Platform.exit();
                    });

                    Scene scene1 = new Scene(pane1);
                    stage1.setScene(scene1);
                    stage1.setTitle("The Recovery of Missing people");
                    stage1.getIcons().add(new Image("logo.png"));
                    stage1.show();
                }
                else {
                    name.clear();
                    pass.clear();
                    name.setPromptText("Wrong userName");
                    pass.setPromptText("Wrong password");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
        
        Button cancel = new Button("Cancel");
        cancel.setPrefSize(100,30);
        cancel.setFont(Font.font(14));
        cancel.setTextFill(Color.BLACK);
        cancel.setStyle("-fx-background-color: #9FD8CB;");
        GridPane.setHalignment(cancel, HPos.CENTER);
        pane.add(cancel, 1, 4);
        cancel.setOnAction(e -> Platform.exit());

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("The Recovery of Missing people");
        stage.getIcons().add(new Image("logo.png"));
        stage.show();
	}
	
}
