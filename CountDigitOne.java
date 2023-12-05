// /*Hard 3
// Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
// Example 1:
// Explanation:
// Approach: By using loops recursive calls in java
//   In this program i have considered 2 functions- CountDigitOne and countsOnesInNumber .
//         1)In first function CountDigitOne is created to count the occurrences of the digit '1' in numbers from 1 to n
//         2)Inside the  loop of first function, it calls the method countOnesInNumber(i) to count the number of occurrences of the digit '1' in the current value of i
//           and adds it to the total count.

//         In countDigitOne function :
//         i have initalized counter,and a for loop is run from 1 to n to get the count and inside this loop their is a recursive function called countOnesInNumber 
//         which repeatedly checks for each number whether there are any 1s present.And therefore it returns a count in end.
        
//         In countsOnesInNumber function :
//         i have initalized counter i check each number whether it is greater than 0 if consition in while is satisfied then i use modulo operator to get the remainder.
//         if remainder is equal to 1 then i increment the count and return the count and i  repeat recursively for each number between 1 to n.
//         Suppose there is is 2 digit number between 1 to n to check each digit i hav even used divider operator which helps me to get quotient and anlayze the remainder for each digit and check how many 1s are present between 1 to n.
//         /*

          
          

        


import java.util.*;

public class CountDigitOne {
        public int countDigitOne(int n) {
            int count = 0;
    
            for (int i = 1; i <= n; i++) {
                count += countOnesInNumber(i);
            }
    
            return count;
        }
    
        private int countOnesInNumber(int num) {
            int count = 0;
    
            while (num > 0) {
                if (num % 10 == 1) {
                    count++;
                }
                num /= 10;
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            CountDigitOne countDigitOne = new CountDigitOne();
            System.out.println("enter the number n:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            
            int result = countDigitOne.countDigitOne(n);
    
            System.out.println("Total number of digit 1 from 1 to " + n + ": " + result);
        }
    }
    

