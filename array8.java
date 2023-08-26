class Main{

	public static void main(String args []){
	
		int arr[]={2,5,3,46,8};
		int num1 = arr[0];

		for(int i=0;i<arr.length; i++){
		
			if(arr[i]>num1){
			
				num1=arr[i];
			}
			
		}
			System.out.println(num1);
	}
}
