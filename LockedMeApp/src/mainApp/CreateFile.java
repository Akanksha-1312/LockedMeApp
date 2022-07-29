/*Devoloped by Akanksha Mishra
 * this file is to create a file in the directory
 */
package mainApp;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public void createNewFile(String path , String fileName) throws IOException {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
	
		
		if (fileName == null || fileName.isEmpty() || fileName.isBlank())
			throw new NullPointerException("File Name cannot be Empty or null");
		
		File newFile = new File(path + File.separator + fileName);
		
		boolean createFile = newFile.createNewFile();
		
		if (createFile) {
			
			System.out.println("\nFile Successfully Created: " + newFile.getAbsolutePath());
			
		}else if(!createFile) {
			
			System.out.println("\nFile Already Exist.. Please try again." );
			
		}
			
	}
	

}
