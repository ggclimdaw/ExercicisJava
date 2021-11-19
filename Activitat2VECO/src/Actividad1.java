import java.util.Scanner;

public class Actividad1 {
    /*
     * Programa un algoritmo en lenguaje Java que lea un número y muestre por
     * pantalla sus divisores.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce un número");
        int numeroIntroducido = entrada.nextInt();

        System.out.println("Los divisores de " + numeroIntroducido + " son:");
        for (int contador = 1; contador <= numeroIntroducido; contador++) {

            if (numeroIntroducido % contador == 0) {
                System.out.print(contador + " ");
            }
        }

        System.out.println("");
        entrada.close();
    }
}
