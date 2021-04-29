package Examplepackage;

import java.util.Scanner;

public class Menu {

	public void displaySubMenu() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Menu driven code::");
		boolean check = true;
		//menu driven template
		while(check){
			System.out.println("Choose 1 => Sort Files in asceding order");
			System.out.println("Choose 2 => File create,Delete and Search option");
			System.out.println("Choose 9 => To Exit, Enter value 9");
			
			System.out.println("Enter your choice::");
			int choice = scan.nextInt();//accept user input

			switch(choice){
			case 1: System.out.println("I am case 1");
			String path = "C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject";
			SearchFile searchfile = new SearchFile();
			searchfile.sortFiles(path);
			//method call or logic for case 1
			break;
			case 2: System.out.println("I am case 2");
			//method call or logic for case 2
			break;
			case 9: System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
		}
	}

}
