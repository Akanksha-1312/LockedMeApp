/*Devoloped by Akanksha Mishra
 * this file is for Menu Operations which You can See on Console*/

package mainApp;

import java.io.IOException;
import java.util.Scanner;
public class MenuLockMe {
	Scanner scan = new Scanner(System.in);
	
	public void firstScreen() {
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("*             WELCOME  USER TO                  *");
		System.out.println("*               LOCKEDME.COM                    *");
		System.out.println("*===============================================*");
		System.out.println("*      DEVELOPED BY Akanksha Mishra             *");
		System.out.println("*************************************************");
		System.out.println("*   Directory: " + RunFile.path +"    *");
		System.out.println("*************************************************");
		System.out.println("\n\n");
	}
	public void exitScreen() {
		
		System.out.println(" =============================================== ");
		System.out.println(" _______________________________________________ ");
		System.out.println("|                                               |");
		System.out.println("|            THANK YOU FOR VISITING             |");
		System.out.println("|                 LOCKEDME.COM                  |");
		System.out.println("|_______________________________________________|");
		System.out.println(" =============================================== ");
		System.out.println("\n\n");
		
		
	}
	
	public void mainMenuOptions() {
		System.out.println("=================================================");
		System.out.println("|            MAIN MENU                          |");
		System.out.println("-------------------------------------------------");
		System.out.println("| Select any one of the following:              |");
	    System.out.println("|   1 - List All Files                          |");
	    System.out.println("|   2 - File Options                            |");
	    System.out.println("|   3 - Exit                                    |");
	    System.out.println("=================================================");
	    System.out.println("Enter your choice : ");
	}
	
	public void subMenuOptions() {
		
		System.out.println("=================================================");
		System.out.println("|            SUB MENU                           |");
		System.out.println("-------------------------------------------------");
		System.out.println("| Select any one of the following:              |");
	    System.out.println("|   1 - Add a file                              |");
	    System.out.println("|   2 - Delete a file                           |");
	    System.out.println("|   3 - Search a file                           |");
	    System.out.println("|   4 - Go Back                                 |");
	    System.out.println("=================================================");
	    System.out.println("Enter your choice : ");
		
	}
	
	public void mainMenu() {
		
		int choice = 0;
		char decision = 0;
		do {
			
			mainMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("\nInvalid Input \nValid Input Integers:(1-3)\n");
				mainMenu();
			}
			
			
			switch (choice) {
			
			case 1:
					System.out.println();
					try {
						ListAllFiles obj1=new ListAllFiles();
						obj1.listAllFiles(RunFile.path);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("\n***********************************\n");
					break;
					
			case 2: 
					System.out.println();
					subMenu();
					break;
					
			case 3: 
					System.out.println("\n Are you sure you want to exit ? ");
					System.out.println("  (Y) ==> Yes    (N) ==> No        ");
					decision =  scan.nextLine().toUpperCase().charAt(0);
					if(decision == 'Y') {
						System.out.println("\n");
						exitScreen();
						System.exit(1);
					}else if(decision == 'N') {
						System.out.println("\n");
						mainMenu();
					}else {
						System.out.println("\nInvalid Input \nValid Inputs :(Y/N)\n");
						mainMenu();
					}
					
					
			default:
					System.out.println("\nInvalid Input \nValid Input Integers:(1-3)\n");
					mainMenu();
				
			}
			
			
		}while(true);
		
	}
	
	
	public void subMenu() {
		String file = null;
		String fileName = null;
		int choice = 0;
		
		do {
			
			subMenuOptions();
			
			try {
				choice = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input \nValid Input Integers:(1-4)");
				subMenu();
			}
			
			
			switch (choice) {
			case 1: 
					System.out.println("\n==> Adding a File...");
					System.out.println("Please enter a file name : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {CreateFile obj2=new CreateFile();
						obj2.createNewFile(RunFile.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IOException e) {
						System.out.println("Error occurred while adding file..");
						System.out.println("Please try again...");
					}catch(Exception e) {
						System.out.println("Error occurred while adding file..");
						System.out.println("Please try again...");
					}
					System.out.println("\n**********************************\n");
					break;
					
			case 2: 
					System.out.println("\n==> Deleting a File...");
					System.out.println("Please enter a file name to Delete : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {DeleteFiles obj3=new DeleteFiles();
						obj3.deleteFile(RunFile.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IOException e) {
						System.out.println("Error occurred while Deleting File..");
						System.out.println("Please try again...");
					}catch(Exception e) {
						System.out.println("Error occurred while Deleting File..");
						System.out.println("Please try again...");
					}
					System.out.println("\n***********************************\n");
					break;
					
			case 3: 
					System.out.println("\n==> Searching a File...");
					System.out.println("Please enter a file name to Search : ");
					file = scan.nextLine();
					fileName = file.trim();
					try {SearchFiles obj4=new SearchFiles();
						
						obj4.searchFile(RunFile.path, fileName);
					}catch(NullPointerException e) {
						System.out.println(e.getMessage());
					}catch(IllegalArgumentException e) {
						System.out.println(e.getMessage());
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}
					System.out.println("\n***********************************\n");
					break;
			case 4: mainMenu();
					break;
					
			default:
				System.out.println("Invalid Input \nValid Input Integers:(1-4)");
				subMenu();
				
			}
			
		file = null;
		fileName = null;
			
		}while(true);
		
	}

}
