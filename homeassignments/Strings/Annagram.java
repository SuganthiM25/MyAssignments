package homeassignments.Strings;

import java.util.Arrays;

public class Annagram {

	public static void main(String[] args) {
		
			String text1 = "stops";
			String text2 = "potss";
			
			int Leng1 = text1.length();
			int Leng2 = text2.length();
			
			if(Leng1==Leng2) {
				char[] t1 = text1.toCharArray();
				char[] t2= text2.toCharArray();
				
				Arrays.sort(t1);
				Arrays.sort(t2);
				
				String text11 = new String(t1);
				String text12 = new String(t2);
				
				if(text11.equals(text12)) {
					System.out.println("The given strings are Anagram");
				}
				else 
				{
					System.out.println("The given strings are not Anagram");
				}		
			}
			else{
				System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			}

		}



	}


