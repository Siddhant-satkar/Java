import java.util.*;

class Main{

	 static int sum = 0;
	static int mult = 0;
	static int div = 0;

	static void Sum (int a, int b){
	
		sum = a + b;
		System.out.println(sum);
	}
	static void Mult (int a, int b){
	
		mult = a * b;
		System.out.println(mult);
	}
	static void Div (int a, int b){
	
		div = a / b;
		System.out.println(div);
	}
	public static void main(String args []){
	
		int a = 10;
		int b = 5;

		Sum(a, b);
		Mult(a, b);
		Div(a, b);
	}
}
