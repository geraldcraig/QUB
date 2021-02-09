package uk.ac.qub.revision;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {

	public static void main(String[] args) {
	
		File file = new File("songs.txt");
		String song = "Heroes";
		 
			
				
				if(!file.exists()) 
					try {
						if(!file.exists()) {
						
						file.createNewFile();
						}
						FileWriter fw = new FileWriter(file.getName(), false);
						BufferedWriter bw = new BufferedWriter(fw);
						
						bw.write(song);
						
						
						bw.close();
						fw.close();
						
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					
					
				
				
				
		

	}
}


