import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {

    List<E> list = new ArrayList<E>();

    public void addElement(E e)
    {
       list.add(e);
    }

    public E popElement()
    {
        return list.remove(list.size()-1);
    }

}
