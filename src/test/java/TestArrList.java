import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class TestArrList {

    @Test
    public void testStringList()
    {
        ArrList<String> list = new ArrList<String>();
        list.add("Rohit");
        list.add("Gupta");
        list.add("ion trading");
        list.printElements();
        Assert.assertEquals(list.size(),3);
    }
    @Test
    public void testIntList()
    {
        ArrList<Integer> list = new ArrList<Integer>();
        list.add(2);
        list.add(4);
        list.add(5);
        list.printElements();
        Assert.assertEquals(list.size(),3);
    }
}
