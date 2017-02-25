import org.junit.Assert;

import org.junit.Test;
/**
 * Created by Gaurav on 25-02-2017.
 */
public class TestPrimeNumber  {

    @Test
    public void testPrimeNumber() {

        Assert.assertEquals(PrimeNumber.isPrime(7), true);

        Assert.assertEquals(PrimeNumber.isPrime(1), false);

        Assert.assertEquals(PrimeNumber.isPrime(2), true);

        Assert.assertEquals(PrimeNumber.isPrime(8), false);

    }

}
