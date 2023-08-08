import java.util.*;

class Array{

	public static void main(String args []){
	
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		arr[3] = sc.nextInt();
		arr[4] = sc.nextInt();
		
		int sum = 0;

		for(int i=0; i < arr.length; i++){
		
			sum = sum + arr[i];	
		}
		
		System.out.println(sum);
	}
}
