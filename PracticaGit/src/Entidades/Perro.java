package entidades;
/*

*/
public class Perro {

    private String nombre;
    private boolean callejero;
    private Integer peso;
    private Integer edad;
    private String raza;
    private String color;
    private boolean amigable;

    public Perro() {
    }

    public Perro(String nombre, boolean callejero, Integer peso, Integer edad, String raza, String color, boolean amigable) {
        this.nombre = nombre;
        this.callejero = callejero;
        this.peso = peso;
        this.edad = edad;
        this.raza = raza;
        this.color = color;
        this.amigable = amigable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCallejero() {
        return callejero;
    }

    public void setCallejero(boolean callejero) {
        this.callejero = callejero;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

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

    public boolean isAmigable() {
        return amigable;
    }

    public void setAmigable(boolean amigable) {
        this.amigable = amigable;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", callejero=" + callejero + ", peso=" + peso + ", edad=" + edad + ", raza=" + raza + ", color=" + color + ", amigable=" + amigable + '}';
    }
    
    
}
