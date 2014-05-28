/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arch2_bb;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author < Javier Chacón Troz >
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // ######### FIBONACCI #########
        String cantidad = showInputDialog(null, "¿Hasta cuál número quiere llegar?", "FIBONACCI", JOptionPane.INFORMATION_MESSAGE);
        int valor = Integer.parseInt(cantidad);

        System.out.println("----- Resultado de Fibonacci: -----\n");
        Fibonacci.Fibonacci(0, 1, valor);

        // ######### TORRES DE HANOI #########
        System.out.println("\n\n----- Resultado de Hannoi: -----\n");
        Hanoi.Hanoi(3, 1, 2, 3);

    }
}
