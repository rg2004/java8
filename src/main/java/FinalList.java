import java.util.ArrayList;
import java.util.List;

/**
 * Created by rohit on 8/16/2017.
 */
public class FinalList<E> {

    static List<String> mutableList = new ArrayList<>();

    final static List<String> immutableList = new ArrayList<>();


    public static void main(String[] args) {

        mutableList.add("Test");
        mutableList.add("Rohit");
        mutableList.add("Gupta");

        immutableList.addAll(mutableList);
        System.out.println("size"+immutableList.size());

        immutableList.add("hehr");

        System.out.println("size"+immutableList.size());
    }



}
