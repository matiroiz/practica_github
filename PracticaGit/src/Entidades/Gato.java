
package Entidades;

/**
 *
 * @author josee
 */
public class Gato {
    private Integer edad;
    private String nombre, apodo, color;
    //private Persona dueno;
    private Boolean callejero;

    public Gato() {
    }

    public Gato(Integer edad, String nombre, String apodo, String color, Boolean callejero) {
        this.edad = edad;
        this.nombre = nombre;
        this.apodo = apodo;
        this.color = color;
        this.callejero = callejero;
    }

//    public Gato(Integer edad, String nombre, String apodo, String color, Boolean callejero, Persona dueno) {
//        this.edad = edad;
//        this.nombre = nombre;
//        this.apodo = apodo;
//        this.color = color;
//        this.callejero = callejero;
//        this.dueno = dueno;
//    }
    
    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getColor() {
        return color;
    }

    public Boolean getCallejero() {
        return callejero;
    }
    
//    public Persona getDueno(){
//        return dueno;
//    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCallejero(Boolean callejero) {
        this.callejero = callejero;
    }
    
//    public void serDueño(Persona dueño) {
//        this.dueño = dueño;
//    }

//    @Override
//    public String toString() {
//        return "Gato{" + "Edad= " + edad + ", Nombre= " + nombre + ", Apodo= " + apodo + ", Color= " + color + ", ¿Es callejero? = " + callejero +  ", Dueño= " + dueno + '}';
//    }
    
    @Override
    public String toString() {
        return "Gato{" + "Edad= " + edad + ", Nombre= " + nombre + ", Apodo= " + apodo + ", Color= " + color + ", ¿Es callejero? = " + callejero + '}';
    }
    
    
    
}
