package Jan21;

import java.util.Arrays;

public class array0 {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60, 70 };

		int[] arr3 = joinArr(arr1, arr2); //

		System.out.println(Arrays.toString(arr3));

	}

	static int[] joinArr(int[] arr1, int[] arr2) {
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[i + arr1.length] = arr2[i]; ////
		}
		return newArr;
	}

}
