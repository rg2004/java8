import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class TestArticle {

    @Test
    public void testJavaArticle()
    {
        ArticleImpl ai = new ArticleImpl();

        Assert.assertEquals(ai.getFirstArticle(),"Article1");
    }
}
