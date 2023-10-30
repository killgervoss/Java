package SamplePkg;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filesOperations2 {

    public void writeFile() {
        try (Scanner sc1 = new Scanner(System.in);
             FileWriter file1 = new FileWriter("C:\\Users\\duure\\Desktop\\NewFile.txt");
             BufferedWriter bf1 = new BufferedWriter(file1)) {
            System.out.println("Enter the content: ");
            String data1 = sc1.nextLine();
            System.out.println("Enter the offset: ");
            int offset = sc1.nextInt();
            bf1.write(data1, offset, data1.length() - offset);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFileAndWriteContent() {
        try (Scanner sc2 = new Scanner(System.in);
             FileWriter file2 = new FileWriter("C:\\Users\\duure\\Desktop\\NewFile.txt", true);
             BufferedWriter bf2 = new BufferedWriter(file2)) {
            System.out.println("Enter the content (type 'exit' to stop): ");
            String data2;
            while (!(data2 = sc2.nextLine()).contentEquals("exit")) {
                bf2.write(data2);
                bf2.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile() {
        char[] array = new char[100];
        try {
            FileReader readFile = new FileReader("C:\\Users\\duure\\Desktop\\NewFile.txt");
            readFile.read(array);
            System.out.println("Data read from file: ");
            System.out.println(array);
            readFile.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

    public static void main(String[] args) {
        filesOperations2 operations = new filesOperations2();
        operations.writeFile();
        operations.readFileAndWriteContent();
    }
}
