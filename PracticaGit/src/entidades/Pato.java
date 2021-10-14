package entidades;

/**
 * Pablo Fernando Martinez
 */
public class Pato {

    private String color;
    private String tamaño;
    private String especie;
    private boolean volador;
    private String nombre;
    private Integer edad;

    public Pato() {

    }

    public Pato(String color, String tamaño, String especie, boolean volador, String nombre, Integer edad){
        this.color=color;
        this.tamaño= tamaño;
        this.especie = especie;
        this.volador = volador;
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean getVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
