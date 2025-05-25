/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.fibonaccisequence;

/**
 *
 * @author barba
 */
public class FibonacciSequence {

    public static long fibonacciSequence (int n){
       // Fibonacci sequence = {1,1,2,3,5,8,13,...}
        long [] aux = new long [n+1];
        // For n = 0 return 0.
        if (n == 0){
            return 0;
        }
        // For n = 1 or n = 2 return 1
        // n = 1 {0,1} | n = 2 {1,1} because the two first numbers values equals 1
        else if (n == 1 || n == 2){
            return 1;
        } 
        else {
            aux[1] = 1;
            aux[2] = 1;
        for (int x = 3; x <= n; x++){
            aux[x] = aux[x-1] + aux[x-2];
            }
        }
        return aux[n];
    
    }
    public static void main(String[] args) {
        // The max value java can show using long (64 bits) it is 92th.
        System.out.println(fibonacciSequence(92));
    }
}
