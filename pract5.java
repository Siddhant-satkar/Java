import java.io.*;
class Main{

	public static void main(String args [])throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String name = br.readLine();
		char group = (char)br.read();
		br.skip(1);
		int joursy = Integer.parseInt(br.readLine());
		int strike = Integer.parseInt(br.readLine());
	}
}
