
package entidades;

/**
 *
 * @author Vanesa Fornés
 */
public class Caballo {
    //atributos
    String nombre;
    String raza;
    int tamano;
    int peso;
    String sexo;

    public Caballo() {
    }

    public Caballo(String nombre, String raza, int tamano, int peso, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Caballo{" + "nombre=" + nombre + ", raza=" + raza + ", tamano=" + tamano + ", peso=" + peso + ", sexo=" + sexo + '}';
    }
    
    
}
