/*
 * Examen Refactorizacion
 * 
 */
package factorial;

import javax.swing.JOptionPane;

public class LoVivido {

    public static void main(String[] args) {
        String nom;
        String edad;

        int mes;
        int dias;
        int horas;
        int años;

        nom = JOptionPane.showInputDialog("Escriba su nombre: ");
        edad = JOptionPane.showInputDialog("Escriba su edad: ");

        años = Integer.parseInt(edad);

        mes = (años * 12);
        dias = (años * 365);
        horas = (dias * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mes, "Numero de meses vividos de " + nom, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + dias, "Numero de días vividos de " + nom, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horas, "Numero de horas vividos de " + nom, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
