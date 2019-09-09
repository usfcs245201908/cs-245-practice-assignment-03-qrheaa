public class LinearSearch implements Practice03Search {

	public String searchName() {
		return "Linear Search";
	}

	public int search(int [] arr, int target) {
		//Linear search: go in sequence in array
		//Stop when finding target and return index
		for(int i = 0; i < arr.length-1; i++) {
			if(target == arr[i])
				return i;
		}
		return -1;
		//In the case that target does not exist

	}
}

//Average/Worst case scenario: O(n)