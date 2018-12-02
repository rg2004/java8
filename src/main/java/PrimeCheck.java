import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

import java.util.List;

public class PrimeCheck {
	
	
	public static void main(String[] args) {
	    
	    List<Double> collect = Stream.iterate(1, e -> e +1)
	                               .filter(PrimeCheck::isPrime)
	                               .map(Math::sqrt)
	                               .limit(10).collect(toList());
	    
	    collect.forEach(System.out::println);
		
	}
	
	
	public static boolean isPrime(int number)
	{
		return number >1 && IntStream.range(2,number).noneMatch(i->number%i==0);	
	}

}
