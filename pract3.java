import java.io.*;
class ISR{

	public static void main(String args []) throws IOException{
	
		InputStreamReader isr = new InputStreamReader(System.in);

		char age =(char)isr.read();
		System.out.println(age);
		System.out.println(++age);
	}
}
