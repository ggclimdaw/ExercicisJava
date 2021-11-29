public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        persona1.apellidos = "Vidal Salvador";
        persona1.edad = 12;
        persona1.dni = "12122222X";
        persona1.toStringPersona();
        System.out.println("¿Persona1 es mayor de edad? " + persona1.esMayorEdad());

        System.out.println("-----------------------");

        Persona persona2 = new Persona();
        persona2.nombre = "Ramon";
        persona2.apellidos = "Vidal Vidal";
        persona2.edad = 19;
        persona2.dni = "22222222K";
        persona2.toStringPersona();
        System.out.println("¿Persona2 es mayor de edad? " + persona2.esMayorEdad());
    }

}
