import java.io.*;

class Main{

	public static void main(String args [])throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the name of player");
		String name = br.readLine();

		System.out.println("enter the age");
		int age = Integer.parseInt(br.readLine());

		System.out.println("enter the avg");
		float avg = Float.parseFloat(br.readLine());

		System.out.println(name + age + avg );
	}
}
