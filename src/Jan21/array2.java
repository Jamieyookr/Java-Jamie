package Jan21;

public class array2 {
	
	public static void main(String[] args) {
		
	}
	
	private static int[][] joinArr2(int[] arr1, int[] arr2) {
		int [][] newArr = new int[2][4];
		for (int i = 0; i < 3; i++) {
			newArr[0][i] = arr1[i];
			newArr[1][i] = arr2[i]; 
			
		}
		newArr[1][3] = arr2[3];
		
		return newArr;
	}

}
