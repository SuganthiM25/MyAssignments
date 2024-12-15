package week1.day2;

public class Practice {
	public static boolean isPrime(int n) {
       
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;  // If divisible, it's not prime
            }
        }
        
        return true;  // If no divisors found, it's prime
    }

    // Function to validate an array of numbers and print whether each is prime
    public static void validateNumbers(int[] numbers) {
        for (int n : numbers) {
            if (isPrime(n)) {
                System.out.println(n + " is prime.");
            } else {
                System.out.println(n + " is not prime.");
            }
        }
    }

    public static void main(String[] args) {
   
        int[] numbers = {2, 3, 4, 5, 10, 13, 17, 20, 21, 23, 29};

              validateNumbers(numbers);
    }
}

	/*public static void main(String[] args) {
		
		int n =20;
		
		//int[] testNumbers = {2, 3, 4, 5, 16, 17, 18, 19};
		
		for (int i = 2; i < n-1 ; i++) 
	    {
	        if (n % i == 0) 
	        {
	        	System.out.println(n + " is prime.");
	        }   
	     }
	       System.out.println(n + " is not prime.");
	}
	
	}*/



