import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Filter;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class TestFilterInteger {
    @Test
    public void testFilterInteger()
    {
        FilterInteger fi = new FilterInteger();
        Assert.assertEquals(fi.filterInt(),10);
    }

}
