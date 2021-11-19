import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String primeraCadena, segundaCadena;
        String resultadoConcatenacion;

        System.out.println("Por favor introduce la primera palabra: ");
        primeraCadena = entrada.nextLine();

        System.out.println("Por favor introduce la segunda palabra: ");
        segundaCadena = entrada.nextLine();

        resultadoConcatenacion = primeraCadena + "  " + segundaCadena;
        System.out.println("Este es el resultado de unir las dos cadenas: " + resultadoConcatenacion);

        entrada.close();

    }

}
