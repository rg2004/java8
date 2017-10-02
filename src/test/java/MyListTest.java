import org.junit.Test;
import org.mockito.Mockito;

import static com.sun.org.apache.xerces.internal.util.FeatureState.is;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

/**
 * Created by rohit on 5/29/2017.
 */
public class MyListTest {

    @Test
    public void testAdd()
    {
        MyList listMock = Mockito.mock(MyList.class);
        when(listMock.add(anyString())).thenReturn(false);

        /*boolean added = listMock.add(randomAlphabetic(6));
        assertThat(added, is(false));*/
    }
}
