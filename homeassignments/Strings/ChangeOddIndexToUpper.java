package homeassignments.Strings;

public class ChangeOddIndexToUpper {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] echar = test.toCharArray();
		
		StringBuilder otpt = new StringBuilder();
		
		for(int i= echar.length-1;i>=0;i--) {
		
			char curchar = echar[i];
			
			if((echar.length-i)%2!=0) {
				
				otpt.append(Character.toUpperCase(curchar));
			}
			else {
                
                otpt.append(curchar);
		}}
		
		 System.out.println(otpt.reverse());
	}
	
}