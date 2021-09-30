// solution 3 according to the video lecture

import java.util.*;

class Program {
  public int[] threeNumberSort(int[] array, int[] order) {
    // Write your code here.
    int start = 0;
		int middle = 0;
		int end = array.length - 1;
		
		while (middle <= end){
			int v = array[middle];
			
			if (v == order[0]){
				swap(array, start, middle);
				start++;
				middle++;
			}
			else if (v == order[1]){
				middle++;
			}
			else{
				swap(array, middle, end);
				end--;
			}
		}
		return array;
  }
	
	private int[] swap(int[] array, int i1, int i2){
		int temp = array[i1];
		array[i1] = array[i2];
		array[i2] = temp;
		return array;
	}
}
