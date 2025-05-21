/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.palindromenumber;

import java.util.Scanner;

/**
 *
 * @author barba
 */
 public class PalindromeNumber {
    
  static public boolean isPalindrome(Integer x) {
            boolean answer = false;
            // If the value is negative the answer is aut false 
            // Ex: -121 >>>>> 121-
            if (x < 0){
                answer = false;
            } 
            // If the x value = 0 the palindrome result true
            else if (x == 0){
                answer = true;
            }
            else if (x > 0){
                // Carrier will cary the initial x value
                int carrier = x;
                // Inverted will be the x inverted
                int inverted = 0;
                
                // With the while you can acess the last number of the x value
                while (x > 0){
                    // Multiply iverted by 10
                    inverted *= 10;
                    // Inverted sum with the remainder of the x division by 10
                    inverted += x%10;
                    // Divide x by 10 until x value reach zero
                    x /= 10;
                    }
 
                if (carrier == inverted) {
                answer = true;
                }
            }
      return answer;
          }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a new int value \n");
        int value = input.nextInt();
        System.out.println("\nIs "+ value +" a palindrome number: " + isPalindrome(value) + ".\n");
      
        
    }
}
