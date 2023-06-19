import java.util.Scanner;

class wave
{
    public static void main(String args[])
    {
        //int []arr={3,4,2,1,3,4,2};
        int []arr ={1,2,6,4,2,3,1,8,9,7};
        int n=0;
        max(arr,n);
            
        
        
    }
    public static void max(int []arr,int index)
    {
        
       
        int sum=0;
        int i=0,j=0;
        
        while( index != arr.length-1)
        {

            int min=arr[index];
             int count=0,c2=0;
             i=index;

        for( i=index;i<arr.length-1;i++)
        {
            count++;
            if((i==arr.length-1)||(arr[i]>arr[i+1]))
            {
                
                sum+=min*count;
                //System.out.println(sum+" "+count+"   "+i);
                index=i;
                break;
            }
            
        }
        for( j=i;j<arr.length;j++)
        {
            c2++;
            
            if(((j==arr.length-1)&&(arr[j]<arr[j-1]))||(arr[j]<arr[j+1]))
            {
               
                sum+=arr[j]*c2;
                //System.out.println(sum+" "+c2+"  "+j);
                index=j;
                break;
            }
            
        }
        
        }
    System.out.println(sum);
    }
}



/*

import java.util.*;
class js1

{

    public static void print1(int arr[])
    {
            for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i]);
    }
    }
    public static int check(int arr[])
    {
        int flag;
        if(arr[0]<arr[1])
        {
            flag=1;
        }
        else
        {
            flag=0;
        }
        return flag;
    }

    public static void main(String[] args)
{
    int n=10;
    int arr[]={3,4,2,1,3,4,2};
    //int  []arr={1,2,6,4,2,3,1,8,9,7};
    int c=0;
    // 1 2 6..6 4 2..2 3..3 1..1 8 9 ..9 ..7
 int flag;
 int max=0;
 int ans=0;
 int min=1000000000;
 int z=1;
 int mainans=0;
  List<Integer> waves = new ArrayList<>();
    // print1(arr);
   flag=check(arr);
   // 1 asending starts with
   //0 apdina desding starts with

    // System.out.print(flag);
       System.out.print("ascending:");
    for(int i=0; i<n; i++)
    {
    if(flag==1)
    {
    if(z==1)
    {
        min=arr[i];
        z=0;
    }
        if(max<=arr[i])
        {
               max=arr[i];

            System.out.print( " "+max);
            c++;
      
        }
        else
        {   ans=c*min;
              System.out.print("->"+c+"*"+min+"="+ans);
              System.out.print("\ndscending:");
           
               i=i-1;
            flag=0;
            c=0;
           min=11000000;
           waves.add(ans);
             
        }
    }
   if(flag==0)
    {
        
        if(max>=arr[i])
        {
            max=arr[i];
            System.out.print(" "+max);
            c++;

        }
        else
        {
            ans=c*max;
              System.out.print("->"+c+"*"+max+"="+ans);
                 waves.add(ans);
             System.out.print("\nascending:");
                i=i-2;
            flag=1;

             max=0;
             c=0;
           min=1000000;
           z=1;
        } 
    }

    }
                    ans=c*max;
              System.out.print("->"+c+"*"+max+"="+ans);
                 waves.add(ans);
             System.out.print("\n");
             for(int x:waves)
             {
                System.out.print( " "+x);
                mainans=mainans+x;
             }
             System.out.print("="+mainans);

}
}
*/