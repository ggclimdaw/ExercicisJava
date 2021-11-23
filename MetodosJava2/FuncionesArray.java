public class FuncionesArray {

    // (Visibilidad del método) (static/no static) (Tipo de salida) (Nombre del
    // método) (Tipo de entrada(Si la hay))
    public static int[] generaArrayInt(int n) {

        // Generar array de tamaño n

        int[] array = new int[n];

        // Llenar de números aleatórios

        for (int i = 0; i < n; i++) {

            // Generar número aleatorio

            int random = (int) (Math.random() * 1000 + 1);

            // Guardar el número aleatorio en el array

            array[i] = random;

        }

        // Retornar el array
        return array;
    }

    public static void visualizarArray(int[] array) {

        System.out.println("El contenido de la array es:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void visualizarEntero(int n) {
        System.out.println(n);
    }

    public static int minimoArrayInt(int[] array) {

        // Donde guardar el mínimo
        int minimo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }

        // Devolver el mínimo valor de la array

        return minimo;
    }

    public static int maximoArrayInt(int[] array) {

        // Donde guardar el mínimo
        int maximo = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        // Devolver el mínimo valor de la array

        return maximo;
    }

    public static double mediaArrayInt(int[] array) {

        // sumar todos los valores de la array y dividir entre el length de la array
        int suma = 0;

        for (int i : array) {
            suma += i;

        }

        // Devolver la media del contenido de la array
        double resul = (double) suma / array.length;

        return resul;
    }

}
