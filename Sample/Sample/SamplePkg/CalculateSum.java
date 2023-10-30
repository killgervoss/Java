package SamplePkg;

import java.util.Scanner;

public class CalculateSum {
	
    private int value1;
    private int value2;

    public void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        value1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        value2 = scanner.nextInt();

        int sum = value1 + value2;
        System.out.println("Sum: " + sum);

        scanner.close();
    }
	
}