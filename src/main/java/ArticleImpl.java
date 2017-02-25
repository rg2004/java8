import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class ArticleImpl {

    List<Article> articles = new ArrayList<Article>();
    public String getFirstArticle()
    {

        List<String> java_articles = new ArrayList<String>();
        java_articles.add("Article1");
        java_articles.add("Article2");
        java_articles.add("Article3");
        articles.add(new Article("Java","Rohit",java_articles));
        List<String> c_articles = new ArrayList<String>();
        java_articles.add("Article4");
        java_articles.add("Article5");
        java_articles.add("Article6");
        articles.add(new Article("C","Gaurav",c_articles));
        return getJavaArticle().getTags().get(0);

    }


    private Article getJavaArticle() {
        Predicate<Article> predicate = article -> article.getTags().contains("Article1");
        return articles.stream()
                .filter(predicate)
                .findFirst().get();
    }

}
