package homeassignments.Strings;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split= test.split(" ");
		
		for (int i =0; i<split.length;i++) {
					
			if(i%2==1) {
				char[] currchar = split[i].toCharArray();
				String text1 ="";
						
			for(int j=0;j<currchar.length;j++)
			{
				text1=currchar[j]+text1;
			}
			
			System.out.print(text1+" ");
			}
			
			else {
				
				System.out.print(split[i]+" ");
			}
		}
	}
}



