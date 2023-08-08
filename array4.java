import java.util.*;

class Array{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int arr [] = new int[6];

		for(int i=0; i<arr.length; i++){
		
			arr[i] = sc.nextInt();
	
		if(arr[i]%2==0){
		
			count++;
		}
		}
		System.out.println(count);
	}
}
