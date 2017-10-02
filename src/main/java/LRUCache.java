import java.util.*;

/**
 * Created by rohit on 8/15/2017.
 */
public class LRUCache<E,V> {
    Map<E,V> cache = new HashMap<>();
    List<E> list = new LinkedList<>();


    public void put ( E key,V value)
    {
        cache.put(key,value);
        list.add(key);
    }

    public V get(E key)
    {
        list.remove(key);
        list.add(key);
        return cache.get(key);
    }

    public void remove()
    {
        System.out.println("least recently used item is "+list.get(0));
        list.remove(0);
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache();
        cache.put("Rohit","36");
        cache.put("Gaurav","36");
        cache.put("Nihit","36");
        cache.put("Manish","36");
        cache.put("Prateek","36");
        cache.get("Rohit");
        cache.get("Gaurav");
        cache.remove();
    }

}
