import java.util.Scanner;

import javax.swing.JOptionPane;

public class Actividad4 {
    /*
     * Diseña un algoritmo que muestre en una ventana un menú con opciones que serán
     * las siguientes (1.75 puntos):
     * 
     * - Contar caracteres de una palabra. Pedirá una palabra utilizando una ventana
     * modal (JOptionPane) y, una vez introducida la palabra y si se pulsa aceptar,
     * mostrará una ventana informando de la longitud de la palabra.
     * 
     * -Almacenar 3 enteros en un array. Deberá pedir al usuario 3 números por
     * consola y los almacenará en un array de números enteros. Una vez hecho esto,
     * mostrará una ventana por pantalla indicando que el almacenamiento ha sido
     * satisfactorio.
     * 
     * -Salir del programa. Cuando se elija esta opción se mostrará en una ventana
     * el texto “Fin de programa” junto con el icono de advertencia.
     */
    public static void main(String[] args) {

        Object seleccion = JOptionPane.showInputDialog(
                null, "Seleccione una opción", "Actividad 4", JOptionPane.QUESTION_MESSAGE, null, new Object[] {
                        "Contar caracteres de una palabra", "Almacenar 3 enteros en un array", "Salir del programa" },
                "Contar caracteres de una palabra");

        if (seleccion != null) {

            if (seleccion.equals("Contar caracteres de una palabra")) {
                String palabraIntroducida = JOptionPane.showInputDialog(null, "Introduce una palabra", "Actividad 4",
                        JOptionPane.INFORMATION_MESSAGE);
                if (palabraIntroducida != null) {
                    int longitudPalabra = palabraIntroducida.length();
                    JOptionPane.showMessageDialog(null, "La cadena introducida tiene " + longitudPalabra + " letras",
                            "Actividad 4", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Palabra no introducida", "Actividad 4",
                            JOptionPane.INFORMATION_MESSAGE);
                }

            } else if (seleccion.equals("Almacenar 3 enteros en un array")) {

                Scanner entrada = new Scanner(System.in);
                int arrayElementos[] = new int[3];
                int contador = 0;
                do {
                    System.out.println("Introduce el número " + contador);
                    int numeroIntroducido = entrada.nextInt();
                    arrayElementos[contador] = numeroIntroducido;
                    contador++;
                } while (contador < 3);

                System.out.println("Almacenamiento satisfactorio");
                entrada.close();

            } else {
                JOptionPane.showMessageDialog(null, "Fin de programa", "Actividad 4", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selección no realizada, fin de programa", "Actividad 4",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
