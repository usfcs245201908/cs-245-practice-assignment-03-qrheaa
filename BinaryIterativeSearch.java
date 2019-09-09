public class BinaryIterativeSearch implements Practice03Search {

	public String searchName() {
		return "Iterative Binary Search";
	}

	public int search(int [] arr, int target) {
		//Sorted array
		//Define low, med, and high --> low and high are the indexes of array, not elements, because trying to find index of target
		int low = 0;
		int high = arr.length - 1;
		

		while (low <= high) {
			int mid = (low+high)/2; //mid_index

			if(target == arr[mid]) 
				return mid;
		
			if(target > arr[mid]) 
				low = mid + 1; //use right half of array - change range
		
			if(target < arr[mid])
				high = mid - 1;
		}

		return -1; //if target not in array
	}
}