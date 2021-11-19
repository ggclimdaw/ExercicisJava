import java.util.Scanner;

public class Actividad3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre;
        int edad;
        String cadenaResultado;

        System.out.println("Introduce el nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Introduce la edad: ");
        edad = entrada.nextInt();

        cadenaResultado = nombre + " tiene " + edad + " años.";
        System.out.println(cadenaResultado);

        entrada.close();

    }

}
