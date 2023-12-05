// //Easy 1
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// Explanation:
// The algorithm or approach used in this code is a simple iterative approach 
//    In this program i have using methods of strings in java
//      1)here i have created a function called lastWordOfString which takes string as parameter.
//      2)here i have used inbuilt function in java which is trim() this function basically removes all the whitespaces 
           present at end and start of  the string.
//      3)then i run a loop from end of string(because i need to find count of the lastword ) until start of string and
         check charcter at index of string whether it is notequal to whitespaces if condition satisfied the count is incremented.
//       else when whitespaces is encountered then we break and come out of loop returning the count of the word





import java.util.*;
public class Lastwordofstring {

    public static int lastWordOfString(String s){
        String s1= s.trim();
        int count =0;
        for(int i =s1.length()-1;i>=0;i--){
            if(s1.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String args[]){
        System.out.println("enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lastWordOfString(s));
    }
    
}
