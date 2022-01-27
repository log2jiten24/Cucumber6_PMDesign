package javapractice;

public class Max_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 10, 20, 90, 24, 96 };

		int max = Integer.MIN_VALUE;

		for (int element : array) {

			if (element > max) {

				max = element;
			}
		}
	System.out.println("Max value inside the array :" + max);

	}

}
