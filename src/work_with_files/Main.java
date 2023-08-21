package work_with_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите ваш текст: ");
		BufferedReader br = null;
		try {
			File file = new File("output.txt");

			if (!file.exists())
				file.createNewFile();

			PrintWriter pw = new PrintWriter(file);
			pw.println(scanner.nextLine());
			pw.close();
			
			br = new BufferedReader(new FileReader("output.txt"));
			String line;
			System.out.println("Текст из файла: ");
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println("Error " + e);
		}finally {
		    if (scanner != null) {
		        scanner.close();
		    }
		    if (br != null) {
		        br.close();
		    }

	}
}
