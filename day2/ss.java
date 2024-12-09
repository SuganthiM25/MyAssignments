package week1.day2;

public class ss {
		

	public static void main(String[] args) {
		
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
	
	}



