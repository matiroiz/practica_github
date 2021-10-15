package entidades;

public class Caballo {
    
    //Atributos
    private String raza;
    private String color;
    private int edad;
    private String nombre;
    private boolean sexo;
    private String nombreDuenio;

    //Constructor vacío (por defecto)
    public Caballo() {
    }

    //Constructor parametrizado
    public Caballo(String raza, String color, int edad, String nombre, boolean sexo, String nombreDuenio) {
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.nombreDuenio = nombreDuenio;
    }

    //Getters y Setters
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getNombreDuenio() {
        return nombreDuenio;
    }

    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }    
    
}