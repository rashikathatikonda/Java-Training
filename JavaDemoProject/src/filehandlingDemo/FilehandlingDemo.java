package filehandlingDemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilehandlingDemo {

	public static void main(String[] args) {

//		fileInputStreamDemo();

//		fileOutputStreamDemo();

//		fileReaderDemo();

//		fileWriterDemo();

		bufferReaderDemo();

	}

	static void fileInputStreamDemo() {
		int i;
		File myfile = new File("C:\\Users\\rchappidi\\sample.txt");
		try {
			FileInputStream fis = new FileInputStream(myfile);
			System.out.println("File Opened");
			// System.out.println("^-^-^-^-^-^-^-^_^_^_^-^-^-^-^-^-^-^");
			System.out.println("------------");
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			;
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static void fileOutputStreamDemo() {
		File wefile = new File("C:\\Users\\rchappidi\\sample.txt");
		try {
			FileOutputStream fos = new FileOutputStream(wefile);
			System.out.println("File Opened");
			// System.out.println("^-^-^-^-^-^-^-^_^_^_^-^-^-^-^-^-^-^");
			System.out.println("------------");

			// splitting the argumnet into variable for understanding
			String data = "From the program this content written"; // variable
			byte[] byteArray = data.getBytes(); // variable
			fos.write(byteArray); // Argument
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void fileReaderDemo() {
		int i;
		File myfile = new File("C:\\Users\\rchappidi\\sample.txt");
		try {
			FileReader fr = new FileReader(myfile);
			System.out.println("File Opened");
			// System.out.println("^-^-^-^-^-^-^-^_^_^_^-^-^-^-^-^-^-^");
			System.out.println("------------");
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			;
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void fileWriterDemo() {
		File wefile = new File("C:\\Users\\rchappidi\\sample.txt");
		try {
			FileWriter fw = new FileWriter(wefile);
			System.out.println("File Opened");
			// System.out.println("^-^-^-^-^-^-^-^_^_^_^-^-^-^-^-^-^-^");
			System.out.println("------------");

			fw.write("using file writer to write\n");// Argument
			fw.write("using file writer to write this line 2");
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static void bufferReaderDemo() {
		String line;
		File myfile = new File("C:\\Users\\rchappidi\\sample.txt");
		try {
			FileReader fr = new FileReader(myfile);
			BufferedReader br = new BufferedReader(fr);
			System.out.println("File Opened");
			// System.out.println("^-^-^-^-^-^-^-^_^_^_^-^-^-^-^-^-^-^");
			System.out.println("------------");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			;
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}