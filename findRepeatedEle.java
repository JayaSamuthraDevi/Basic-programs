/*4. Given an array of n elements that contains elements from 0 to n-1
Input: n = 7 and array [] = {1, 2, 3, 6, 3, 6, 1}
Output: 1, 3, 6
Explanation: The numbers 1, 3 and 6 appears more than once in the array.
Input: n = 5 and array[] = {1, 2, 3, 4 ,3}
Output: 3
Explanation: The number 3 appears more than once in the array

 */


import java.util.*;

class element
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        checkRepeat(arr);
    }
//checks what ele repeated
checkRepeat(int arr[])
{
    for(int i=0;i<arr.length;i++)
    {
        arr[i]
    }
}
}

/*import java.util.*;

public class FirstNonRepeatingChar {

    // Function to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String s)
     {
        Map<Character, Integer> count = new HashMap<>(); // map to store the count of each character in the string
        for (char c : s.toCharArray()) 
        {
            System.out.print("\nc->"+c);
            count.put(c, count.getOrDefault(c, 0) + 1);
            System.out.print("\ncount->"+count.getOrDefault(c,0));
        }
        //  for (char c : s.toCharArray()) 
        // {
        //     System.out.print(count.getOrDefault(c,0));
        // }
        for (char c : s.toCharArray()) {

            if (count.get(c) == 1) {
                return c;
            }
        }
        
        return '#';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        scanner.nextLine();
        
        // Process each test case
        for (int i = 0; i < t; i++) 
        {
            String s = scanner.nextLine();
            System.out.print("->"+s);
            char result = findFirstNonRepeatingChar(s);
            System.out.println("\n"+result);
        }
        
        scanner.close();
    }
} */