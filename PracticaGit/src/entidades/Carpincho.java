package entidades;

import java.util.ArrayList;

/**
 *
 * @author Agus
 */
public class Carpincho {
    
    //atributos
    String nombre;
    Integer tamano,peso;
    Boolean amigable,tomaMate;
    
    //array flashero
    ArrayList <Carpincho>mafiaDeCarpinchos = new ArrayList(999999);
    
    //constructores
    public Carpincho(String nombre, Integer tamano, Integer peso, Boolean amigable, Boolean tomaMate) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.peso = peso;
        this.amigable = amigable;
        this.tomaMate = tomaMate;
    }

    public Carpincho() {
    }
    
    //getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Boolean getAmigable() {
        return amigable;
    }

    public void setAmigable(Boolean amigable) {
        this.amigable = amigable;
    }

    public Boolean getTomaMate() {
        return tomaMate;
    }

    public void setTomaMate(Boolean tomaMate) {
        this.tomaMate = tomaMate;
    }

    public ArrayList<Carpincho> getMafiaDeCarpinchos() {
        return mafiaDeCarpinchos;
    }

    public void setMafiaDeCarpinchos(ArrayList<Carpincho> mafiaDeCarpinchos) {
        this.mafiaDeCarpinchos = mafiaDeCarpinchos;
    }
    
    //toString method
    @Override
    public String toString() {
        return "Carpincho{" + "nombre=" + nombre + ", tamano=" + tamano + ", peso=" + peso + ", amigable=" + amigable + ", tomaMate=" + tomaMate + ", mafiaDeCarpinchos=" + mafiaDeCarpinchos + '}';
    }
    
    
    
}
