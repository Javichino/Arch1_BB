/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arch2_bb;

/**
 *
 * @author < Javier Chacón Troz >
 */
public class Hanoi {

    public static void Hanoi(int discos, int torre_a, int torre_b, int torre_c) {
        if (discos == 1) {
            System.out.println("Mover el disco de " + torre_a + " a " + torre_c);
        } else {
            Hanoi(discos - 1, torre_a, torre_c, torre_b);
            System.out.println("Mover el disco de " + torre_a + " a " + torre_c);
            Hanoi(discos - 1, torre_b, torre_a, torre_c);
        }
    }
}
