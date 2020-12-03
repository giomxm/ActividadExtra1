public class Main{
    public static void main(String []args ) {
        Persona persona = new Persona("Francisco", 18, "Hombre");
        Empleado empleado = new Empleado(05, "Pancho", 5, "Jesus", 25, "Hombre");

        System.out.println(persona.getNombre());;
        empleado.imprimirDatos();
    }
}