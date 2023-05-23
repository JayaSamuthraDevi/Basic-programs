/**

i/p
3
o/p
-1 1 3
==>3 nums
and sum=3 

4
-1 1  0 4

8
-1 1 -2 2 -3 3  0 8
*/

import java.util.*;
class zig{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    
    int sum=0,k=0;
    if(n%2!=0)
    {
        int rem=n%2;
        for(int i=1;i<=rem;i++)
        {
            System.out.print(-i+" "+i+" ");
        }
        System.out.print(n);
    }
    else
    {
        int rem=n/2;
        for(int i=1;i<rem;i++)
        {
            System.out.print(-i+" "+i+" ");
        }
        System.out.print(" "+0+" "+n);

    }
}
    
    
}

