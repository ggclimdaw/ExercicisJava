import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Dime el tamaño de la array");
        int longitudArray = input.nextInt(); // El usuario introduce por teclado el tamaño de la array
        input.nextLine(); // Limpiamos el buffer del scanner
        int[] arrayConRandoms = FuncionesArray.generaArrayInt(longitudArray); // Generamos el array
        // Imprimimos el array

        do {
            int seleccion = imprimeMenu();
            switch (seleccion) {
            case 1:
                FuncionesArray.visualizarArray(arrayConRandoms);
                break;
            case 2:
                int minimo = FuncionesArray.minimoArrayInt(arrayConRandoms);
                // Si la función es VOID, no es necesario guardar en una variable, ya que se
                // trata de una función sin retorno
                FuncionesArray.visualizarEntero(minimo);
                break;
            case 3:
                int maximo = FuncionesArray.maximoArrayInt(arrayConRandoms);
                // Si la función es VOID, no es necesario guardar en una variable, ya que se
                // trata de una función sin retorno
                FuncionesArray.visualizarEntero(maximo);
                break;
            case 4:
                Double resul = FuncionesArray.mediaArrayInt(arrayConRandoms);
                // sumar todos los valores de la array y dividir entre el length de la array
                FuncionesArray.visualizarEntero(resul);
                break;
            case 5:
                // Primero, pedir al usuario un valor por teclado
                // Aprovechar el scanner del Main
                // La función estaEnArrayInt SOLO nos mostrará mediante un Systemoutprint si el
                // número introducido está o no en la array, nada más. (VOID)
            case 6:
                // Pedir al usuario por teclado el número a buscar
                // En la función, busque la posición y nos devuelva esta (Pista: La posición es
                // i)
            case 7:
                // invertir el array y mostrarlo al revés.
                // Pista: un contador nos ayudará

                // For para recorrer el array PERO necesitarás un contador que vaya del tamaño
                // de la array a 0
            case 8:
                salir = true;
            default:
                break;
            }

        } while (salir != true);
    }

    public static int imprimeMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcionSeleccionada;
        System.out.println("Elige una opción de las siguientes:");
        System.out.println(" 1. visualizar array generada");
        System.out.println(" 2. minimoArryInt ");
        System.out.println(" 3. maximoArrayInt ");
        System.out.println(" 4. mediaArrayInt ");
        System.out.println(" 5. estaEnArrayInt ");
        System.out.println(" 6. posicionEnArryInt ");
        System.out.println(" 7. volteaArrayInt ");
        System.out.println(" 8. Salir ");
        opcionSeleccionada = entrada.nextInt();
        entrada.nextLine();
        return opcionSeleccionada;
    }

}
