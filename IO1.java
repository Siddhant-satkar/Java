import java.io.*;

class Main{

	public static void main(String args [])throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter fav person");
		String person = br.readLine();
		System.out.println("enter fav book");
		String book = br.readLine();
		
		System.out.println("person" + person + "/n book" + book);
	}
}
