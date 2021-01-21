package notes;

import java.util.Arrays;

public class Note2 {




	// 과제1
	static int[] joinArr(int[] arr1, int[] arr2) {
		      int[] newArr = new int[arr1.length + arr2.length];
		      
		      return newArr;
		   }

	public static void main(String[] args) {
		      int[] arr1 = {10, 20, 30};
		      int[] arr2 = {40, 50, 60, 70};
		      
		      int[] arr3 = joinArr(arr1, arr2);
		      
		      System.out.println(Arrays.toString(arr3)); // [10, 20, 30, 40, 50, 60, 70]
		      
		      // 과제2
		      int[][] arr4 = joinArr2(arr1, arr2);
		      arr1[0] = 100; // arr1의 내용을 바꿔도  arr4는 변경되지 않아야 한다.
		      for(int i=0; i<arr4.length; i++) {
		         for(int j=0; j<arr4[i].length; j++) {
		            System.out.print(arr4[i][j] + "\t");
		         }
		         System.out.println();
		      }
		   }

	private static int[][] joinArr2(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		return null;
	}


}


