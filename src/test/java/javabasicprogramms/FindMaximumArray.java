package javabasicprogramms;

public class FindMaximumArray {

	public static void main(String[] args) {

		int arr[] = { 6, 24, 18, 29 };

		int assumed_Max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > assumed_Max) {
				// assign the maximum value inside the array
				
				assumed_Max = arr[i];

			}

		}

		System.out.println("Maximum value inside the array : " + assumed_Max);

	}

}
