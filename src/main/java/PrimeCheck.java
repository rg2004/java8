import java.util.stream.IntStream;

public class PrimeCheck {
	
	
	
	public static boolean isPrime(int number)
	{
		boolean  divisible = false;
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				divisible = true;
				break;
			}			
		}
		
	//	return number >1 && !divisible;
		
		return number >1 && IntStream.range(2,number).noneMatch(i->number%i==0);
		
	}

}
