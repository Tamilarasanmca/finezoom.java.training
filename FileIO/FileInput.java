package FileIO;

import java.io.*;

public class FileInput {
	public static void main(String[] args) throws IOException {
	FileInputStream fi = new FileInputStream("G:tamil.txt");
	int i;
	while((i=fi.read() )!= -1){
		System.out.print((char) i);
	}
	fi.close();
	}
}
