import java.util.*;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();

        char string[] = str.toCharArray();
        String s=sc.nextLine();
       if(str.contains(s))
       {
        
        
           int x=str.indexOf(s);
           int y=x+s.length();

            for(int i=0;i<str.length();i++)
            {
                if((i!=x&&i<=y)||(i>y))
                System.out.print(string[i]);
                
            }

        
       
       }
    else
    {
        System.out.println("not found");
    }


    }
}