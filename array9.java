class Array{

	public static int binarySearch(int arr[], int key){
	
		int start=0;
		int end = arr.length - 1;
		int mid = (start + end)/2;
		while(start<=end){
		
			if(arr[mid]==key){
			
				return mid;
			}
			if(arr[mid]>key){
			
				end = mid - 1;
			}
			else{
			
				start = mid + 1;
			}
		}
		return -1;
	}
	public static void main(String args []){
	
		int arr[] = {2,3,4,5,6,8,7};
		int key = 5;	
		int index = binarySearch(arr, key);
		if(index == -1){
		
			System.out.println("Key not found");
		}else{
		
			System.out.println("key found at the index = " + index);
		}

		
	}
}
