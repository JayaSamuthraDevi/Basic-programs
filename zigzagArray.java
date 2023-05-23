/*
i/p:
4 3 7 8 6 2 1
o/p
3 7 4 8 2 6 1
*/
import java.util.*;
class zig{
public static void main(String args[])
{

    int n,temp;
    int arr[]={4,3,7,8,6,2,1};
   n=arr.length;
    
    for(int i=0;i<n-1;i++)
    {
        if(i%2==0)
        {
            if(arr[i]>arr[i+1])
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        else if(arr[i]<arr[i+1])
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]);
    }
}
}