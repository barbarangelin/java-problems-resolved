/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.climbingstairs;

import java.util.ArrayList;

/**
 *
 * @author barba
 */
public class ClimbingStairs {

        public static int climbStairs(int n) {
            ArrayList <Integer> memoized = new ArrayList <>();
            memoized.add(1);
            memoized.add(1);
            if (memoized.size() >= n+1){
               return memoized.get(n);
            } 
            else if (n <= 1){
                return memoized.get(n);
            }
            else {
                for (int x = 2; x <= n; x++){
                    memoized.add((memoized.get(x-1)+memoized.get(x-2)));
                }
            }
            return memoized.get(n);
            
        
    }
        
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }
}
