package Jan21;

public class array1 {

	public static void main(String[] args) {
		
		
		
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

}
