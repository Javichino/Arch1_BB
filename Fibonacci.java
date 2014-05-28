/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arch2_bb;

/**
 *
 * @author < Javier Chacón Troz >
 */
public class Fibonacci {

    public static int Fibonacci(int x, int y, int z) {
        System.out.print(x + ", ");
        if (2 > z) {
            return 1;
        } else {
            return Fibonacci(y, (y + x), (z - 1));
        }
    }

}
