package LectoEscritura;

import java.io.File;
import java.io.IOException;

public class LeerDirecCreado {

    public static void main(String[] args) {

        String rutaBase = "C:\\Users\\Gabriel\\OneDrive\\Escritorio\\clase\\progra\\3ºTrimestre\\LectoEscritura";

        // 1. Crear un directorio nuevo en una ruta concreta
        File carpeta = new File(rutaBase + "miCarpeta");
        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Directorio creado con éxito en: " + carpeta.getAbsolutePath());
            } else {
                System.out.println("Error al crear el directorio.");
            }
        } else {
            System.out.println("El directorio ya existe en: " + carpeta.getAbsolutePath());
        }

        // 2. Crear un archivo de texto dentro de la carpeta creada
        File fichero = new File(carpeta, "ejemplo.txt");
        try {
            if (fichero.createNewFile()) {
            System.out.println("Archivo creado con éxito en: " + fichero.getAbsolutePath());
            } else {
            System.out.println("El archivo ya existe en: " + fichero.getAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        // 3. Listar los archivos en el directorio creado
        String[] archivos = carpeta.list();
        if (archivos != null && archivos.length > 0) {
            System.out.println("Archivos en el directorio:");
            for (String archivo : archivos) {
            System.out.println(archivo);
            }
        } else {
            System.out.println("El directorio está vacío.");
        }

    }

}
