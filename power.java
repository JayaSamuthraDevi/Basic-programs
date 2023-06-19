import java.util.Scanner;

class gem
{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
   long  day0=0;
    long  day1 =8;
   long  day2=10;
   long mod=(int)1e9+7;
   long day=sc.nextInt();
    
    if(day==1)
    {
        System.out.println(day1);
    }
    else
    {
        for(int i=2;i<day;i++)
        {
           long temp=day0+day1+day2;
            day0=day1;
            day1=day2;
            temp=temp%mod;
            day2=temp;

        }
        System.out.println(day2);
    }
}
}