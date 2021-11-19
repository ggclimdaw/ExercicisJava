import java.util.Scanner;

public class Actividad5 {
    /*
     * Programa un algoritmo en lenguaje Java que dados los números comprendidos
     * entre 1 y un valor límite n (que se preguntará en el programa), especificará
     * para cada número si la suma de sus divisores es >= que 20 o no.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduce un número");
        int numeroIntroducido = entrada.nextInt();

        // Recorremos desde 1 hasta el número introducido
        for (int contador = 1; contador <= numeroIntroducido; contador++) {

            int sumaDivisores = 0;

            // Calculando los divisores del número en el que estamos. Recorremos desde 1
            // hasta el número en el que estamos ahora mismo
            for (int posibleDivisor = 1; posibleDivisor <= contador; posibleDivisor++) {
                if (contador % posibleDivisor == 0) {
                    sumaDivisores += posibleDivisor;
                }
            }

            if (sumaDivisores >= 20) {
                System.out.println("Los divisores del número de " + contador + " sí suman 20 o más");
            } else {
                System.out.println("Los divisores del número de " + contador + " no suman 20 o más");
            }

        }

        entrada.close();
    }
}
