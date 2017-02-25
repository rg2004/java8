import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class FilterInteger {

    public int filterInt()
    {
        List<Integer> list = Arrays.asList(1, 10, 3, 7, 5);
        Predicate<Integer> greaterThanFive = i->i>5;

        return  list.stream().filter(greaterThanFive).findFirst().get();


    }

}
