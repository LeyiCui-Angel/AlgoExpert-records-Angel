import java.util.*;

class Program {
  public static int[] quickSort(int[] array) {
    // Write your code here.
		if (array.length == 0 || array.length == 1){
			return array;
		}
		else{
			quickSort(array, 0, array.length - 1);
			return array;
		}
  }
	
	private static void quickSort(int[] array, int left, int right){
		int start = left;
		int end = right;
		int pivot = left;
		int l = right - left + 1;
		left++;
		
		if (l <= 1){
			return;
		}
		
		while (left <= right){
			if (array[left] <= array[pivot] && array[right] >= array[pivot]){
				left++;
				right--;
			}
			else if (array[left] > array[pivot] && array[right] >= array[pivot]){
				right--;
			}
			else if (array[left] <= array[pivot] && array[right] < array[pivot]){
				left++;
			}
			else if (array[left] > array[pivot] && array[right] < array[pivot]){
				swap(array, left, right);
				left++;
				right--;
			}
		}
		swap(array, pivot, right);

		boolean leftSmaller = right - 1 - start < end - (right + 1);
		if (leftSmaller){
			quickSort(array, start, right - 1);
			quickSort(array, right + 1, end);
		}
		else{
			quickSort(array, right + 1, end);
			quickSort(array, start, right - 1);
		}
	}
	
	private static int[] swap(int[] array, int a1, int a2){
		int temp = array[a1];
		array[a1] = array[a2];
		array[a2] = temp;
		return array;
	}
	
}
