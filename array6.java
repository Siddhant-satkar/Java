import java.util.*;

class Main{

	public static void main(String args []){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n = sc.nextInt();

		int arr1[] = new int[n];
		int arr2[] = new int[n];

		for(int i=0; i<arr1.length; i++){
		
			arr1[i]=sc.nextInt();
		}
		for(int j=0; j<arr2.length; j++){
			
			arr2[j]=sc.nextInt();		
		}
		for(int i=0; i<arr1.length; i++){
			
			for(int j=0; j<arr2.length; j++){
			
				if(arr1[i]!=arr2[j]){
				
					System.out.println(arr1[i]);
				}
			}
		}
		for(int i=0; i<arr1.length; i++){

                        for(int j=0; j<arr2.length; j++){

                                if(arr1[i]!=arr2[j]){

                                        System.out.println(arr2[j]);
                                }
                        }
                }

	}
}
