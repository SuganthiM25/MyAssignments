package week3.day1;

public class FindEvenNumbers {
	
	public void Even(int Srange,int Erange)
	{
		for(int i=Srange;i<=Erange;i++)
		{
			if(i%2==0) {
			System.out.println(+i+" is a even number");
		}
		}
	}
	

	public static void main(String[] args) {
		FindEvenNumbers check = new FindEvenNumbers();
		check.Even(20, 30);

	}

}
