package Examplepackage;

import java.io.File;
import java.util.Scanner;

public class FindFile {
	
	public void FindFileMethod() {
		File directory = new File("C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the file to be searched.. ");
		String name = scan.next();
		String[] flist = directory.list();
		int flag = 0;
		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			// Linear search in the array
			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];

				if (filename.equalsIgnoreCase(name)) {
					System.out.println(filename + " found");
					flag = 1;
				}
			}
		}

		if (flag == 0) {
			System.out.println("File Not Found");
		}
	}
	public static void main(String[] args) {
//		File directory = new File("C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject");
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the file to be searched.. ");
//		String name = scan.next();
//		String[] flist = directory.list();
//		int flag = 0;
//		if (flist == null) {
//			System.out.println("Empty directory.");
//		} else {
//
//			// Linear search in the array
//			for (int i = 0; i < flist.length; i++) {
//				String filename = flist[i];
//
//				if (filename.equalsIgnoreCase(name)) {
//					System.out.println(filename + " found");
//					flag = 1;
//				}
//			}
//		}
//
//		if (flag == 0) {
//			System.out.println("File Not Found");
//		}
	}
}
