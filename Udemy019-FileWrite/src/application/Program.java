package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good Morning", "Good afternoon", "Good Night" };

		String path = "C:\\Users\\Machinery\\Desktop\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) { 
			//new FileWriter(path,true) TRUE keeps archive
			for (String line : lines) {
				bw.write(line);
				bw.newLine();

			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
