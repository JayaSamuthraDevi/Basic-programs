import java.util.Arrays;
  
public class Main
{
    public static void main(String[] args)
    {
        boolean ar[] = new boolean[8];
  
        // To fill complete array with a particular
        // value
        Arrays.fill(ar, false);
        // System.out.println("Array completely filled" +
        //           " with 10\n" + Arrays.(ar));

        for(boolean a:ar)
        {
            System.out.print(a + " ");
        }
    }
}