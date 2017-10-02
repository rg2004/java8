import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestAddNumber {


    @Test
    public void testAdd()
    {
       AddNumber obj = new AddNumber();
       int actual = obj.addNumbers(1,3);
       assertThat(actual, equalTo(4));


    }
    @Test
    public void shouldHaveFixedSizeNumbers()
    {
        List<Integer> numbers = Arrays.asList( 1, 2, 3, 4, 5 );
        assertThat( numbers.size(), is( equalTo( 5 ) ) );
    }

    @Test
    public void samePerson() {
        Person me = new Person("Rafael");
        Person theOther = new Person("Rafael");
        assertThat(me, is(theOther));
    }
}
