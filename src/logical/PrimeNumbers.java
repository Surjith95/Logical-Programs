package logical;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		int primeCount=0;
		for(int i=2; i<=100; i++) {
			int count=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					count=1;
					break;
				}
			}
			if(count==0) {
				System.out.println(i+ " It is a Prime Number");
				primeCount++;
			}
		}
		System.out.println("Total Numbers: "+primeCount);
	}

}
