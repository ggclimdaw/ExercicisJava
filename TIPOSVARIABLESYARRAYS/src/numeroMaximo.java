import java.util.Scanner;

public class numeroMaximo {
    public static void main(String[] args) {

        int numeroMaximo = 10;

        for (int contador = 0; contador < numeroMaximo; contador++) {
            int numeroIteracion = contador + 1;
            String cadenaTemporal = "Estamos en la iteración " + numeroIteracion;
            System.out.println(cadenaTemporal);
            if (contador == (numeroMaximo - 1)) {
                System.out.println("Esta es la última iteracion del bucle ");
            }
        }
    }

}
