
package entidades;


public class Conejo {
    
    private Integer edad;
    private Double peso;
    private String nombre, apodo, color;    
    private Boolean domestico;

    public Conejo() {
    }

    public Conejo(Integer edad, Double peso, String nombre, String apodo, String color, Boolean domestico) {
        this.edad = edad;
        this.peso = peso;
        this.nombre = nombre;
        this.apodo = apodo;
        this.color = color;
        this.domestico = domestico;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getDomestico() {
        return domestico;
    }

    public void setDomestico(Boolean domestico) {
        this.domestico = domestico;
    }

    @Override
    public String toString() {
        return "Conejo{" + "edad=" + edad + ", peso=" + peso + ", nombre=" + nombre + ", apodo=" + apodo + ", color=" + color + ", domestico=" + domestico + '}';
    }
    
    
    
}
