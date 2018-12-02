import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SampleExecutorService {
	
	
	public static void main(String[] args) {
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
/*		for(int i=0;i<10;i++)
		{
			final int index = i;
			service.submit(new Runnable() {
				@Override
				public void run() {
					System.out.println(" printing done by"+index);
					
				}
				
			});
		}*/
		
		IntStream.range(1,10).forEach(i-> 
		{
			int index = i;
		    service.submit(()-> System.out.println(i));
		});
}
		
 

}
