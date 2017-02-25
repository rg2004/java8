import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class PrimeNumber {


    public static  boolean isPrime(int number) {


       /* if(number < 2) return false;
        for(int i=2; i<number; i++){
            if(number % i == 0) return false;
        }
        return true;*/
        IntPredicate isDivisible = i -> number % i == 0;

        return number > 1
                && IntStream.range(2, number).noneMatch(isDivisible);


    }


}
