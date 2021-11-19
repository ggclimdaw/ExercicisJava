public class Actividad3 {
    /*
     * Escribe la tabla de multiplicar de los números del 1 al 10. La tabla de cada
     * número ira del 0 al 10.
     */
    public static void main(String[] args) {
        for (int primerMultiplicador = 1; primerMultiplicador <= 10; primerMultiplicador++) {
            System.out.println("Tabla del " + primerMultiplicador);
            for (int segundoMultiplicador = 0; segundoMultiplicador <= 10; segundoMultiplicador++) {
                System.out.println("\t" + primerMultiplicador + " * " + segundoMultiplicador + " = "
                        + (primerMultiplicador * segundoMultiplicador));
            }

        }
    }
}
