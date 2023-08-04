class Main{

	void  fun (float x){
	
		System.out.println("In fun");
		System.out.println(x);
	}
	public static void main(String args []){
	
		Main obj = new Main();
		obj.fun(10);
		obj.fun(10.5f);
		obj.fun('A');
	}
}
