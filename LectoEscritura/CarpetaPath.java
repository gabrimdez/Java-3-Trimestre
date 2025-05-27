package LectoEscritura;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CarpetaPath {

    public static void main(String[] args) {

        // Mostrar el directorio actual
        String rutaActual = System.getProperty("user.dir");
        System.out.println("Directorio actual: " + rutaActual);

        // Obtener la ruta base del proyecto
        Path rutaBase = Paths.get(rutaActual);

        // 1. Crear el directorio dentro del path existente
        Path nuevoDirectorio = rutaBase.resolve("miDirectorio");

        try {
            if (!Files.exists(nuevoDirectorio)) {
                Files.createDirectory(nuevoDirectorio);
                System.out.println("Directorio creado con éxito en: " + nuevoDirectorio.toAbsolutePath());
            } else {
                System.out.println("El directorio ya existe en: " + nuevoDirectorio.toAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el directorio: " + e.getMessage());
        }

        // 2. Crear un archivo de texto dentro del directorio creado
        Path archivoTexto = nuevoDirectorio.resolve("archivo.txt");
        try {
            if (!Files.exists(archivoTexto)) {
                Files.createFile(archivoTexto);
                System.out.println("Archivo creado con éxito en: " + archivoTexto.toAbsolutePath());
            } else {
                System.out.println("El archivo ya existe en: " + archivoTexto.toAbsolutePath());
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

        // 3. Listar contenido del nuevo directorio
        try {
            System.out.println("Contenido de " + nuevoDirectorio.toAbsolutePath() + ":");
            Files.list(nuevoDirectorio).forEach(ruta -> System.out.println(" - " + ruta.getFileName()));
        } catch (IOException e) {
            System.out.println("Error al listar el contenido del directorio: " + e.getMessage());
        }

        System.out.println("Dime el contenido de mis paquetes que estan dentro de mi proyecto");
        Path base = Paths.get("C:\\Users\\Gabriel\\OneDrive\\Escritorio\\clase\\progra\\3ºTrimestre\\LectoEscritura");
        System.out.println("Contenido de " + base.toAbsolutePath() + ":");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(base)) {
            for (Path ruta : stream) {
                System.out.println(" - " + ruta.getFileName());
            }
        } catch (IOException e) {
            System.out.println("Error al listar el contenido del directorio: " + e.getMessage());
        }
    }
}
