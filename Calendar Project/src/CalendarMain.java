import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class CalendarMain {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Calendar newCalendar = new Calendar();
	    
		boolean correctClass = false;
		
		while(!correctClass){
			System.out.println("How would you like to set this event as? (Public, Private or Confidential)");	
			newCalendar.setClassification(input.nextLine());
			//correctClass = newCalendar.checkClassification(newCalendar.getClassification());
			System.out.println("Set the destination for the event.");
			newCalendar.setLocation(input.nextLine());
		}
		
		String output = "VERSION: 2.0" + "\n" + 
						"CLASS: " + newCalendar.getClassification() + "\n" +
						"LOCATION: " + newCalendar.getLocation();
		FileWriter file = new FileWriter("event.ics");
		file.write(output);
		
		file.close();
	}

}
