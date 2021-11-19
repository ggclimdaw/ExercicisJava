import java.util.Scanner;

public class Actividad2 {
    /*
     * Programa un algoritmo en lenguaje Java en el que dado un número introducido
     * por teclado, sume sus dígitos pares. El número introducido sólo podrá estar
     * entre 0 y 999. Si se introduce uno menor o mayor que este rango se avisará al
     * usuario y se le pedirá otro número.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroIntroducido = 0;
        int digitoCentenas, digitoDecenas, digitoUnidades;
        int sumaTotal = 0;

        do {
            System.out.println("Introduce un número entre 0 y 999");
            numeroIntroducido = entrada.nextInt();
            if (numeroIntroducido < 0 || numeroIntroducido > 999) {
                System.out.println("Número fuera de rango");
                continue;
            }
            digitoCentenas = numeroIntroducido / 100;
            if (digitoCentenas % 2 == 0)
                sumaTotal += digitoCentenas;

            int resto = numeroIntroducido - (100 * digitoCentenas);
            digitoDecenas = resto / 10;
            if (digitoDecenas % 2 == 0)
                sumaTotal += digitoDecenas;
            digitoUnidades = resto - (10 * digitoDecenas);
            if (digitoUnidades % 2 == 0)
                sumaTotal += digitoUnidades;
            System.out.println("La suma total de los dígitos pares es " + sumaTotal);

        } while (numeroIntroducido < 0 || numeroIntroducido > 999);

        entrada.close();
    }
}
