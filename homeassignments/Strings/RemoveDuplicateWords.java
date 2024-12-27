package homeassignments.Strings;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions As in Java week1";
		
		//- Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count = 0;
		
		//- Split the text into an array of words using space as the delimiter
		String[] split = text.split(" ");
		
		//Create two nested for loops to compare each word with every other word in the String array
			for (int i=0;i<split.length;i++) {
			for (int j=i+1;j<split.length;j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
		//If a duplicate word is found, it is replaced with an empty string and the count is incremented	
					split[j]=" ";
					count =count+1;
				}}}
		
		//After comparing all words, if the count is greater than 1 (indicating at least one duplicate was found), it prints
				if(count>1) {
				System.out.println("Duplicate found");
			for (int i=0;i<split.length;i++)
			{
				System.out.print(split[i]+ " ");
			}
	
}}}
