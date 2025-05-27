package TourCiclista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Equipo implements Comparable {

    private String nombre;
    private double totalTiempo;
    private String pais;

    ArrayList<Ciclista> listaCiclistas;


    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new ArrayList<Ciclista>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTotalTiempo() {
        return totalTiempo;
    }

    public void setTotalTiempo(double totalTiempo) {
        this.totalTiempo = totalTiempo;
    }

    public ArrayList<Ciclista> getListaCiclistas() {
        return listaCiclistas;
    }

    public void setListaCiclistas(ArrayList<Ciclista> listaCiclistas) {
        this.listaCiclistas = listaCiclistas;
    }

    void anadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }


    public void ordenarTiempoEquipo() {
        Collections.sort(listaCiclistas);
    }


    void listarEquipo() {
        for (Ciclista c : getListaCiclistas()) {
            System.out.println(c);
        }
    }

    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nombre del ciclista: ");
        String nombreCiclista = sc.nextLine();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.get(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println("encontrado ---> ");
                System.out.println(c.getNombre());
            }

        }

        sc.close();

    }

    void calcularTotalTiempo() {
        for (Ciclista c : getListaCiclistas()) {
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", totalTiempo=" + totalTiempo +
                ", pais='" + pais + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Equipo e = (Equipo) o;
        return Double.compare(getTotalTiempo(),e.getTotalTiempo());
    }
    
}
