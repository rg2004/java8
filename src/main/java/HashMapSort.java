import java.util.*;

/**
 * Created by rohit on 8/12/2017.
 */
public class HashMapSort {
    public static void main(String[] args) {
        Map<Integer,String> mapToSort = new HashMap<Integer,String>();

        mapToSort.put(1,"t");
        mapToSort.put(2,"r");
        mapToSort.put(3,"r");
        mapToSort.put(4,"d");
        mapToSort.put(5,"a");

        Set<Map.Entry<Integer, String>> originalEntries = mapToSort.entrySet();

        System.out.println("Before sorting map looks like following:");
        for(Map.Entry entry:originalEntries)
        {
            System.out.println(entry.getKey()+ " --> "+entry.getValue());
        }
        System.out.println("After sorting map looks like following:");

        Map<Integer,String> sortedMap = sortByValues(mapToSort);
        Set<Map.Entry<Integer, String>> sortedEntries = sortedMap.entrySet();
        for(Map.Entry entry:sortedEntries)
        {
            System.out.println(entry.getKey()+ " --> "+entry.getValue());
        }

    }

    private static Map sortByValues(Map map)
    {
        List<String> al = new ArrayList<String>(map.values());

        Collections.sort(al);

        for (String a:al)
        {
            System.out.println("sorted list"+a);
        }
        Set<Map.Entry<Integer, String>> originalEntries = map.entrySet();

        Map<Integer,String> sortedMap = new LinkedHashMap<Integer,String>();


            for(String v:al)
            {
                for(Map.Entry<Integer,String> entry:originalEntries)
                {
                if(entry.getValue().equals(v))
                {
                    sortedMap.put(entry.getKey(),entry.getValue());
                }
            }

        }
        return sortedMap;
    }
}
