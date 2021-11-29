import javax.swing.JOptionPane;

public class AnotacionesUtil {

    // Metodo encargado de crear una nueva anotación
    public static String[] crearAnotacion(String[] listadoAnotacionesRecibido) {
        String textoAnotacion = JOptionPane.showInputDialog(null, "Introduce un texto",
                "Crear anotación", JOptionPane.INFORMATION_MESSAGE);
        if (textoAnotacion != null) {
            for (int contadorAnotaciones = 0; contadorAnotaciones < listadoAnotacionesRecibido.length; contadorAnotaciones++) {
                String anotacionSeleccionada = listadoAnotacionesRecibido[contadorAnotaciones];
                if (anotacionSeleccionada == null) {
                    listadoAnotacionesRecibido[contadorAnotaciones] = textoAnotacion;
                    break;
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizando aplicación",
                    "Crear anotación",
                    JOptionPane.INFORMATION_MESSAGE);
        }
        return listadoAnotacionesRecibido;
    }

    // Metodo encargado de listar anotaciones
    public static void listarAnotaciones(String[] listadoAnotacionesRecibido) {
        String textoAnotaciones = "";
        for (int contadorAnotaciones = 0; contadorAnotaciones < listadoAnotacionesRecibido.length; contadorAnotaciones++) {
            String anotacionSeleccionada = listadoAnotacionesRecibido[contadorAnotaciones];
            if (anotacionSeleccionada != null && !anotacionSeleccionada.equals("")) {
                textoAnotaciones += "- Posición " + contadorAnotaciones + ": " + anotacionSeleccionada
                        + "\n";
            }
        }
        if (textoAnotaciones.equals("")) {
            JOptionPane.showMessageDialog(null, "No existen anotaciones almacenada",
                    "Listado de Anotaciones", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, textoAnotaciones, "Listado de Anotaciones",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }

    // Eliminar anotaciones
    public static boolean eliminarAnotacion(String[] listadoAnotacionesRecibido, int[] listadoAnotacionesImp) {

        String posicionABuscar = JOptionPane.showInputDialog(null, "Introduce una posicion",
                "Eliminar anotación", JOptionPane.INFORMATION_MESSAGE);
        if (posicionABuscar != null) {
            int indiceABuscar = Integer.parseInt(posicionABuscar);
            String anotacionSeleccionada = listadoAnotacionesRecibido[indiceABuscar];
            if (anotacionSeleccionada != null && !anotacionSeleccionada.equals("")) {
                listadoAnotacionesRecibido[indiceABuscar] = null;

                // Si la anotación es importante también debemos desmarcarla
                for (int contImportantes = 0; contImportantes < listadoAnotacionesImp.length; contImportantes++) {
                    int indiceSeleccionado = listadoAnotacionesImp[contImportantes];
                    if (indiceSeleccionado == indiceABuscar) {
                        listadoAnotacionesImp[contImportantes] = -1;
                        break;
                    }
                }
                JOptionPane.showMessageDialog(null, "Anotación eliminada correctamente", "Eliminar anotacion",
                        JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "No existe una anotación en la posición seleccionada",
                        "Eliminar anotacion",
                        JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizando apliación", "Eliminar anotacion",
                    JOptionPane.INFORMATION_MESSAGE);
            return false;
        }

    }

}
