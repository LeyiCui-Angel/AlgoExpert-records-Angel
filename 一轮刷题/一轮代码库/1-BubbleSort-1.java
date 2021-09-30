/* Leyi Cui by 07/30 22:18 at home
* Use time: 16:16
* Notes: Forgot to consider special cases (when the length of the array is 1).
*/

import java.util.*;

class Program {
  public static int[] bubbleSort(int[] array) {
    // Write your code here.
		int iterate = array.length;
		boolean keepAlgo = true;
		if (iterate == 0 || iterate == 1){
			return array;
		}
		while (keepAlgo){
			for (int i = 1; i < iterate; i++){
				if (array[i-1] > array[i]){
					int temp = array[i-1];
					array[i-1] = array[i];
					array[i] = temp;
				}
			}
			iterate--;
			if (iterate == 1){
				keepAlgo = false;
			}
		}
    return array;
  }
}
