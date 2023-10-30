package SamplePkg;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class filesOperations {
    public static void main(String[] args) {
        File fileObj = new File("C:\\Users\\duure\\Desktop\\NewFile.txt");
        try {
            System.out.println(fileObj.canRead());            
            System.out.println(fileObj.canWrite());
            System.out.println(fileObj.getAbsolutePath());
            System.out.println(fileObj.length());

            if (fileObj.createNewFile()) {
                System.out.println("NewFile Created!");
            } else {
                System.out.println("Already exists");
            }

            try (FileWriter fileWriter = new FileWriter(fileObj)) {
                fileWriter.append("Java is not easy:(");
            }

            Scanner scanInput = new Scanner(System.in);
            StringBuilder data = new StringBuilder();
            
            System.out.println("Enter your data (type 'exit' to stop):");
            while (true) {
                String line = scanInput.nextLine();
                if ("exit".equalsIgnoreCase(line)) {
                    break;
                }
                data.append(line).append("\n");
            }

            try (FileWriter fileWriter = new FileWriter(fileObj, true)) {
                fileWriter.append(data.toString());
            }
            
            System.out.println("File Content:\n" + data.toString());
            scanInput.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}