public class Persona{
    private String nombre;
    private int edad;
    private String genero;

    public Persona (String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getGenero(){
        return this.genero;
    }

    


}