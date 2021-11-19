import javax.swing.JOptionPane;

public class Actividad1 {

    /*
     * Diseña un algoritmo en el que dado un nº que se introduce a través del
     * teclado, diga si es positivo o negativo y par o impar. La petición y salida
     * de datos se realizará utilizando ventanas (JOptionPane)
     */
    public static void main(String[] args) {

        boolean esPositivo, esPar;
        int numeroIntroducido;

        String textoIntroducido = JOptionPane.showInputDialog(null, "Introduce un número", "Actividad 1",
                JOptionPane.INFORMATION_MESSAGE);

        if (textoIntroducido == null) {
            JOptionPane.showMessageDialog(null, "El usuario ha cerrado la ventana", "Actividad 1",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Transformamos el String a un int
            numeroIntroducido = Integer.parseInt(textoIntroducido);

            // Calculamos si es positivo o no. Utilizamos el operador ternario
            esPositivo = numeroIntroducido >= 0 ? true : false;

            // Calculamos si es par o impar. Utilizamos el operador ternario
            esPar = numeroIntroducido % 2 == 0 ? true : false;

            // Componemos la cadena resultante
            String cadenaResultante = "El número introducido es ";
            cadenaResultante += esPositivo ? "positivo" : "negativo";

            // if(esPositivo){
            // cadenaResultante = cadenaResultante + "positivo";
            // }else{
            // cadenaResultante = cadenaResultante + "negativo";
            // }
            cadenaResultante += esPar ? " y par " : " y impar ";
            // if (esPar) {
            // cadenaResultante = cadenaResultante + " y par ";
            // } else {
            // cadenaResultante = cadenaResultante + " y impar ";
            // }
            JOptionPane.showMessageDialog(null, cadenaResultante, "Actividad 1", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
