package Asociacion;

public class Municipio {

    private String nombre;
    private int poblacion;
    private double temperaturaMedia;
    private double altitud;

    public Municipio(String nombre, int poblacion, double temperaturaMedia, double altitud) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.temperaturaMedia = temperaturaMedia;
        this.altitud = altitud;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }

    private void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    private void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getAltitud() {
        return altitud;
    }

    private void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public void imprimir() {
        System.out.println("Nombre = " + getNombre());
        System.out.println("Población = " + getPoblacion());
        System.out.println("Temperatura promedio (C) = " + getTemperaturaMedia());
        System.out.println("Altitud (metros) = " + getAltitud());
    }
}
