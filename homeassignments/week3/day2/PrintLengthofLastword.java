package week3.day2;

public class PrintLengthofLastword {

	public static void main(String[] args) {
		
		String s1 = "Hello World";
		String[] words = s1.split(" ");
		
		if (words.length > 0) {
            
            String lastWord = words[words.length - 1];
            // Print the length of the last word
            System.out.println("Length of the last word :"+lastWord+" is " + lastWord.length());
        } 
//----------------------------------------------------------------
		String s2 = "   fly me   to   the moon  ";
		String[] words1 = s2.split(" ");
		if (words1.length > 0) {
            // Get the last word
            String lastWord = words1[words1.length - 1];

            // Print the length of the last word
            System.out.println("Length of the last word :"+lastWord+" is " + lastWord.length());
        } 
//----------------------------------------------------------------
				String s3 = "luffy is still joyboy";
				String[] words2 = s3.split(" ");
				if (words2.length > 0) {
		            // Get the last word
		            String lastWord = words2[words2.length - 1];

		            // Print the length of the last word
		            System.out.println("Length of the last word :"+lastWord+" is " + lastWord.length());
		        } 
		
		        }
	}


