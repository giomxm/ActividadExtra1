/**
 * Empleado
 */
public class Empleado extends Persona implements Interface{
    private int id;
    private String apodo;
    private int antiguedad;

    public Empleado(int id, String apodo, int antiguedad, String nombre, int edad, String genero) {
        super(nombre, edad, genero);
        this.id = id;
        this.apodo = apodo;
        this.antiguedad = antiguedad;
    }

    public String getApodo() {
        return apodo;
    }

    public int getId() {
        return id;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void imprimirDatos(){
        System.out.println("id" + id + "\nNombre: " + getNombre() + "\nApodo: " + apodo + "\nEdad: " + getEdad() + "\nAntiguedad: " + antiguedad + "\nGenero: " + getGenero());
    }

    public void darBono(int antiguedad){
        if(antiguedad > 0){
            System.out.println("Se gano un bono");
        }
    }

    
    
    
}