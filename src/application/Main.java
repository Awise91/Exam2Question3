package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	  public void start(Stage stage) {
	    GridPane grid = new GridPane();
	   	    
	    ComboBox<String> MonthBox = new ComboBox<String>();
	    MonthBox.getItems().addAll("January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August",
				"September",
				"October",
				"November",
				"December");
	    MonthBox.setEditable(true);        
	    
	    Scene sceneD = new Scene(new Group(), 450, 250);
	    
	    ComboBox<String> DayBox = new ComboBox<String>();
	    DayBox.getItems().addAll("1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"10",
			"11",
			"12",
			"13",
			"14",
			"15",
			"16",
			"17",
			"18",
			"19",
			"20",
			"21",
			"22",
			"23",
			"24",
			"25",
			"26",
			"27",
			"28",
			"29",
			"30",
			"31");
	    DayBox.setEditable(true);
	    
	    
	    ComboBox<String> YearBox = new ComboBox<String>();
	    YearBox.getItems().addAll("2010",
			"2011",
			"2012",
			"2013",
			"2014",
			"2015",
			"2016",
			"2017",
			"2018",
			"2019",
			"2020");
	    YearBox.setEditable(true);
	    
	    grid.add(new Label("Month"),0,0);
	    grid.add(new Label("Day"),0,1);
	    grid.add(new Label("Year"), 0, 2);
	    grid.add(MonthBox, 1, 0);
	    grid.add(DayBox, 1, 1);
	    grid.add(YearBox,1,2);
	   
	    stage.setScene(new Scene(grid,350,150));
	    stage.show();
}
}
