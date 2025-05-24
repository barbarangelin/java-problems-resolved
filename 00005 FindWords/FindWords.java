/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.findwords;

import java.util.*;

/**
 *
 * @author Barbara Angelin
 */
public class FindWords {

    
    public static List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList <Integer> container = new ArrayList<>();
        // Checking all indexes
        for (int aux =0; aux< words.length; aux++){
            // If the index of char 'x' exist
            if (words[aux].indexOf(x) > -1){
                // For true add the aux index of the String[] in the Arraylist container
                container.add(aux);
            }
        }
        return container;
        
    }

    public static void main(String[] args) {
        // Test implementation
        String[] words = {"hello", "world", "java"};
        char ch = 'j';
        // Show the answer
        System.out.println(findWordsContaining(words, ch));
       
    }
}
