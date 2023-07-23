import java.util.Scanner;
class Main{

	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	        int multiple = 0;
		int i=0;

		while(i<=n){
		
			multiple = 4*i;
			System.out.println(multiple);
			i++;
		}
		System.out.println(multiple);
		
	}
}
