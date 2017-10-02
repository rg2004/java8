/**
 * Created by rohit on 9/23/2017.
 */
public class Overflow {


    public static final void call(double a, double b, double c, double d) {
        call(a,b,c,d);
    }


    public static void main(String[] args) {
        try {
            call(0, 0, 0, 0);
        }catch(Throwable e)
        {
            System.out.println("caught!!!!!!!!!!!!"+e.getCause());
        }

        System.out.println("here i am");
    }

}
