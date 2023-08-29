import java.util.*;
import java.io.*;

class Main{

	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter building name, wing, flat number");
		String info = br.readLine();
		System.out.println(info);

		StringTokenizer obj = new StringTokenizer(info, ",");
		String token1 = obj.nextToken();
		String token2 = obj.nextToken();
		String token3 = obj.nextToken();
		
		System.out.println(token1 + token2 + token3);
	
	}
}
