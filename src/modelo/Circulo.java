//POJO: Plain Old Java Object  <------------------
package modelo;

public class Circulo {
    
    private String nombre;
    private double radio;

    public Circulo() {
    }

    public Circulo(String nombre, double radio) {
        this.nombre = nombre;
        this.radio = radio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
}
