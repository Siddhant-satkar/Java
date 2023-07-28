import java.math.*;
import java.util.*;
class Main{


	public static void primeRange(int n){
	
		for(int i=2; i<=n ; i++){
		
			if(isPrime(i)){
			
				System.out.println(i + " ");
			}
		}System.out.println("");
	}

	public static void main(String [] args){
	
		primeRange(20);

	}
}
