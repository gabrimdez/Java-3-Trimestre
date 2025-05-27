package sw2;

import java.util.ArrayList;

public class Notas {

    private ArrayList<Double> listaNotas;

    public Notas() {
        listaNotas = new ArrayList<>();
    }

    public double calcularPromedio() {
        if (listaNotas.isEmpty()) return 0;
        double suma = 0;
        for (double nota : listaNotas) {
            suma += nota;
        }
        return suma / listaNotas.size();
    }

    public double calcularDesviacion() {
        if (listaNotas.isEmpty()) return 0;
        double prom = calcularPromedio();
        double suma = 0;
        for (double nota : listaNotas) {
            suma += Math.pow(nota - prom, 2);
        }
        return Math.sqrt(suma / listaNotas.size());
    }

    public double calcularMenor() {
        if (listaNotas.isEmpty()) return 0;
        double menor = listaNotas.get(0);
        for (double nota : listaNotas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public double calcularMayor() {
        if (listaNotas.isEmpty()) return 0;
        double mayor = listaNotas.get(0);
        for (double nota : listaNotas) {
            if (nota > mayor) {
                mayor = nota;
            }
        }
        return mayor;
    }

    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
}
