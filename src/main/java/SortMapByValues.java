import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Map.Entry.*;


public class SortMapByValues {
	
	static Function<Integer, String> function = (t) -> {
		if (t % 2 == 0) {
			return t+ " is even number";
		} else {
			return t+ " is odd number";
		}
	};

	public static void main(String[] args) {
		
		function.apply(5);
		List<String> list1 = new ArrayList<>();
		
	    Map<String,Integer>  map =  new HashMap();		
		map.put("Rohit", 37);
		map.put("Rajib", 40);
		map.put("Shivam", 30);
		map.put("Manoj", 35);
		
		 // let's sort this map by values first
		
		    Map<String, Integer> sorted = map	
		        .entrySet()
		        .stream()
		        .sorted(Map.Entry.comparingByValue())
		        .collect(		
		            toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,LinkedHashMap::new));
		
		    sorted.forEach((k,v)->System.out.println("Emp : " + k + " age : " + v));
		    
		    
		    
		    Map<String, Integer> result =  map
		    		                .entrySet()
		    		                .stream()
		    		                .filter(p->p.getKey().startsWith("M"))
		    		                .filter(p->p.getValue().intValue()< 40)
		    		                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		    
		      
		    	     System.out.println("Result: " + result);
		    	     
		    	     Map<String, Double> kvs = new HashMap<>();
		    	     Arrays.asList("a:1.0", "b:2.0", "c:3.0")
		    	             .stream()
		    	             .map(elem -> elem.split(":"))
		    	             .forEach(elem -> kvs.put(elem[0], Double.parseDouble(elem[1])));
		    	     
		    	     System.out.println(kvs);
		    	 
		    
	}
		
}
	
	
	

