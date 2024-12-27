package week3.day1;

public class FindOddNumbers {

	public static void main(String[] args) {
		int maxRange = 10;
		
		for (int i =0; i<=maxRange;i++)
		{
			if(i%2==1)
			{
				System.out.println(+i+" is a Odd number");
			}
			else
			{
				System.out.println(+i+" is not Odd number");
			}
		}

	}

}
