package Lab3;

	import java.io.BufferedWriter;
	import java.io.FileWriter;
	import java.io.IOException;


	public interface WriteToFile {
		//create file that will be in the same directory as the project files 
		String fileName = "Medical.csv";
		
		
		default void WriteRecordToFile(String myString)
		{
			try{      
				//create a FileWriter - set second argument to true so it will append or create if it does not exist
	            FileWriter fw = new FileWriter(fileName, true);
	            BufferedWriter bw = new BufferedWriter(fw);
	          
	            //write the argument to the file
	            bw.write(myString);
	            //add a newline to the file
	            bw.newLine();    
	            //now make sure you close the BufferWriter and the FileWriter
	            bw.close();
	            fw.close();           
	           
	        } 
			catch(IOException e) 
			{
				
	            System.out.println(e.getMessage() + "Error occured ");
	        }
	    
		}
		//method for CSV
		
	}
	
