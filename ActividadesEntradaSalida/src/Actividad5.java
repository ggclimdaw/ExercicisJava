import javax.swing.JOptionPane;

public class Actividad5 {
    public static void main(String[] args) {
        String cadenaResultante = "Se ha presionado ";

        int seleccion = JOptionPane.showOptionDialog(null, "Seleccionar una Opción", "¿Lo confirmas?",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[] { "SI", "NO", "Cancelar" }, "SI");

        switch (seleccion) {
        case JOptionPane.YES_OPTION:
            cadenaResultante += "SI";
            break;
        case JOptionPane.NO_OPTION:
            cadenaResultante += "NO";
            break;
        case JOptionPane.CANCEL_OPTION:
            cadenaResultante += "Cancelar";
            break;
        default:
            cadenaResultante += "Aspa de cierre";
            break;
        }
        System.out.println(cadenaResultante);

    }

}
