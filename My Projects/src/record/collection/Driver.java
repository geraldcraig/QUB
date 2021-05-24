package record.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Driver {
	
	public static List<Records> record = new ArrayList<Records>();

	public static void main(String[] args) {
	
	
		File file = new File("test.csv");
		FileReader fr;
		try {
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String line = br.readLine();
			//line = br.readLine();
			
			while(line != null) {
				String[] parts = line.split(",");
				String fullName = parts[0];
				String[] names = fullName.split(" ", 2);
				String firstName = names[0];
				String surname = names[1];
				String title = parts[1];
				int format = Integer.parseInt(parts[2]);
				int year = Integer.parseInt(parts[3]);
				
				Records records = new Records(firstName, surname, title, format, year);
				record.add(records);
				
				line = br.readLine();
			}
			
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Records r : record) {
			System.out.println(r);
		}
		
		
	} 	

}
