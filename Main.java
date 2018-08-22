package Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



		

public class Main {

	public static void main(String[] args) {

	    // Display menu graphics
	    System.out.println("==============================");
	    System.out.println("|   Student Report System    |");
	    System.out.println("==============================");
	    System.out.println("| 1. Display student marks   |");
	    System.out.println("| 2. Display student grades  |");
	    System.out.println("| 3. Add new student         |");
	    System.out.println("| 4. Remove student          |");
	    System.out.println("| 5. Exit                    |"); 
	    System.out.println("==============================");
		
	    //User input for menu
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your option here");
		int option = scanner.nextInt();
		
		//Switch to control user inputs
		switch (option) {
	    case 1:
	      System.out.println("Display student marks");
			String fileName = "data.csv";
			File file = new File(fileName);
			
			try {
				Scanner inputStream = new Scanner(file);
				while(inputStream.hasNext()){
					String data = inputStream.next(); //gets a whole line
					String[] values = data.split(",");
					int studentID = Integer.parseInt(values[0]);
					String firstName = values[1];
					String lastName = values[2];
					String mathMark1 = values[3];
					String mathMark2 = values[4];
					String mathMark3 = values[5];
					String englishMark1 = values[6];
					String englishMark2 = values[7];
					String englishMark3 = values[8];
					
					
					System.out.println(firstName + "  " + lastName + "  " + mathMark1 + "  " + mathMark2 + "  " + mathMark3 + "  " + englishMark1 + "  " + englishMark2 + "  " + englishMark3);
				
					
					
					
					
				}
				inputStream.close();
				
			} catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}	
	      
	      break;
	    case 2:
	      System.out.println("Display student grades");
	      break;
	    case 3:
	      System.out.println("Add new student");
	      break;
	    case 4:
	      System.out.println("Remove Student");
	      break;
	    case 5:
	      System.out.println("Exit");
	      break;
	    default:
	      System.out.println("Invalid selection");
	      break; // This break is not really necessary
		
		
		}
		
		String fileName = "data.csv";
		File file = new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(file);
			while(inputStream.hasNext()){
				String data = inputStream.next(); //gets a whole line
				String[] values = data.split(",");
				int studentID = Integer.parseInt(values[0]);
				String firstName = values[1];
				String lastName = values[2];
				int mathMark1 = Integer.parseInt(values[3]);
				int mathMark2 = Integer.parseInt(values[4]);
				int mathMark3 = Integer.parseInt(values[5]);
				int englishMark1 = Integer.parseInt(values[6]);
				int englishMark2 = Integer.parseInt(values[7]);
				int englishMark3 = Integer.parseInt(values[8]);
				
				
			}
			inputStream.close();
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}		
		
		
		
		
		
		
	}

	
}
