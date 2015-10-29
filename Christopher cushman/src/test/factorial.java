package test;

public class factorial {

	public static void main(String[] args) {
		System.out.println(rev("chris"));

	}
	
	public static int factorial(int n){
		if(n <= 1)
			return 1;
		return n * factorial(n-1);
	}
	
	public static int fib(int n){
		if (n <= 2)
			return 1;
		return fib(n - 1) + fib(n - 2) ;
	}
	
	public static String rev(String w){
		if(w.length() == 1)
			return w;
		return w.charAt(w.length()-1) + rev(w.substring(0,w.length() -1 ));
	}
	

}
