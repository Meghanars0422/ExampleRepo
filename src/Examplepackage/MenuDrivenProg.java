package Examplepackage;

import java.util.Scanner;

public class MenuDrivenProg {
	 private static final Scanner scnr = new Scanner(System.in);

	private static int menu() {
        System.out.println("WELCOME! to main menu Please choose from the following");
        System.out.println("1. Sort Files in asceding order");
        System.out.println("2. File create,Delete and Search option");
        System.out.println("3. Exit");
        System.out.println("Enter your choice::");
        int userChoice = scnr.nextInt();
        scnr.nextLine();
        return userChoice;
    }
	private static int animalSelect() {
		System.out.println("Sub-Menu");
	        System.out.println("1. Creation of File");
	        System.out.println("2. Delete a file");
	        System.out.println("3. Search a file");
	        System.out.println("Enter your choice::");
	        int userChoice = scnr.nextInt();
	        scnr.nextLine();
	        return userChoice;
	}
	
	public void menuList() {
		String path = "C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject";

		while(true) {
			int userChoice = menu();
			switch(userChoice) {
			case 1 : 
				System.out.println("creation");
				SearchFile searchfile = new SearchFile();
				searchfile.sortFiles(path);
		        break;
			case 2: 
			int animal = animalSelect();
	        switch(animal) {
	        case 1:
	        	CreateFile filecreation = new CreateFile();
	        	filecreation.newFile();
	            System.out.println("created");
	            break;
	         case 2:
	        	 DeleteFile filedeletion = new DeleteFile();
	        	 filedeletion.deleteFileMethod();
	            break;
	         case 3:
	            FindFile file = new FindFile();
	            file.FindFileMethod();
	            break;
	         default:
	            System.out.println("ERROR: Invalid Selection");
	            break;
	        }
	        break;
			
			case 3: System.out.println("Thank you");
			System.exit(0);
			
			default: System.out.println("Invalid selection");
			}
		}
	}
	//public static void main(String[] args) {
//		String path = "C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject";
//
//		while(true) {
//			int userChoice = menu();
//			switch(userChoice) {
//			case 1 : 
//				System.out.println("creation");
//				SearchFile searchfile = new SearchFile();
//				searchfile.sortFiles(path);
//		        break;
//			case 2: 
//			int animal = animalSelect();
//	        switch(animal) {
//	        case 1:
//	        	CreateFile filecreation = new CreateFile();
//	        	filecreation.newFile();
//	            System.out.println("created");
//	            break;
//	         case 2:
//	        	 DeleteFile filedeletion = new DeleteFile();
//	        	 filedeletion.deleteFileMethod();
//	            break;
//	         case 3:
//	            FindFile file = new FindFile();
//	            file.FindFileMethod();
//	            break;
//	         default:
//	            System.out.println("ERROR: Invalid Selection");
//	            break;
//	        }
//	        break;
//			
//			case 3: System.out.println("Thank you");
//			System.exit(0);
//			
//			default: System.out.println("Invalid selection");
//			}
//		}
	//}
}
