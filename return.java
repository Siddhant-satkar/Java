class Main{

	int fun (int x){
		System.out.println("in fun");
		return x+10;
	}
	public static void main(String args []){
	
		Main obj = new Main();
		System.out.println("in main");
		System.out.println(obj.fun(10));
	}
}

