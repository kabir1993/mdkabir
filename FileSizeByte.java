package pSolve;

import java.io.File;

public class FileSizeByte {
	
	public static void fileSize(String fileName) {
		File file = new File(fileName);
		if(file.exists()) {
			long bytes = file.length();
			System.out.printf("%d is the file size in bytes ", bytes);
		}
		else {
			System.out.println("Your file doesn't exist");
		}
	}

	public static void main(String[] args) {
		String fileName = "E:/Mywork/calender.jpg";
		fileSize(fileName);

	}

}
