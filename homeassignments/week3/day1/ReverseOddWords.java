package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split= test.split(" ");
		
		for (int i =split.length; i>0;i--) {
			
		if((split.length-1)%2!=0)
		{
			char echar[]= test.toCharArray();
			System.out.print(echar[i]);
		}
		}
	}
}
