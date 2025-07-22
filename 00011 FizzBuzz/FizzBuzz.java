/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package x.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author barbara
 */
public class FizzBuzz {

        public static List<String> fizzBuzz(int n) {
            List <String> output = new ArrayList <>();
            int remainder3 = 0;
            int remainder5 = 0;
            for (int x = 0; x <= n; x++){
                remainder3 = x%3;
                remainder5 = x%5;
                if (remainder3 + remainder5 == 0){
                    output.add("FizzBuzz");
                } else if (remainder3 == 0){
                    output.add("Fizz");
                } else if (remainder5 == 0){
                    output.add("Buzz");
                } else output.add(Integer.toString(x));
            }
            return output;
    }
    public static void main(String[] args) {
        int exemple = 15;
        System.out.println(fizzBuzz(exemple));
    }
}
