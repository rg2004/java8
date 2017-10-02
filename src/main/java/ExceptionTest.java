import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by rohit on 10/1/2017.
 */
public class ExceptionTest {

    public void instanceMethod() throws Exception
    {
        try{

            System.out.println(" begining********8");
            throw new Exception("Test");
        }catch(Exception e)
        {
            System.out.println("caught exception");
            throw new IOException();
        }
        finally {

            System.out.println("but finally you are here");
            throw new FileNotFoundException();
        }
    }

    public static void main(String[] args) {

        ExceptionTest test = new ExceptionTest();
        try {
            test.instanceMethod();
        } catch (Exception throwable) {
            System.out.println("and what i am getting"+throwable.toString());
            throwable.printStackTrace();
        }

    }
}
