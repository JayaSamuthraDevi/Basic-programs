
import java.util.Scanner;
class ar{
public static void main(String args[]){

Scanner sc =new Scanner(System.in);
// int []a = {4,-1,0,3};
// int []b ={-2,5,0,3};

int []a = {2,-2,-3,3};
int []b ={0,0,4,-4};

int flag=-1;

// String []s={"un","iq"};
// System.out.println(s[0].length());



for(int i=0;i<a.length;i++)
{
   int sum1=0, sum2=0,sum3=0, sum4=0;
    for(int j=0;j<i;j++)
    {
        sum1+=a[j];
        sum2+=b[j];
        //System.out.println(sum1+" "+sum2);
    }
    for(int k=i;k<a.length;k++)
    {
        sum3+=a[k];
        sum4+=b[k];
         //System.out.println(i);
    }
    
    
    if((sum1==sum2)&&(sum3==sum4))
    {
        flag++;
       // System.out.println(i);
    }
}
System.out.println(flag);

}
}
