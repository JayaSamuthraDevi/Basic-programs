
import java.util.*;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();

        String s[]=str.split(" ");
        for(int i=s.length-1;i>=0;i--)
        {
            
            char []arr=s[i].toCharArray();
            for(int j=arr.length-1;j>=0;j--)
            {
                System.out.print(arr[j]);
            }
            System.out.print(" ");
            
        }
        
    }
}



/*ip:
this is
op:
si siht

 */