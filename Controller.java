package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller {
	public TextField t1;
	public AnchorPane myPane;
	public void menu1(ActionEvent e) {
		System.out.println("Menu Option 1");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();  
		t1.setText(dtf.format(now));
	}
	
	public void menu2(ActionEvent e) {
		try {
		FileOutputStream fileStream = null;
		PrintWriter writer = null;
		fileStream = new FileOutputStream("C:\\Users\\lukej\\Documents\\log.txt");
		writer = new PrintWriter(fileStream);
		writer.println(t1.getText());
		writer.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void menu3(ActionEvent e) {
		Random rand = new Random();
		float red = rand.nextFloat();
		float blue = rand.nextFloat();
		float green = 1;
		Color myColor = Color.color(red, green, blue);
		myPane.setBackground(new Background(new BackgroundFill(myColor, null, null)));
	}
	
	public void menu4(ActionEvent e) {
		Platform.exit();
	}
}
