package utility;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileReader {
	public void read() {
		File obj=new File("C:\\Users\\Lalitha\\Desktop\\demo.txt");
		try {
			Scanner sc=new Scanner(obj);
			while(sc.hasNextLine()) {
				String data=sc.nextLine();
			System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
	}
}
