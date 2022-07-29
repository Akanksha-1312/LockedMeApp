/*Devoloped by Akanksha Mishra
 * this file is for running and giving the path.*/
package mainApp;

public class RunFile {
	
	/*Please enter your desired path,by default path is given by me may not exist in your system*/
	public static final String path = "P:\\javafsd\\JAVAdemo\\File Temp"; 
	
	public static void main(String[] args) {
		MenuLockMe menu = new MenuLockMe();
		//for introduction 
		menu.firstScreen();
		//for user interface 
		menu.mainMenu();
	}
	
}
