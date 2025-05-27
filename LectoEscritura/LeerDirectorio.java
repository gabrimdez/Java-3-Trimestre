package LectoEscritura;

import java.io.File;

public class LeerDirectorio {

    public static void main(String[] args) {

        File directorio = new File(
                "C:\\Users\\Gabriel\\OneDrive\\Escritorio\\clase\\progra\\3ºTrimestre\\LectoEscritura");

        String[] archivos = directorio.list();
        for (int i = 0; i < archivos.length; i++) {
            System.out.println("Archivo: " + archivos[i]);
        }

        // crear un directorio nuevo en una ruta concreta

        // poblarlo con dos o tres ficheros

        // y por ultimo, listarlos

    }
}
