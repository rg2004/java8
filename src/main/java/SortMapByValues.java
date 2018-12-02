import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;
import static java.util.Map.Entry.*;


public class SortMapByValues {
	
	
	public static void main(String[] args) {
		
		Map<String,Integer>  map =  new HashMap();		
		map.put("Rohit", 37);
		map.put("Rajib", 40);
		map.put("Shivam", 30);
		map.put("Manoj", 35);
		
		 // let's sort this map by values first
		
		    Map<String, Integer> sorted = map	
		        .entrySet()
		        .stream()
		        .sorted(comparingByValue())
		        .collect(		
		            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
		
		    sorted.forEach((k,v)->System.out.println("Emp : " + k + " age : " + v));
	}
		
}
	
	
	

