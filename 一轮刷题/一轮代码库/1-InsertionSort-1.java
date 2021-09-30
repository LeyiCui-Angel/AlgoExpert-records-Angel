/* Leyi Cui by 07/30 23:41 at home
* Use time: 40:00 ~
* Notes: Been foolish of creating the helper method & make things too complex.
* Performance: Bad, may need review.
*/

import java.util.*;

class Program {
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		if (array.length == 0 || array.length == 1){
			return array;
		}
		for (int i = 1; i < array.length; i++){
			int p = i;
			while (p > 0 && array[p] < array[p-1]){
				swap(p, p-1, array);
				p--;
			}
		}
		return array;
	}
	
	private static void swap(int i, int j, int[] a){
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}
}
