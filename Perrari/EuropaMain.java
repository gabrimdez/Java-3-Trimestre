package Perrari;

public class EuropaMain {

    public static void main(String[] args) {

        Motor motor = new Motor(1200);
        Chasis chasis = new Chasis(tipoChasis.MONOCASCO);
        Carroceria carroceria = new Carroceria(tipoCarroceria.INDEPENDIENTE, "rojo");
        Llanta[] llantas = new Llanta[4];
        for (int i = 0; i < llantas.length; i++) {
            llantas[i] = new Llanta("Pirelli", 18, 55, 225);
        }
        Coche coche = new Coche(motor, chasis, llantas, carroceria);
        coche.imprimir();
    }
}
