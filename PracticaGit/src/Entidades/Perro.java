package Entidades;
/*

*/
public class Perro {

    private String nombre;
    private Integer edad;
    private boolean callejero;
    private String raza;
    private double peso;
    private double altura;
    private String colorPelo;

    public Perro() {
    }

    public Perro(String nombre, Integer edad, boolean callejero, String raza, double peso, double altura, String colorPelo) {
        this.nombre = nombre;
        this.edad = edad;
        this.callejero = callejero;
        this.raza = raza;
        this.peso = peso;
        this.altura = altura;
        this.colorPelo = colorPelo;
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

    public boolean isCallejero() {
        return callejero;
    }

    public void setCallejero(boolean callejero) {
        this.callejero = callejero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public String toString() {
        return "\n Perro: " + "\n Nombre: " + nombre + "\n Edad: " + edad + "\n Callejero: " + callejero 
        + "\n Raza: " + raza + "\n Peso: " + peso + "\n Altura:" + altura + "\n Color de pelo: " + colorPelo;
    }
    
    
}
