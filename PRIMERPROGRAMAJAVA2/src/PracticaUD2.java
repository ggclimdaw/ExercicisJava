import javax.swing.JOptionPane;

public class PracticaUD2 {
    public static void main(String[] args) {

        // boolean que marca si se repite el menú principal
        boolean finalizarMenu = false;

        // Listado de anotaciones
        String[] listadoAnotaciones = new String[100];

        // Opciones del menu principal
        String[] opcionesMenu = { "Crear una anotación", "Listar anotaciones existentes", "Buscar una anotacion",
                "Eliminar una anotacion",
                "Modificar una anotación", "Marcar una anotacion como importante",
                "Desmarcar una antoracion como impotante", "Listar anotaciones importantes", "Salir" };

        // Opciones de búsqueda de anotaciones
        String[] opcionesBusqueda = { "Por texto", "Por posición" };

        do {
            String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige una opción del menú",
                    "Práctica UD2. Menú principal", JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu,
                    opcionesMenu[0]);

            if (opcionSeleccionada != null) {
                // El ususario ha seleccionado una opción
                switch (opcionSeleccionada) {

                    case "Crear una anotación":
                        String textoAnotacion = JOptionPane.showInputDialog(null, "Introduce un texto",
                                "Crear anotación", JOptionPane.INFORMATION_MESSAGE);
                        if (textoAnotacion != null) {
                            for (int contadorAnotaciones = 0; contadorAnotaciones < listadoAnotaciones.length; contadorAnotaciones++) {
                                String anotacionSeleccionada = listadoAnotaciones[contadorAnotaciones];
                                if (anotacionSeleccionada == null) {
                                    listadoAnotaciones[contadorAnotaciones] = textoAnotacion;
                                    break;
                                }

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizando aplicación",
                                    "Crear anotación",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Listar anotaciones existentes":
                        String textoAnotaciones = "";
                        for (int contadorAnotaciones = 0; contadorAnotaciones < listadoAnotaciones.length; contadorAnotaciones++) {
                            String anotacionSeleccionada = listadoAnotaciones[contadorAnotaciones];
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

                        break;

                    case "Buscar una anotacion":
                        String opcionBusquedaSelecionada = (String) JOptionPane.showInputDialog(null,
                                "Elige una opción del menú", "Pràctica UD2. Opciones de búsqueda",
                                JOptionPane.INFORMATION_MESSAGE, null, opcionesBusqueda, opcionesBusqueda[0]);
                        if (opcionBusquedaSelecionada != null) {

                            switch (opcionBusquedaSelecionada) {
                                // Busqueda por texto
                                case "Por texto":
                                    String textoABuscar = JOptionPane.showInputDialog(null, "Introduce un texto",
                                            "Buscar anotación", JOptionPane.INFORMATION_MESSAGE);
                                    if (textoABuscar != null) {
                                        // componemos un texto con todas las anotaciones encontradas
                                        String textoAnotacionesEncontradas = "";
                                        for (int contadorAnotaciones = 0; contadorAnotaciones < listadoAnotaciones.length; contadorAnotaciones++) {
                                            String anotacionSeleccionada = listadoAnotaciones[contadorAnotaciones];
                                            if (anotacionSeleccionada != null && !anotacionSeleccionada.equals("")) {
                                                // Tras verificar que la posicion no es nula y tiene texto, usamos el
                                                // contains
                                                // para ver si contiene el texto a buscar
                                                if (anotacionSeleccionada.contains(textoABuscar)) {
                                                    textoAnotacionesEncontradas += "- Posición " + contadorAnotaciones
                                                            + ": "
                                                            + anotacionSeleccionada + "\n";
                                                }
                                            }
                                        }
                                        // Si el texto compuesto sigue siendo vacío es porque no se han encontrado
                                        // anotaciones coincidentes
                                        if (textoAnotacionesEncontradas.equals("")) {
                                            textoAnotacionesEncontradas = "No se han encontrado anotaciones con el texto a buscar";
                                        }
                                        JOptionPane.showMessageDialog(null, textoAnotacionesEncontradas,
                                                "Listado de anotaciones coincidentes",
                                                JOptionPane.INFORMATION_MESSAGE);

                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Pulsado aspa o cancelar, finalizando aplicación",
                                                "Crear anotación",
                                                JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    break;
                                // Busqueda per posición
                                case "Por posición":
                                    String posicionABuscar = JOptionPane.showInputDialog(null, "Introduce una posicion",
                                            "Buscar anotación", JOptionPane.INFORMATION_MESSAGE);
                                    if (posicionABuscar != null) {
                                        String textoAnotacionesEncontradas = "";
                                        int indiceABuscar = Integer.parseInt(posicionABuscar);
                                        // Nos dirigimos directamente a la anotación de la posición introducida por el
                                        // ususario
                                        String anotacionSeleccionanda = listadoAnotaciones[indiceABuscar];
                                        if (anotacionSeleccionanda != null && !anotacionSeleccionanda.equals("")) {
                                            textoAnotacionesEncontradas = "- Posición " + indiceABuscar + ": "
                                                    + anotacionSeleccionanda + "\n";
                                        }
                                        // si el texto compuesto sigue vacío es porque no se han encontrado anotaciones
                                        // coincidentes
                                        if (textoAnotacionesEncontradas.equals("")) {
                                            textoAnotacionesEncontradas = "No se han encontrado anotaciones en la posición a buscar";
                                        }
                                        JOptionPane.showMessageDialog(null, textoAnotacionesEncontradas,
                                                "Buscar anotación",
                                                JOptionPane.INFORMATION_MESSAGE);

                                    } else {
                                        JOptionPane.showMessageDialog(null,
                                                "Pulsado aspa o cancelar, finalizando aplicación",
                                                "Buscar anotación", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    break;
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizando apliación",
                                    "Buscar una anotacion",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Eliminar una anotacion":
                        break;

                    case "Modificar una anotación":
                        break;

                    case "Marcar una anotacion como importante":
                        break;

                    case "Desmarcar una antoracion como impotante":
                        break;

                    case "Listar anotaciones importantes":
                        break;

                    case "Salir":
                        finalizarMenu = true;
                        break;

                }

            } else {
                // Pulsado aspa o cancelar, finalizando aplicacion
                JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizando apliación", "Práctica UD2",
                        JOptionPane.INFORMATION_MESSAGE);
                finalizarMenu = true;
            }

        } while (!finalizarMenu);

    }
}
