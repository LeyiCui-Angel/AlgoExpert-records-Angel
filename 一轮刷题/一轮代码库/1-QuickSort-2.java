import java.util.*;

class Program {
	// driver for quicksort, provided on the textbook
  public static <AnyType extends Comparable<? super AnyType>> void quickSort(AnyType[] a) {
    quickSort(a, 0, a.length - 1);
  }
	
	// helper method to return the pivot and place it in position right-1
	private static <AnyType extends Comparable<? super AnyType>> AnyType median3(AnyType[] a, int left, int right){
		int center = (left + right) / 2;
		if (a[center].compareTo(a[left]) < 0){
			swap(a, left, center);
		}
		if (a[right].compareTo(a[left]) < 0){
			swap(a, left, right);
		}
		if (a[right].compareTo(a[center]) < 0){
			swap(a, center, right);
		}
		
		// place pivot at position right-1
		swap(a, center, right-1);
		return a[right - 1];
	}
	
	// helper method to swap elements at position i j in a
	private static void swap(AnyType[] a, int i, int j){
		AnyType t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static <AnyType extends Comparable<? super AnyType>> void quicksort (AnyType[] a, int l, int r){

		if (r <= l){
			return;
		}

		AnyType pivot = median3(a, l, r);

		AnyType[] m = partition(a, l, r);
		quicksort(a, l, m[0] - 1);
		quicksort(a, m[1] + 1, r);
	}

	private static <AnyType extends Comparable<? super AnyType>> AnyType[] partition (AnyType[] a, int l, int r){

		AnyType pivot = a[r - 1];
		int i = r - 1;
		while (i <= r){
			if (a[i].compareTo(pivot) < 0){
				swap(a, l++, i++);
			}
			else if (a[i].compareTo(pivot) > 0){
				swap(a, i, r--);
			}
			else{
				i++;
			}
		}
		return new AnyType[] {l, r};
	}
	
}
