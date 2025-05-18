
package program.twosum;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Barbara Angelin
 */
public class TwoSum {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <Integer> numberList = new ArrayList<>();
        
        boolean op = true;
        
        while (op == true){
        System.out.println("Include numbers in the list:\n");
        int newNumber = input.nextInt();
        numberList.add(newNumber);
            System.out.println("Do you want do add a new number into the list?\n[1] Yes\t[2] No\n");
            int answer = input.nextInt();
            while (answer != 1 && answer != 2){
                System.out.println("\nInvalid option\n");
                System.out.println("Do you want do add a new number into the list?\n[1] Yes\t[2] No\n");
                answer = input.nextInt();
            }
            if (answer == 1){
                op = true;
            } else if (answer == 2) {
                op = false;
            } 
           
                  }
        System.out.println("\n"+numberList+"\nWitch number will be the target?\n");
       
        int target = input.nextInt();
        
        ArrayList <Integer> indices = new ArrayList<>();
        for (int x = 0; x<numberList.size();x++){
        for (int y = 0; y<numberList.size(); y++){
            int z = numberList.get(x)+numberList.get(y);
        if (z == target){
            indices.add(x);
            indices.add(y);
        }
        }
            
        }  if (indices.isEmpty()){
            System.out.println("\nThere is no combination of two indices that results in "+target+".\n");
        } else {
            System.out.println("\nThe sum of the index ["+indices.get(0)+"] and the index ["+indices.get(1)+"] results in "+target+".\n");
        
    }
    }
}
