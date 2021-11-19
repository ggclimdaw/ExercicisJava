import java.util.Scanner;

public class Actividad3 {
    /*
     * Implementa un algoritmo que almacene un array de 5 enteros que se le pedirán
     * al usuario por consola (Introduce el número 1, introduce el número 2, etc..).
     * Una vez almacenados los 5, deberá imprimir por pantalla “Los valores
     * almacenados han sido ….” junto con los distintos valores separados por
     * espacios.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arrayElementos[] = new int[5];

        int contador = 0;
        do {
            System.out.println("Introduce el número " + contador);
            int numeroIntroducido = entrada.nextInt();
            arrayElementos[contador] = numeroIntroducido;
            contador++;
        } while (contador < 5);

        // for (int i = 0; i < arrayElementos.length; i++) {
        // System.out.println("Introduce el número " + i);
        // int numeroIntroducido = entrada.nextInt();
        // arrayElementos[i] = numeroIntroducido;
        // }
        System.out.print("Los números introducidos han sido: ");
        for (int posicion = 0; posicion < arrayElementos.length; posicion++) {
            System.out.print(" " + arrayElementos[posicion]);
        }

        entrada.close();
    }
}
