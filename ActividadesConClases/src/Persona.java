public class Persona {

    public String nombre;
    public String apellidos;
    public String dni;
    public int edad;

    public void toStringPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("edad: " + edad);
        System.out.println("dni: " + dni);

    }

    public boolean esMayorEdad() {
        // return edad >= 18;
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public Persona() {
        System.out.println("Ejecutando Constructor");
        nombre = "Sin nombre";
        apellidos = "Sin apellido";
        edad = -1;
        dni = "---------";

    }

    public Persona(String nombreRec, String apellidosRec, String dniRec, int edadRec) {
        System.out.println("Ejecutando contructor con paràmetros");
        nombre = nombreRec;
        apellidos = apellidosRec;
        edad = edadRec;
        dni = dniRec;

    }

}
