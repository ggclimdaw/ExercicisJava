import javax.swing.JOptionPane;

public class PracticaUD2 {
    public static void main(String[] args) {

        // boolean que marca si se repite el menú principal
        boolean finalizarMenu = false;

        // Listado de anotaciones
        String[] listadoAnotaciones = new String[100];
        int[] anotacionesImportantes = new int[100];

        // Opciones de búsqueda de anotaciones
        String[] opcionesBusqueda = { "Por texto", "Por posición" };

        // Cridem la funció inicializarAnotacionesImp
        anotacionesImportantes = inicializarAnotacionesImportantes(anotacionesImportantes);

        do {
            String opcionSeleccionada = generarMenuPrincipal();

            if (opcionSeleccionada != null) {
                // El ususario ha seleccionado una opción
                switch (opcionSeleccionada) {

                    case "Crear una anotación":
                        listadoAnotaciones = AnotacionesUtil.crearAnotacion(listadoAnotaciones);
                        break;

                    case "Listar anotaciones existentes":
                        AnotacionesUtil.listarAnotaciones(listadoAnotaciones);
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
                        boolean eliminacionSatisfactoria = AnotacionesUtil.eliminarAnotacion(listadoAnotaciones,
                                anotacionesImportantes);
                        System.out.println("Anotacion eliminada con resultado : " + eliminacionSatisfactoria);
                        break;

                    case "Modificar una anotación":
                        String posicionAModificar = JOptionPane.showInputDialog(null, "Introduce una posicion",
                                "Modificar anotación", JOptionPane.INFORMATION_MESSAGE);

                        if (posicionAModificar != null) {
                            int indiceAModificar = Integer.parseInt(posicionAModificar);
                            String anotacionSeleccionada = listadoAnotaciones[indiceAModificar];
                            if (anotacionSeleccionada != null && !anotacionSeleccionada.equals("")) {
                                String nuevoTextoAnotacion = JOptionPane.showInputDialog(null,
                                        "Introduce un nuevo texto para la anotación",
                                        "Modificar anotación", JOptionPane.INFORMATION_MESSAGE);
                                if (nuevoTextoAnotacion != null) {
                                    listadoAnotaciones[indiceAModificar] = nuevoTextoAnotacion;
                                    JOptionPane.showMessageDialog(null, "Anotación modificada correctamente",
                                            "Modificar anotación",
                                            JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null,
                                            "No existe una anotación en la posición seleccionada",
                                            "Modificar anotación",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "No existe una anotación en la posición seleccionada",
                                    "Modificar anotación", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Marcar una anotacion como importante":
                        String posicionAMarcar = JOptionPane.showInputDialog(null, "Introduce una posicion",
                                "Marcar anotación", JOptionPane.INFORMATION_MESSAGE);

                        if (posicionAMarcar != null) {
                            int indiceAMarcar = Integer.parseInt(posicionAMarcar);
                            if (listadoAnotaciones[indiceAMarcar] == null) {
                                JOptionPane.showInputDialog(null, "No existe una anotación en esa posición",
                                        "Marcar anotación", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                boolean contieneIndice = false;
                                // Verificamos que la posición a marcar como importante no lo esté ya
                                for (int contImportantes = 0; contImportantes < anotacionesImportantes.length; contImportantes++) {
                                    int indiceSeleccionado = anotacionesImportantes[contImportantes];
                                    if (indiceSeleccionado == indiceAMarcar) {
                                        contieneIndice = true;
                                        break;
                                    }
                                }
                                // si no está marcada, procedemos a hacerlo
                                if (!contieneIndice) {
                                    for (int contImportantes = 0; contImportantes < anotacionesImportantes.length; contImportantes++) {
                                        int indiceSeleccionado = anotacionesImportantes[contImportantes];
                                        if (indiceSeleccionado == -1) {
                                            anotacionesImportantes[contImportantes] = indiceAMarcar;
                                            JOptionPane.showMessageDialog(null, "Anotación marcada correctamente",
                                                    "Marcar anotación", JOptionPane.INFORMATION_MESSAGE);
                                            break;

                                        }

                                    }

                                }

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizado aplicación",
                                    "Modificar anotación", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Desmarcar una antoracion como impotante":
                        String posicionADesmarcar = JOptionPane.showInputDialog(null, "Introduce una posicion",
                                "Desmarcar anotación", JOptionPane.INFORMATION_MESSAGE);

                        if (posicionADesmarcar != null) {
                            int indiceADesmarcar = Integer.parseInt(posicionADesmarcar);
                            boolean contieneIndice = false;

                            // Verificamos que la poscion a desmarcar es importante y si lo es la
                            // desmarcamos
                            for (int contImportantes = 0; contImportantes < anotacionesImportantes.length; contImportantes++) {
                                int indiceSeleccionado = anotacionesImportantes[contImportantes];
                                if (indiceSeleccionado == indiceADesmarcar) {
                                    anotacionesImportantes[contImportantes] = -1;
                                    contieneIndice = true;

                                    JOptionPane.showMessageDialog(null, "Anotación desmarcada correctamente",
                                            "Desmarcar anotación", JOptionPane.INFORMATION_MESSAGE);
                                    break;
                                }
                            }
                            // Si no era importante lo notificamos
                            if (!contieneIndice) {
                                JOptionPane.showMessageDialog(null,
                                        "Anotación  no desmarcada como importante. No se desmarcará",
                                        "Desmarcar anotación", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Pulsado aspa o cancelar, finalizado aplicación",
                                    "Desmarcar anotación", JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Listar anotaciones importantes":
                        String textoAnotacionesImportantes = "";
                        for (int contadorAnotacionesImp = 0; contadorAnotacionesImp < anotacionesImportantes.length; contadorAnotacionesImp++) {
                            int anotacionSeleccionada = anotacionesImportantes[contadorAnotacionesImp];
                            if (anotacionSeleccionada != -1) {
                                String textoAnotacionImportante = listadoAnotaciones[anotacionSeleccionada];
                                textoAnotacionesImportantes += "- Posición " + anotacionSeleccionada + ": " +
                                        textoAnotacionImportante + "\n";

                            }

                        }
                        // Si el texto compuesto sigue siendo vacío es porque no se han encontrado
                        // anotaciones coincidentes
                        if (textoAnotacionesImportantes.equals("")) {
                            textoAnotacionesImportantes = "No existen anotaciones importantes";
                        }
                        JOptionPane.showMessageDialog(null, textoAnotacionesImportantes,
                                "Listado de anotaciones importantes",
                                JOptionPane.INFORMATION_MESSAGE);

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

    private static String generarMenuPrincipal() {
        // Opciones del menu principal
        String[] opcionesMenu = { "Crear una anotación", "Listar anotaciones existentes", "Buscar una anotacion",
                "Eliminar una anotacion",
                "Modificar una anotación", "Marcar una anotacion como importante",
                "Desmarcar una antoracion como impotante", "Listar anotaciones importantes", "Salir" };

        String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Elige una opción del menú",
                "Práctica UD2. Menú principal", JOptionPane.INFORMATION_MESSAGE, null, opcionesMenu,
                opcionesMenu[0]);

        return opcionSeleccionada;

    }

    private static int[] inicializarAnotacionesImportantes(int[] arrayAnotacionesImp) {
        // Inizializamos el array de anotaciones importantes a -1 para poder saber qué
        // posiciones no estan marcadas
        for (int contadorAnotacionesImportantes = 0; contadorAnotacionesImportantes < arrayAnotacionesImp.length; contadorAnotacionesImportantes++) {
            arrayAnotacionesImp[contadorAnotacionesImportantes] = -1;
        }
        return arrayAnotacionesImp;

    }

}