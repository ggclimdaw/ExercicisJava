import java.util.Scanner;

public class Actividad1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int primerNumero, segundoNumero;
        int sumaTotal;

        System.out.println("Por favor introduce el primer numero ");
        primerNumero = entrada.nextInt();

        System.out.println("Por favor introduce el segundo numero ");
        segundoNumero = entrada.nextInt();

        sumaTotal = primerNumero + segundoNumero;

        System.out.println("El resultado de la suma es: " + sumaTotal);

        entrada.close();

    }

}