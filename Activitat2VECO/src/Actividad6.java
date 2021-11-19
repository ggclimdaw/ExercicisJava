import java.util.Scanner;

public class Actividad6 {
    /*
     * Programa un algoritmo en lenguaje Java que lea 10 números, los almacene en un
     * array y que además determine el mayor, el menor y la media de todos los
     * introducidos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerosIntroducidos[] = new int[10];
        int minimo = 0, maximo = 0;
        int sumaTotal = 0;

        for (int contador = 0; contador < numerosIntroducidos.length; contador++) {
            System.out.println("Introduce el número " + contador + " :");
            int numeroSeleccionado = entrada.nextInt();
            numerosIntroducidos[contador] = numeroSeleccionado;
            sumaTotal += numeroSeleccionado;
            if (numeroSeleccionado < minimo || contador == 0)
                minimo = numeroSeleccionado;

            if (numeroSeleccionado > maximo || contador == 0)
                maximo = numeroSeleccionado;

        }

        System.out.println("El menor número ha sido " + minimo);
        System.out.println("El mayor número ha sido " + maximo);
        System.out.println("La media de todos los valores ha sido " + (sumaTotal / numerosIntroducidos.length));
        entrada.close();
    }
}
