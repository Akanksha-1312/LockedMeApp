/*Devoloped by Akanksha Mishra
 * this file is for delete a file in a directory.
 */ 
package mainApp;

import java.io.File;
import java.io.IOException;

public class DeleteFiles {
public void deleteFile(String path , String fileName) throws IOException {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
		
		
		if (fileName == null || fileName.isEmpty() || fileName.isBlank())
			throw new NullPointerException("File Name cannot be Empty or null");
		
		File newFile = new File(path + File.separator + fileName);
		
		boolean deleteFile = newFile.delete();
		
		if (deleteFile) {
			
			System.out.println("\nFile deleted Successfully");
			
		}else {
			
			System.out.println("\nFile Not Found.. Please try again." );
			
		}
			
	}
	

}
