import java.lang.Math;
public class Primes{
	static int findPrimes(int n, boolean printPrimes) { 
			boolean isPrime = true; 
			int numPrimes = 0; 
			for (int i = 2; i <= n; i++) { 
				isPrime = true; 
				for (int j = 2; j < i; j++) { 
					if (i % j == 0) { 
						isPrime = false; 
						break; }
				}						
				if (isPrime) { 
					++numPrimes; 
					if (printPrimes) 
						System.out.println(i); 
				} 
			} 
			return numPrimes;
	}			
	static int findPrimesFaster(int n, boolean printPrimes) {
		int numPrimes = 0;
		outer: for (int i = 2; i <= n; i++) {
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					continue outer;  
				}
			}
			numPrimes++;
			if (printPrimes) {
				System.out.println(i);
			}
		}

		return numPrimes;
	}

	public static void main(String[] args){
		int a=findPrimesFaster(30,true);
		System.out.println(a);
	}
}