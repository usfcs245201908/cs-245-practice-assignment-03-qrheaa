public class BinaryRecursiveSearch implements Practice03Search {

	public String searchName() {
		return "Recursive Binary Search";
	}

	public int search(int [] arr, int target) {
		return search(arr, target, 0, arr.length -1);
	}

	public int search(int [] arr, int target, int low, int high) {
		//Base case
		if(high >= low) {
			int mid = (low+high)/2; //mid_index
		
			if(target == arr[mid])
				return mid;

			if(target > arr[mid]) 
				return search(arr,target, mid+1, high);

			if(target < arr[mid]) 
				return search(arr,target, low, mid-1);
		}
		return -1;
	}
}