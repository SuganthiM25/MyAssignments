package week1.day2;

/*public class CheckNumberIsPositive {
	
	static int version = 13;

	public static void main(String[] args) {
		
			if (version > 0)
			{
				System.out.println("Given number " + version + " is postive" );
			}
			else 
			{
				System.out.println("Given number " + version + " is negative" );
			}
			}
	} */
public class CheckNumberIsPositive {


public void check(int version)

{

	if (version > 0)
		{
			System.out.println("Given number " + version + " is postive" );
		}
		else 
		{
			System.out.println("Given number " + version + " is negative" );
		}
}
public static void main(String[] args) 
{
	
	CheckNumberIsPositive positive = new  CheckNumberIsPositive();
	
	positive.check(10);
	positive.check(-10);
	positive.check(-11);
	
 }
}