/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package program.plusone;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Barbara Angelin
 */
public class PlusOne {

    static ArrayList<Integer> plusOne (ArrayList<Integer> dado){
   System.out.println("\fOriginal formation: "+dado+"\n");
   
   // To remove zeros without any value for the number
    while (dado.getFirst() == 0){
    dado.remove(0);
    }
    
    // To sequences of nine
    if (dado.getLast() == 9){
        
    int aux = dado.size() - 1;
    dado.set(aux, 0);
    
    // If the next number is a 9 value the sequences will be going on
    while (dado.get(aux-1) == 9){
    dado.set(aux-1, 0);
    aux--;
    }
    
    // If the next number is not a 9 value
    int indexWithPlusOne = dado.get(aux - 1) + 1; 
    dado.set(aux-1, indexWithPlusOne);
   
    }   else // If the last number is not a 9 value//
             {
    
        dado.set(dado.size() - 1, dado.getLast()+1);
    
     }
      return dado;
    } 
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> largeNumber = new ArrayList<>();
        System.out.println("\fEnter a number, each new entry represents a new place in the large number. Ex:  first input = 2; second input = 6; result = 26.\n");
        int newnumber = input.nextInt();
        largeNumber.add(newnumber);
        boolean op = true;
        while (op == true){
            System.out.println(largeNumber+"\n\fAdd a new number?\n[1] YES\t[2] NO\n");
            int answer = input.nextInt();
            while (answer!= 1 && answer!= 2){
                System.out.println("\nInvalid option\n");
                System.out.println(largeNumber+"\n\fAdd a new number?\n[1] YES\t[2] NO\n");
                answer = input.nextInt();
                            }
            if (answer == 1){
            System.out.println("\f\nEnter a number, each new entry represents a new place in the large number. Ex:  first input = 2; second input = 6; result = 26.\n");
            newnumber = input.nextInt();
            largeNumber.add(newnumber);
            } else if (answer == 2){
            op = false;
            } else {
                
            }
                }
             System.out.println("\n\fNew formation with the addition of +1 in the last digit: "+plusOne(largeNumber)+"\n");
    }
}
