/* Leyi Cui by 07/31 00:20 at home
* Use time: 16:04
* Notes: Keep calm and follow your own code.
*/

import java.util.*;

class Program {
  public static int[] selectionSort(int[] array) {
    // Write your code here.
    if (array.length == 0 || array.length == 1){
			return array;
		}
		for (int i = 0; i < array.length - 1; i++){
			int note = i;
			for (int p = i; p < array.length - 1; p++){
				if (array[p+1] < array[note]){
					note = p+1;
				}
			}
			swap(i, note, array);
		}
		return array;
  }
	
	private static void swap(int i, int j, int[] a){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
