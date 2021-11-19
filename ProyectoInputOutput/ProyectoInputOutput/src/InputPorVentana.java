import javax.swing.JOptionPane;

public class InputPorVentana {

    public static void main(String[] args) {
        String CadenaIntroducida = JOptionPane.showInputDialog(null, "Dame un cadena", "Ejemplo de peticion");

        JOptionPane.showMessageDialog(null, CadenaIntroducida, "La cadena introducida es", JOptionPane.ERROR_MESSAGE);

        System.out.println("La cadena introducida es: " + CadenaIntroducida);

    }
}
