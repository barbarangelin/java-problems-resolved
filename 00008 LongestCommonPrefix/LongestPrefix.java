/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.longestprefix;

/**
 *
 * @author Barbara Angelin
 */
//Constraints:
//1 <= strs.length <= 200
//0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters if it is non-empty.
public class LongestPrefix {

    public static String longestCommonPrefix(String[] strs) {
        for (int x = 0; x <= strs[0].length()-1; x++){ // for character
            for (int y = 1; y <= strs.length-1; y++){ // for the second parallel
                if (  x >= strs[y].length() || strs[0].charAt(x) != strs[y].charAt(x) ){
                    if (x == 0){
                        return "";
                    } else if (x == 1){
                        return String.valueOf(strs[0].charAt(0));
                    }
                    else {
                        return strs[0].substring(0, x);
                    }
                }
            }   
        }       
        return strs[0];  
    }


    public static void main(String[] args) {
        String [] ex1 = {"flower","flow","flght"};
        String [] ex2 = {"dog","racecar","car"};
        String [] ex3 = {"ab", "a"};
        System.out.println(longestCommonPrefix(ex3));
        //System.out.println(ex3[1].subSequence(0, 0));
        String result = "2";
        ///esult+= ex1[0].charAt(0);
       //System.out.println(ex3[0].length());
    }
}
