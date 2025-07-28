/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package x.concatenationofarray;

import java.util.Arrays;

/**
 *
 * @author barbara
 */
public class ConcatenationOfArray {

    public static int[] getConcatenation(int[] nums) {
        // Nessa linha é feito uma cópia da entrada "int[] nums" em um novo array, nesse caso, o int[] ouput
        // O primeiro paramametro é de onde será a cópia, ou seja, qual será a fonte para a copia. Então, a cópia virá de "nums"
        // Já o segundo parâmetro é nums.length * 2 é tamanho do novo array
        //É necessário que o tamanho seja a a fonte da cópia multiplicado por dois pois a saída (output) será o próprio nums repitido duas vezes em apenas 1 único array
        // Apenas essa linha não é o suficiente, pois se retornasse ela a saída seria algo como: [1,2,3,1,0,0,0,0]. Em outras palavras, os campos após nums.length estarão em branco
        int[] output = Arrays.copyOf(nums, nums.length * 2);
        
        // Nessa nova linha o array output é normalizado
        // Há 5 parâmetros para isso. O primeiro (nums) define de onde virá a nova cópia
        // O segundo parâmetro define de qual index em nums começará a nova cópia. Para essa problema o index começa no 0
        // O terceiro paramêtro define para onde será copiado (output)
        // O quarto parametro define em qual index será incializado a nova cópia em output
        // O quinto elemento define quanto elementos serão copiados (nums.length). Então, todos os elementos serão copiados novamento
        System.arraycopy(nums, 0, output, nums.length, nums.length);
        
        // Note que na primeira linha é feito apenas a primeira parte de output. Algo como [1,3,2,1,0,0,0,0]
        // Já na segunda o que é definido é a segunda parte de output. Algo como [0,0,0,0,1,3,2,1]. 
        //Porém, como a primeira parte está previamente difinida, após a segunda linha o array fica [1,2,3,1,1,2,3,1]. A cópia perfeita de nums
        return output;
    }
    
    public static void main(String[] args) {
        int [] nums = {1,3,2,1};
        System.out.println(getConcatenation(nums));
    }
}
