/**
 * Empleado
 */
public class Empleado {
    private int id;
    private String nombre;
    private int antiguedad;

    public Empleado(int id, String nombre, int antiguedad) {
        this.id = id;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getAntiguedad() {
        return antiguedad;
    }
    
    
}