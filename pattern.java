import java.util.*;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
    
        int a=sc.nextInt();

for(int i=1;i<=a;i++)
{
for(int j=1;j<=(2*i-1);j++)
{
System.out.print(Math.abs(i-j)+" ");
}
System.out.println();
}
}
}

// }
//         for(int i=0;i<a;i++)
//         {
//             int k=i;
//             for(int j=0;j<=i+1;j++)
//             {      
//                 if(j<i+1)
//                 {System.out.print(k);
//                 k--;}       
//             }
//             System.out.println();
//         }

 


/*
ip:3

0
101
21012

 */