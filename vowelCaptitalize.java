/*
import java.util.Scanner;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        char s[]=str.toCharArray();
        for(char a:s)
        {
            switch(a)
            {
                case 'a':
                a='A';
                System.out.print(a);
                break;
                case 'e':
                a='E';
                System.out.print(a);
                break;
                case 'i':
                a='I';
                System.out.print(a);
                break;
                case 'o':
                a='O';
                System.out.print(a);
                break;
                case 'u':
                a='U';
                System.out.print(a);
                break;
                default:
                System.out.print(a);

            }

        }
    }
}


*/
import java.util.Scanner;
class vowel{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        str=str.replace('a','A');
         str=str.replace('e','E');
          str=str.replace('i','I');
           str=str.replace('o','O');
            str=str.replace('u','U');

             System.out.print(str);

    }
}