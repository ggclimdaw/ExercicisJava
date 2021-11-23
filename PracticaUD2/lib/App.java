import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {

        // Creamos el array tipo string de 100 posiciones
        String anotaciones[] = new String[100];

        // Creamos la ventana con el menu para el usuario
        Object seleccion = JOptionPane.showInputDialog(null, "Seleccione una opción", "Practica UD2",
                JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "1. Crear una anotacion", "2. Listar anotaciones existentes", "3. Buscar una anotacion",
                        "4. Eliminar una anotacion", "5. Modificar una anotacion",
                        "6. Marcar una anotacion como importante", "7. Desmarcar una anotacion como importante",
                        "8. Listar anotaciones importantes", "9. Salir del programa" },
                "1. Crear una anotacion");

        if (seleccion.equals("1. Crear una anotacion")) {
            String textoUsuario = JOptionPane.showInputDialog(null, "Introduce anotacion",
                    "Anotaciones y recordatorios", JOptionPane.INFORMATION_MESSAGE);

            for (int contaor = 0; contaor < anotaciones.length; contaor++) {
                String anotacionSeleccionada = anotaciones[contaor];
                if (anotacionSeleccionada == null || anotacionSeleccionada.equals(" ")) {
                    anotaciones[contaor] = textoUsuario;
                    break;
                }

            }
        } else if (seleccion.equals("2. Listar anotaciones existentes")) {

            String anotacionesString = "";

            for (int contaor = 0; contaor < anotaciones.length; contaor++) {
                if (anotaciones[contaor] != null) {
                    anotacionesString += anotaciones[contaor] + "\n";
                }
            }

            JOptionPane.showMessageDialog(null, anotacionesString);

        } else if (seleccion.equals("3. Buscar una anotacion")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("4. Eliminar una anotacion")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("5. Modificar una anotacion")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("6. Marcar una anotacion como importante")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("7. Desmarcar una anotacion como importante")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("8. Listar anotaciones importantes")) {
            System.out.println("Listar anotaciones");

        } else if (seleccion.equals("9. Salir del programa")) {
            System.out.println("Listar anotaciones");

        } else {
            JOptionPane.showMessageDialog(null, "Fin de programa", "Practica UD2", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
