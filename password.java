import java.util.*;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
    
        String a=sc.nextLine();
        char[] s =a.toCharArray();
      
        chaarCount(s);
    }
    
    public static void chaarCount(char[] s)
    {
        int count=0,countnum=0,countUpper=0;
        for(int i=0;i<s.length;i++)
        {
            if(Character.isLetter(s[i]))
            {

                count++;
                if(Character.isUpperCase(s[i])&&countUpper==0)
                {
                   countUpper++;
                   
                }
                
            }
            else if(Character.isDigit(s[i]))
            {
                countnum++;
            }



                


        }

        //for char
        cchar(count);
        

//for number
                
cnumber(countnum);
//for symbol

                int symbol=s.length-count+countnum;

                csymbol(symbol);
               

                //for uppercaes

                cupper(countUpper);
                
               

    }

    public static void cnumber(int countnum)
    {
    if(countnum>0)
                {
                    System.out.println("Has Atleast one num");
                }
                if(countnum>=2)
                {
                    System.out.println("Has Atleast two num");
                }
                else
                {
                    System.out.println("Has No num found");
                }
    }






public static void csymbol(int symbol){
     if(symbol>0)
                {
                    System.out.println("Has Symbol");
                }
                else{
                    System.out.println("No Symbol found" );
                }
}


public static void cchar(int count){
if(count>=8&&count<=10)
                {
                    System.out.println("Has 8 - 10 char");
                    
                }
                else{
                    System.out.println(" Less char found");
                }
}




public static void cupper(int countUpper){
if(countUpper>0)
                {
                    System.out.println("Has UpperCase Letter");
                }
                else{
                    System.out.println("No Uppercase letter found" );
                }
}









}
