/*Devoloped by Akanksha Mishra
 * this file is for display all files in a directory.
 */
package mainApp;

import java.io.File;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ListAllFiles {
public void listAllFiles(String path) {
		
		if (path == null || path.isEmpty() || path.isBlank())
			throw new NullPointerException("Path cannot be Empty or null");
			
		
		File dir = new File(path);
		
		if(!dir.exists())
			throw new IllegalArgumentException("Path does not exist \n Note: !!Please change the path in the \n code(RunFile.java) to your desired path ");
		
		if(dir.isFile())
			throw new IllegalArgumentException("The given path is a file. A directory is expected.");
		
		String [] files = dir.list();
		
		System.out.println("\n***********************************");
		if(files != null && files.length > 0) {
			
			Set<String>filesList = new TreeSet<String>(Arrays.asList(files)); 
			System.out.println("The Files in "+ dir.getAbsolutePath() + " are: \n");
			for(String file1:filesList) {
				
				System.out.println(file1);
				
			}
			
			System.out.println("\nTotal Number of files: "+ filesList.size());	
		}else {
			
			System.out.println("Directory is Empty");
		}
		
	}


}
