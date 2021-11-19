import java.util.Scanner;

public class Actividad4 {
    /*
     * Programa un algoritmo en lenguaje Java que lea una serie de números. Debemos
     * imprimir el número mayor y el número menor de la secuencia introducida. La
     * secuencia termina con el valor -1.
     */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mayor = 0, menor = 0;
        int numeroIntroducido = 0;

        do {
            System.out.println("Por favor, introduce un número o -1 para finalizar");
            numeroIntroducido = entrada.nextInt();
            if (numeroIntroducido != -1) {
                if (numeroIntroducido > mayor)
                    mayor = numeroIntroducido;
                if (numeroIntroducido < menor)
                    menor = numeroIntroducido;
            }

        } while (numeroIntroducido != -1);

        System.out.println("El menor número introducido ha sido: " + menor);
        System.out.println("El mayor número introducido ha sido: " + mayor);
        entrada.close();
    }
}
