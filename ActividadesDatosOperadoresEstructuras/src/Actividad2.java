import javax.swing.JOptionPane;

public class Actividad2 {
    /*
     * Diseña un algoritmo que dado un número del 1 al 7 imprima el día de la
     * semana.Por ejemplo, al introducir un 2 deberá mostrar Martes. Habrá que tener
     * en cuenta lo siguiente:
     * 
     * 
     * - Se le pedirá dicho número utilizando una ventana
     * 
     * 
     * - En caso de introducir un número no comprendido entre 1 y 7, deberá mostrar
     * un error por pantalla y pedir un nuevo número. Por ejemplo usando una ventana
     * de error con el texto “Día de la semana no válido”
     * 
     * 
     * - Si el usuario pulsa cancelar en la ventana de petición de número, se
     * mostrará una ventana de error indicando “Día no seleccionado” (1,5 puntos)
     */
    public static void main(String[] args) {

        int numeroIntroducido = 0;

        do {

            String textoIntroducido = JOptionPane.showInputDialog(null, "Introduce un número", "Actividad 2",
                    JOptionPane.INFORMATION_MESSAGE);

            if (textoIntroducido == null) {
                JOptionPane.showMessageDialog(null, "Día no seleccionado", "Actividad 2",
                        JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            // Transformamos el String a un int
            numeroIntroducido = Integer.parseInt(textoIntroducido);
            if (numeroIntroducido < 1 || numeroIntroducido > 7) {
                JOptionPane.showMessageDialog(null, "Número fuera de rango", "Actividad 2",
                        JOptionPane.INFORMATION_MESSAGE);
                continue;
            }

        } while (numeroIntroducido < 1 || numeroIntroducido > 7);

        String cadenaFinal = "El día seleccionado es: ";
        switch (numeroIntroducido) {
        case 1:
            cadenaFinal += "Lunes";
            // cadenaFinal = cadenaFinal + "Lunes";
            break;
        case 2:
            cadenaFinal += "Martes";
            break;
        case 3:
            cadenaFinal += "Miércoles";
            break;
        case 4:
            cadenaFinal += "Jueves";
            break;
        case 5:
            cadenaFinal += "Viernes";
            break;
        case 6:
            cadenaFinal += "Sábado";
            break;
        case 7:
            cadenaFinal += "Domingo";
            break;
        }

        JOptionPane.showMessageDialog(null, cadenaFinal, "Actividad 2", JOptionPane.INFORMATION_MESSAGE);
    }
}
