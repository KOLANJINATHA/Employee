package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SeventhFileNotFoundException {
	public static void main(String[] args) throws IOException {
		try {
		File f = new File("C:\\Users\\kolanjinathan\\Documents\\ExceptionFile.txt");
		FileReader fr = new FileReader(f);
		int temp=0;
		while((temp=fr.read())!=-1) {
			System.out.print((char)temp);
		}
		System.out.println();
		}
		catch(FileNotFoundException ff) {
			ff.printStackTrace();
		}
		finally {
			System.out.println("DB is closed");
		}
		
	}

}
