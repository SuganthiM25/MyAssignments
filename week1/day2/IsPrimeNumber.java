package week1.day2;

public class IsPrimeNumber {
	
	 public static boolean isPrime(int n)
	    {
		        for (int i = 2; i <= n-1 ; i++) 
	        {
	            if (n % i == 0) 
	            {
	            	return false;
	            }
	        }
		        return true;
	    }
	
		public static void main(String[] args) {
		
		int n = 6 ;
		
		if (isPrime(n)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
			
	}

}
	//Query 1: how to validate n numbers in a code automatically to check whether its prime or not

	
    