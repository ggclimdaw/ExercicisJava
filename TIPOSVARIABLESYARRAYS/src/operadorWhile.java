public class operadorWhile {

    public static void main(String[] args) throws Exception {

        int a = 2;
        /*
         * while (a < 5) { System.out.println("El valor de a es: " + a); a++;
         * 
         * }
         */
        // El mateix pero utilitzant el do while
        /*
         * do { System.out.println("El valor de a es: " + a); a++; } while (a < 5);
         */
        // El mateix pero utilitzant el for
        /*
         * for (int i = 0; i < 5; i++) { System.out.println("El valor de a es: " + i); }
         */
        // El mateix pero utilitzant un array
        int array[] = { 11, 12, 13, 14, 15 };
        for (int valor : array) {
            System.out.println("El valor de la posicion del array es: " + valor);
        }

    }
}
