package week3.day1;

public class CheckNumbersinArray {

	public static void main(String[] args) {
		
		int num1[] = {3,4,5,6,7};
		int num2[] = {3,7,1,6,0,9,35,4};
	//-----------------------	Nested for-loop----------
		for (int i=0;i<num1.length;i++) {
			for (int j=0;j<num2.length;j++) {
				if (num1[i]==num2[j]) {
					System.out.println("Num1:"+num1[i]+" is same as of Num2:"+num2[j]);
					break;
				}
				
			}
			
		}

	}

	
}
