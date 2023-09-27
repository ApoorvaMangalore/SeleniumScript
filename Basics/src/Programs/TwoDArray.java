package Programs;

public class TwoDArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5, 6 };
		int[] arr3 = { 7, 8, 9 };

		int[][] arr = { arr1, arr2, arr3 };
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][2]);
	}
}
