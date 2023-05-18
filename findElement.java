/*1. Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. Note: For corner elements, we need to consider only one neighbor.
Example:
Input: array [] = {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.



*/


import java.util.*;

class element
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        check(arr);
    }
    //checks for set of element not smaller than its neigbour
    public static void check(int arr[])
    {
     for(int i=0;i<arr.length;i++)
     {
        if(i==0)
        {
           if( arr[i]>arr[i+1])
           {
                System.out.println(arr[i]);
           }
        }
           if(i==arr.length-1)
           {
            if(arr[i]>arr[i-1])
            {
                System.out.println(arr[i]);
            }
           }
           if((i>0)&&(i<arr.length-1))
           {
            if((arr[i-1]<arr[i])&&(arr[i]>arr[i+1]))
            {
                System.out.println(arr[i]);
            }
           }
        }

     }   
    
}