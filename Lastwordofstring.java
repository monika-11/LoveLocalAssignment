//Easy 1
Given a string s consisting of words and spaces, return the length of the last word in the string.





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
