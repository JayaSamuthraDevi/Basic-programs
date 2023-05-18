import java.util.StringTokenizer;    
public class stringToken 
{    
 
 public static void main(String args[])  
 {    
   /* StringTokenizer object */  
   StringTokenizer st = new StringTokenizer("Demonstrating methods from StringTokenizer class"," ");    
   StringTokenizer st1 = new StringTokenizer("java ,clas s","[a, ]"); 

     /* Checks if the String has any more tokens */  
     while (st.hasMoreTokens())   
     {    
         System.out.println(st.nextToken());    
     }    
System.out.println();
     while (st1.hasMoreElements())   
     {    
         System.out.println(st1.nextToken());    
     }   
 }    
}  
