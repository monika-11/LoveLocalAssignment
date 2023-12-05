Hard 3
Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n.
Example 1:


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
    

