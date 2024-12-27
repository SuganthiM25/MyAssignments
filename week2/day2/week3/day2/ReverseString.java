package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "TestLeaf";
		String Output = "";
	

		char[] eachChar = input.toCharArray();
		
		//System.out.println(eachChar);
		
		
		for(int i = eachChar.length-1 ; i>=0; i--)
				{
					Output = Output+eachChar[i];
					System.out.print(eachChar[i]);
										
				}
			
	}

}
