import javax.swing.JOptionPane;

public class proves {

        public static String valorstr, DatoaBuscar, selecciostr, n;

        public static void main(String[] args, String text) throws Exception {

                // Creamos el array tipo string de 100 posiciones
                String anotaciones[] = new String[100];
                do {
                        // Creamos la ventana con el menu para el usuario
                        Object menu1 = JOptionPane.showInputDialog(null, "Seleccione una opción", "Practica UD2",
                                        JOptionPane.QUESTION_MESSAGE, null,
                                        new Object[] { "1. Crear una anotacion", "2. Listar anotaciones existentes",
                                                        "3. Buscar una anotacion", "4. Eliminar una anotacion",
                                                        "5. Modificar una anotacion",
                                                        "6. Marcar una anotacion como importante",
                                                        "7. Desmarcar una anotacion como importante",
                                                        "8. Listar anotaciones importantes", "9. Salir del programa" },
                                        "1. Crear una anotacion");

                        valorstr = menu1.toString();

                        switch (valorstr) {

                        case "1. Crear una anotacion":
                                String textoUsuario = JOptionPane.showInputDialog(null, "Introduce anotacion",
                                                "Anotaciones y recordatorios", JOptionPane.INFORMATION_MESSAGE);

                                for (int contaor = 0; contaor < anotaciones.length; contaor++) {
                                        String anotacionSeleccionada = anotaciones[contaor];

                                        if (anotacionSeleccionada == null || anotacionSeleccionada.equals(" ")) {
                                                anotaciones[contaor] = textoUsuario;
                                                break;
                                        }
                                }
                                break;

                        case "2. Listar anotaciones existentes":

                                String mostrar = "";
                                for (int i = 0; i < anotaciones.length; i++) {
                                        mostrar = mostrar + anotaciones[i];
                                        mostrar += "  ";
                                }
                                JOptionPane.showMessageDialog(null, mostrar);

                                break;

                        case "3. Buscar una anotacion":
                                // Creem el menú del punt 3 on triarà bucar per posició o bucar per contingut
                                Object menuP3 = JOptionPane.showInputDialog(null, "Seleccione una opción",
                                                "Practica UD2 punt3", JOptionPane.QUESTION_MESSAGE, null,
                                                new Object[] { "1. Buscar per posicio", "2. Buscar per contingut" },
                                                "1. Buscar per posició");

                                selecciostr = menuP3.toString();
                                if (selecciostr == "1. Buscar per posicio") {
                                        // System.out.println("Has triat 1");
                                        // Método con un parámetro

                                        String posilloc = JOptionPane.showInputDialog("Introdueix la posicio");
                                        int puesto = Integer.parseInt(posilloc);
                                        for (int i = 0; i < anotaciones.length; i++) {
                                                if (i == puesto) {
                                                        JOptionPane.showMessageDialog(null, anotaciones[i]);
                                                        break;
                                                }

                                        }
                                        break;

                                } else {

                                        break;

                                }

                        case "4. Eliminar una anotacion":
                                System.out.println("Caso 4");
                                break;

                        case "5. Modificar una anotacion":
                                System.out.println("Caso 5");
                                break;

                        case "6. Marcar una anotacion como importante":
                                System.out.println("Caso 6");
                                break;

                        case "7. Desmarcar una anotacion como importante":
                                System.out.println("Caso 7");
                                break;

                        case "8. Listar anotaciones importantes":
                                System.out.println("Caso 8");
                                break;

                        default:
                                break;
                        }

                } while (!valorstr.equals("9. Salir del programa"));

        }
}
