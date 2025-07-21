/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package x.singleone;

/**
 *
 * @author barbara
 */
public class SingleOne {
    
    // Nesse exercício, a forma mais fácil de resolver o problema é por meio da soma de bits, nessa caso, usando XOR (^)
    // Para a soma de bits iguais é retornado zero (0). Por exemplo, em um array que haja apenas pares de números retornará 0;
    // Nesse exercício o array é composto por vários pares de números, porém há apenas um único número sem par
    // Portanto, a soma de bits seria sempre 0 + (bit do número sem par). Por exemplo, 0 + 01 (1 em binário) = 01 
    // A soma é feita em binário, mas o resultado é em decimal. Então, o resultado seria o próprio 1
 
    public static int singleNumber(int[] nums) {
        int output = 0;
        for (int x = 0; x< nums.length; x++){
            output = output ^ nums[x];
        }
        return output;
    }

    public static void main(String[] args) {
        int nums [] = {2,2};
        System.out.println(singleNumber(nums));
    }
}
