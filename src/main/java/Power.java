import java.util.Scanner;

/**
 * Created by rohit on 8/5/2017.
 */
public class Power {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();
        System.out.println("Enter the power you want to raise "+number+ " with");
        int power = scan.nextInt();
        int result =1;
        for(int i=0;i<power;i++)
        {
            result=result*number;
        }
        System.out.println("result is "+result);

    }
}
