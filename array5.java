import java.util.*;

class Array{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the Size of an array");
		
		int n = sc.nextInt();

		int arr [] = new int[n];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
		}
		int num1=arr[0];
		for(int i=0; i<arr.length; i++){
		
			if(arr[i]<num1){
			
				num1=arr[i];
			}
		}
		System.out.println(num1);
	
	}
}
