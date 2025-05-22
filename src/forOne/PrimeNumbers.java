package forOne;

public class PrimeNumbers {
	public static void main(String[] args) {
		int number=6;
		boolean isPrime=true;
		
		for(int i=2;i<number;i++) {
			
			if(number % i == 0){
				
				isPrime=false;
			}
		}
		
		if(isPrime==true) {
			System.out.println(number+" is prime");
		}
		else {
			System.out.println(number+" is not prime");
		}
	}

}
