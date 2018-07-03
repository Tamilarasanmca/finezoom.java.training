package FileIO;
import java.io.*;
public class FileOut {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo = new FileOutputStream("G:tamil.txt"); 
        String s = "Hi Tamil....!";
        byte[] b = s.getBytes();
        fo.write(b);
        fo.close();
        System.out.print("Created....");
	}

}

