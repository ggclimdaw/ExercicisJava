import javax.swing.JOptionPane;

public class Actividad6 {

    public static void main(String[] args) {
        String nombreUsuario = JOptionPane.showInputDialog(null, "Introduce un nombre de ususario", "Actividad 6",
                JOptionPane.INFORMATION_MESSAGE);
        if (nombreUsuario == null) {
            nombreUsuario = "Desconocido";
        }

        int edad = JOptionPane.showOptionDialog(null, "Seleccione una opcion", "¿Lo confirmas?",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 0);

        String cadenaIntroducida = nombreUsuario + " tiene " + edad + " años";
        JOptionPane.showMessageDialog(null, cadenaIntroducida, "La cadena introducida es ",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
