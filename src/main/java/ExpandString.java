import static java.lang.Character.isDigit;

/**
 * Created by rohit on 8/5/2017.
 */
public class ExpandString {

    public static void main(String[] args) {
        String compressed_string ="a2b3c4d";
        System.out.println("expanded string is "+expand(compressed_string));
    }

    private  static String expand(String compressed_string)
    {
        StringBuilder sb = new StringBuilder();
        char previous = 0;

        for (int i =0;i<compressed_string.length();i++)
        {
            char current = compressed_string.charAt(i);
            if(i==0)
            {
                previous = current;
                sb.append(current);
                continue;
            }


           if( isDigit(current))
           {
               int count = Integer.parseInt(String.valueOf(current));
               if(isDigit(previous))
               {
                   sb.append(current);
               }
               else
               {
                  for(int j=0;j<count-1;j++)
                  {
                      sb.append(String.valueOf(previous));
                  }
               }
               previous = current;

           }
           else
           {
               sb.append(current);
               previous = current;
           }



        }

        return sb.toString();
    }
}
