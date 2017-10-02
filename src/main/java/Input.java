import java.util.Scanner;

/**
 * Created by rohit on 8/3/2017.
 */
public class Input {

    public static void main(String[] args) {
        System.out.println("enter number of elements");

        Scanner scan1 = new Scanner(System.in);

        int test = scan1.nextInt();


        Scanner scan = new Scanner(System.in);
        int[] arr = new int[test];
        for(int i=0;i<test;i++)
        {
           int num =  scan.nextInt();
           arr[i]=num;
        }

       for(int j=0;j<arr.length;j++)
       {
           System.out.println("array elemt is "+arr[j]);
       }

    }
}
