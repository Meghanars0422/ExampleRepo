package Examplepackage;

import java.io.File;
import java.util.Arrays;

public class SearchFile {

//	public static void main(String[] args) {
//		String path = "C:\\Users\\Raghu\\eclipse-workspace\\ExampleProject";
//		SearchFile searchfile = new SearchFile();
//		searchfile.sortFiles(path);
//	}
	
	public void sortFiles(String path) {
		File dir = new File(path);

		File[] files = dir.listFiles();

		Arrays.sort(files, (f1, f2) -> {
			if (f1.isDirectory() && !f2.isDirectory()) {
				return -1;
			} else if (!f1.isDirectory() && f2.isDirectory()) {
				return 1;
			} else {
				return f1.compareTo(f2);
			}
		});

		for (File file : files) {
			if (file.getName().endsWith(".txt")) {
				System.out.println("FILE\t" + file.getName());
			}
		}
	}
}
