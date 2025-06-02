package Inmobiliaria;

public class ApartamentoFamiliar extends Apartamento{

    protected int valorAdmin;

    public ApartamentoFamiliar(int idInmo, int area, String direccion, int numeroDeBaños, int numeroHabitaciones, int valorAdmin) {
        super(idInmo, area, direccion, numeroDeBaños, numeroHabitaciones);
        this.valorAdmin = valorAdmin;

    }

    @Override
    void calcularPrecioVenta() {
        this.precioVenta = area * valorUnitario.get("Apartamento familiar");
    }
}
