import javax.swing.JOptionPane;

public class Actividad4 {

    public static void main(String[] args) {

        String cadenaIntroducida = JOptionPane.showInputDialog(null, "Introduce un texto", "Actividad 4",
                JOptionPane.INFORMATION_MESSAGE);

        if (cadenaIntroducida == null) {
            cadenaIntroducida = "Nombre no introducido";
        }
        JOptionPane.showMessageDialog(null, cadenaIntroducida, "La cadena introducida es",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
