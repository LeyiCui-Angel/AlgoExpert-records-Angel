import java.util.*;

class Program {
	public int[] threeNumberSort(int[] array, int[] order) {
    // Write your code here.
		int start = 0;
		
		for (int i = 0; i < array.length; i++){
			if (array[i] == order[0]){
				int temp1 = array[i];
				array[i] = array[start];
				array[start] = temp1;
				start++;
			}
		}
		
		for (int k = 0; k < array.length; k++){
			if (array[k] == order[1]){
				int temp2 = array[k];
				array[k] = array[start];
				array[start] = temp2;
				start++;
			}
		}
		
		return array;
	}
	
}
