import java.io.*;

class Main{

	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("building name");
		String name = br.readLine();

		System.out.println("Wing");
		char wing =(char)br.read();
		
		br.skip(1);

		System.out.println("flat no");
		int num = Integer.parseInt(br.readLine());

		System.out.println(name + wing + num);
	}
}
