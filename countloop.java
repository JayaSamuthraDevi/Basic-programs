import java.util.*;
class zig{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    //int arr[]={1,20,6,4,5};
    int arr[]={8,4,2,1};
    
int count=0;
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                count++;
            }
        }
    }
    System.out.print(count);
}
}