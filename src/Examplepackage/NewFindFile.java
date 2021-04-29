package Examplepackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewFindFile {
	public void FindFileMethod() {
		File directory = new File("C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject");
		String strName = "";
        try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file to be searched.. ");
		strName = br.readLine();
		String[] flist = directory.list();
		int flag = 0;
		if (flist == null) {
			System.out.println("Empty directory.");
		} else {

			// Linear search in the array
			for (int i = 0; i < flist.length; i++) {
				String filename = flist[i];
				if (filename.equals(strName + ".txt")) {
					System.out.println(filename + " found");
					flag = 1;
				}
			}
		}

		if (flag == 0) {
			System.out.println("File Not Found");
		}
        } 
        catch(IOException ex) {
        	System.out.println(ex);
        }
	}
	public static void main(String args[]) {
		NewFindFile file = new NewFindFile();
		file.FindFileMethod();
	}
}
