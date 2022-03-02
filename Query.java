import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Query {
    public ObservableList<DNArecord> dataList;
    public ArrayList<DNArecord> data = new ArrayList<>();
    DataBaseConnection connectionTOSQL = new DataBaseConnection();

    @SuppressWarnings("unchecked")
    public void tableView(Stage stage, GridPane pane) {
        TableView<DNArecord> myDataTable = new TableView<DNArecord>();
        
        Scene scene = new Scene(pane);
        stage.setTitle("DNA Table");

        TableColumn<DNArecord, String> customerID = new TableColumn<DNArecord, String>("Name");
        customerID.setCellValueFactory(new PropertyValueFactory<DNArecord, String>("name"));

        TableColumn<DNArecord, Integer> accountType = new TableColumn<DNArecord, Integer>("Number");
        accountType.setCellValueFactory(new PropertyValueFactory<DNArecord, Integer>("number"));

        TableColumn<DNArecord, String> customerID2 = new TableColumn<DNArecord, String>("DNA");
        customerID2.setCellValueFactory(new PropertyValueFactory<DNArecord, String>("DNA"));
        
        TableColumn<DNArecord, Integer> id = new TableColumn<DNArecord, Integer> ("ID");
        id.setCellValueFactory(new PropertyValueFactory<DNArecord, Integer> ("id"));
        
        myDataTable.setItems(dataList);
        myDataTable.getColumns().addAll( customerID ,accountType,customerID2,id);
        
        Button close = new Button("Close");
        close.setPrefSize(100,30);
        close.setFont(Font.font(14));
        close.setTextFill(Color.BLACK);
        close.setStyle("-fx-background-color: #9FD8CB;");
        GridPane.setHalignment(close, HPos.CENTER);close.setOnAction(k-> {
            data.clear();
            stage.close();
        });
        pane.add(myDataTable,1,1);
        pane.add(close,1,2);
        GridPane.setHalignment(close, HPos.CENTER);
        stage.setScene(scene);
    }

    private void getRecordData() throws SQLException, ClassNotFoundException {
        String SQL;
        connectionTOSQL.connect();

        System.out.println("Connection established");

        SQL = "select * from records ";
        Statement stmt = connectionTOSQL.getCon().createStatement();
        ResultSet rs = stmt.executeQuery(SQL);

        while ( rs.next() )
            data.add(new DNArecord(
                    rs.getString(1),
                    Integer.parseInt(rs.getString(2)),
                    rs.getString(3),
                    Integer.parseInt(rs.getString(4)))
            	);

        rs.close();
        stmt.close();
        connectionTOSQL.getCon().close();
        System.out.println("Connection closed" + data.size());
    }

    public void getData() throws SQLException, ClassNotFoundException {
        getRecordData();
    }

    public void insertData(DNArecord rc) {
        try {
            connectionTOSQL.connect();

            connectionTOSQL.ExecuteStatement("Insert into records(name1, number1, dna) values(" +"'"
                     + rc.getName() +"', "
                     + rc.getNumber() +",'"
                     + rc.getDNA() +"'"
                     +");");
            
            System.out.println();
            connectionTOSQL.getCon().close();
            System.out.println("Connection closed" + data.size());

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public String delete(String conditions) {
        String answer ="";
        String search = search(conditions);
        if(search=="Found"){
	        try {
	            String sql="Delete from records Where ";
	            connectionTOSQL.connect();
                sql = sql.concat("id" + " = " + "'" + conditions + "'");
	            
	            boolean ans= connectionTOSQL.ExecuteStatement(sql+";");
	            if(ans== true) {
	                answer ="DNA record Deleted";
	            } else {
	                answer ="DNA record not Deleted";
	            }
	            connectionTOSQL.getCon().close();
	            System.out.println("Connection closed");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
        }else{
            answer ="DNA was'nt found to be Delete";
        }
        return answer;
    }

    public String search(String conditions) {
        ObservableList<DNArecord> dataList = null ;
        TableView<DNArecord> myDataTable = new TableView<DNArecord>();
        ArrayList<DNArecord> data = new ArrayList<>();

        String answer="";
        try {
            String sql="Select *";
            connectionTOSQL.connect();
            sql= sql.concat(" From records Where ");
            sql = sql.concat("id" + " = " + "'" + conditions + "'");
            System.out.println(sql);

            Statement stmt = connectionTOSQL.getCon().createStatement();
            ResultSet rs = stmt.executeQuery(sql+";");

            while (rs.next())
                data.add(
                        new DNArecord(                             
                        		rs.getString("name1"),
                                rs.getInt("number1"),
                                rs.getString("dna"),
                                rs.getInt("ID")                            
                        )
                );
            rs.close();
            stmt.close();
            connectionTOSQL.getCon().close();
            System.out.println("Connection closed");

            dataList = FXCollections.observableArrayList(data);

            myDataTable.setItems((ObservableList<DNArecord>) dataList);

            if(data.isEmpty()) {
                answer= "Nothing was found";
            } else {
                answer= "Found";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return answer;
    }

	@SuppressWarnings("unchecked")
	public String search(String conditions, GridPane pane5, int i, int j) {
        ObservableList<DNArecord> dataList = null ;
        TableView<DNArecord> myDataTable = new TableView<DNArecord>();
        ArrayList<DNArecord> data = new ArrayList<>();
        
    	String answer="";
    	try {
            String sql="Select *";
            connectionTOSQL.connect();
            
            TableColumn<DNArecord, String> customerID = new TableColumn<DNArecord, String>("Name");
            customerID.setCellValueFactory(new PropertyValueFactory<DNArecord, String>("name"));

            TableColumn<DNArecord, Integer> accountType = new TableColumn<DNArecord, Integer>("Number");
            accountType.setCellValueFactory(new PropertyValueFactory<DNArecord, Integer>("number"));

            TableColumn<DNArecord, String> customerID2 = new TableColumn<DNArecord, String>("DNA");
            customerID2.setCellValueFactory(new PropertyValueFactory<DNArecord, String>("DNA"));
            
            TableColumn<DNArecord, Integer> id = new TableColumn<DNArecord, Integer> ("ID");
            id.setCellValueFactory(new PropertyValueFactory<DNArecord, Integer> ("id"));
            
            myDataTable.setItems(dataList);
            myDataTable.getColumns().addAll( customerID ,accountType,customerID2,id);
	        
	    	sql= sql.concat(" From records Where ");
            sql = sql.concat("dna" + " = " + "'" + conditions + "'");

	    	System.out.println(sql);
	    	
            Statement stmt = connectionTOSQL.getCon().createStatement();
            ResultSet rs = stmt.executeQuery(sql+";");
            
            while (rs.next())
                data.add(
                		new DNArecord(
                                rs.getString("name1"),                                
                		        rs.getInt("number1"),
                                rs.getString("dna"),                                
                                rs.getInt("ID")
                				)		
                 );
            rs.close();
            stmt.close();
	        connectionTOSQL.getCon().close();
            System.out.println("Connection closed");
            
            dataList = FXCollections.observableArrayList(data);

	        myDataTable.setItems((ObservableList<DNArecord>) dataList);
	    	
	        if(data.isEmpty()) {
	    		answer= "Nothing was found";
	    	} else {
	    		pane5.add(myDataTable,i,j);
	    		answer= "Found";
	    	}
            
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
    	return answer;
    }


}
