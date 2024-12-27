package week3.day1;

public class Roughforloop {
	
	public void checknmOddorEven(int Srange, int Erange)
	{
		for (int i = Srange; i<=Erange ; i++) {
			if (i%2==0) {
				System.out.println(+i+ " is even number");
			}
			else {
				System.out.println(+i+ " is not even number");
			}
			
		}
	}
	public static void main(String[] args) {
		
		Roughforloop obj1 = new Roughforloop();
		obj1.checknmOddorEven(11,20);
		obj1.checknmOddorEven(31,33);

	}

}
