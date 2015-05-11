package application;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class Controller extends Dates {
	
	@FXML
	Label Month = new Label("Month");
	
	@FXML
	ObservableList<String> MonthBox = FXCollections.observableArrayList (
			"January",
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
	
	ComboBox month = new ComboBox(MonthBox);
	
	@FXML
	Label Day = new Label("Day");
	
	@FXML
	ObservableList<String> DayBox = FXCollections.observableArrayList(
			"1",
			"2,",
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
	
	ComboBox day = new ComboBox(DayBox);
	
	@FXML
	Label Year = new Label("Year");
	
	@FXML
	ObservableList<String> YearBox = FXCollections.observableArrayList (
			"2010",
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
	
	ComboBox year = new ComboBox(YearBox);
	
	public Controller() {
		
		FXMLLoader fxmlloader =  new FXMLLoader(getClass().getResource("Dates.fxml"));
		
		fxmlloader.setRoot(this);
		fxmlloader.setController(this);
		
		try { fxmlloader.load();
		}
		catch (IOException exception) {
			throw new RuntimeException(exception);
		}
		}
	Controller control = new Controller();
	}


