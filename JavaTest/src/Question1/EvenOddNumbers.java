package Question1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenOddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//User input
		System.out.print("Enter the size: ");
		int size = scanner.nextInt();
		int[] numbers = new int[size];
		System.out.print("Enter the list of values: ");
		
		for (int i = 0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		//Sorting
		Arrays.sort(numbers);
		
		List<Integer> evenNumbers = new ArrayList<>();
		List<Integer> oddNumbers = new ArrayList<>();
		
		//Separating into even/odd
		for (int num: numbers) {
			if (num % 2 == 0) {
				evenNumbers.add(num);
			} else {
				oddNumbers.add(num);
			}
		}
		
		System.out.println("The even list: " + evenNumbers);
		System.out.println("The odd list: " + oddNumbers);
		
		//Finding the numbers that are divisible by 3 or 5
		System.out.print("The numbers that are divisible by 3 or 5 are: ");
		for (int even: evenNumbers) {
			if (even % 3 == 0 || even % 5 == 0) {
				System.out.print(even + " ");
			}
		}
		for (int odd: oddNumbers) {
			if (odd % 3 == 0 || odd % 5 == 0) {
				System.out.print(odd + " ");
			}
		}
	}
}
