import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaurav on 25-02-2017.
 */
public class ArrList<E> {

    private List<E> LIST;

    public ArrList()
    {
        LIST = new ArrayList<E>();
    }

    public void add(E element)
    {
         LIST.add(element);
    }

    public void printElements()
    {
        LIST.stream().forEach((E)-> {
            System.out.println(E);
        });
    }

    public int size()
    {
        return LIST.size();
    }

}
