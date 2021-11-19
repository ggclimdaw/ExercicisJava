import java.util.Scanner;

public class InputPorConsola {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una cadena");
        String cadenaLeida = sc.nextLine();
        System.out.println("La cadena introducida es: " + cadenaLeida);

        System.out.println("Dame un número");
        int numeroLeido = sc.nextInt();
        System.out.println("El número introducido es: " + numeroLeido);

        sc.close();

    }
}
