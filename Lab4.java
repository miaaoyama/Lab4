import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Create an array of ints then print it
		int[] printInts = {1, 2, 3};
		printAll(printInts);
	}

	// Method: loop to print all elements of an int array
	public static void printAll(int arr[]) {
		System.out.println("Printing array.");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Entry " + (i + 1) + ": " + arr[i]);
		}
	}
}