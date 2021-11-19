import javax.lang.model.util.ElementScanner6;

public class OperadorTernario {

    public static void main(String[] args) throws Exception {

        int a = 2;
        // String cadenaResultado = a == 3 ? "Verdadero" : "Falso";
        // La línea comentada de dalt, substituiria el if - else de baix
        String cadenaResultado;
        if (a == 3) {
            cadenaResultado = "Verdadero";
        } else {
            cadenaResultado = "Falso";
        }
        System.out.println(cadenaResultado);

    }

}
