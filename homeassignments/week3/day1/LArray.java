package week3.day1;

import java.util.Arrays;

public class LArray {

	public static void main(String[] args) {
		
		long[] phnenumber = {98723023l,98723923l,98723103l,97723123l,99723123l,99003123l};
		int length = phnenumber.length;
		System.out.println(length);
		//if you want to print all numbers in array then for loop is required
		for(int i=0; i<length;i++ )
		    {
			System.out.println(phnenumber[i]);	
			}
		
	//------------------Array Instantiation ---------------------------------------------
		int numbers[]= new int[8];
		int length1 = numbers.length;
		numbers[0]=40; numbers[1]=43;numbers[2]=36;numbers[3]=37;
		
		System.out.println("Length of arryains:"+length1);
		
		for(int i = 0; i < numbers.length; i++)
		     {
			System.out.println(numbers[i]);
			}
		Arrays.sort(numbers);
		System.out.println("After sort---------->");
		for(int i = 0; i < numbers.length; i++)
	     {
		System.out.println(numbers[i]);
		}
		
	}
}
