package logical;

public class Fibonacci {

	public static void main(String[] args) {

		int a=0, b=1, c=0;
		
		for(int i=0; i<6; i++) {
			c = a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		
	}

}
