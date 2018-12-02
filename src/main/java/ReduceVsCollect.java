import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceVsCollect {
	
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Milan", 
                "London", 
                "New York", 
                "San Francisco");
		String joinedCities = String.join(",", cities);
		System.out.println(joinedCities);
		
		String collectedCities = cities.stream()
                .collect(Collectors.joining(","));
       System.out.println(joinedCities);

       
       Optional<String> reducedCities = cities.stream().reduce((s1,s2)-> s1+","+s2);
       reducedCities.ifPresent(System.out::println);
       
       
	}

}
