import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Arrays.*;

/**
 * Created by Gaurav on 27-02-2017.
 */
public class PredicateChaining {

    public static void main(String[] args) {

        Predicate<Integer> greaterThenTen  = i->i>10;
        Predicate<Integer> lessThenTwenty  = i->i<=20;

        System.out.println(greaterThenTen.test(15));


        Integer[] int_array = new Integer[] {2,12,78,34,16,17,20,10};

        List<Integer> int_list = asList(int_array);

        for(Integer number:int_list)
        {
           if(greaterThenTen.and(lessThenTwenty).test(number))
           {
               System.out.println(number);
           }

        }


        Function<String, Integer> stringLength = (s) -> s.length();
        Function<Integer, Boolean> greaterThanFive = (i) -> i > 5;

// Will print true
        System.out.println(stringLength.andThen(greaterThanFive).apply("Hello world"));

    }


}
