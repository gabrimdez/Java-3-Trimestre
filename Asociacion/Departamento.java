package Asociacion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Departamento {

    String nombre;
    private ArrayList<Municipio> municipios;

    public void inicializarMunicipios() {
        municipios = new ArrayList<>();
        municipios.add(new Municipio("Sanxenxo", 17760, 15.3, 170));
        municipios.add(new Municipio("Pontevedra", 83077, 14.8, 20));
        municipios.add(new Municipio("Caldas de Reis", 9678, 14.4, 80));
        municipios.add(new Municipio("Marín", 24034, 14.5, 10));
        municipios.add(new Municipio("Vigo", 292374, 14.9, 20));
        municipios.add(new Municipio("Vilagarcía de Arousa", 37677, 14.7, 10));
        municipios.add(new Municipio("Poio", 17276, 14.6, 20));
        municipios.add(new Municipio("Ponteareas", 23049, 14.5, 40));
        municipios.add(new Municipio("Redondela", 29055, 14.6, 50));
        municipios.add(new Municipio("O Porriño", 20408, 14.5, 120));
    }

    public Departamento(String nombre, ArrayList<Municipio> municipios) {
        this.nombre = nombre;
        this.municipios = municipios;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public void eliminarMunicipio(String nombre) {
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipios.remove(municipio);
                break;
            }
        }
    }

    public void buscarMunicipio(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (nombre.equals(municipio.getNombre())) {
                municipio.imprimir();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Municipio no encontrado.");
        }
    }

    public void buscarMunicipioConPoblacionMayor(int poblacion) {
        boolean encontroMunicipios = false;
        for (int i = 0; i < municipios.size(); i++) {
            Municipio municipio = municipios.get(i);
            if (municipio.getPoblacion() >= poblacion) {
                System.out.println(municipio.getNombre());
                encontroMunicipios = true;
            }
        }
        if (!encontroMunicipios) {
            System.out.println("No existen municipios con esta población.");
        }
    }

    public void listarPoblacionesConMasPob(int poblacion) {
        List<Municipio> encontrados = municipios.stream()
                .filter(m -> m.getPoblacion() >= poblacion)
                .collect(Collectors.toList());
        if (encontrados.isEmpty()) {
            System.out.println("No existen municipios con mas que esa poblacion");
        } else {
            encontrados.forEach(m -> System.out.println(m.getNombre()));
        }
    }

    public int calcularCensoPoblacionDepartamento() {
        Municipio municipio;
        int totalCenso = 0;
        for (int i = 0; i < municipios.size(); i++) {
            municipio = (Municipio) municipios.get(i);
            totalCenso += municipio.getPoblacion();
        }
        return totalCenso;
    }

    public void listaTodo() {
        Iterator iterator = municipios.iterator();
        while (iterator.hasNext()) {
            Municipio municipio = (Municipio) iterator.next();
            System.out.println("nombre: " + municipio.getNombre() +
                    ", poblacion: " + municipio.getPoblacion() +
                    ", temperatura media: " + municipio.getTemperaturaMedia() +
                    ", altitud: " + municipio.getAltitud());
        }
    }
}