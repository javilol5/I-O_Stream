import java.io.*;

public class Metodos {

    //1-2
    public static void copiarFicheiro(String rutaOriginal, String rutaCopia) {

        try {
            FileInputStream entrada = new FileInputStream(rutaOriginal);
            FileOutputStream saida = new FileOutputStream(rutaCopia);

            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                saida.write(byteLeido);
            }

            entrada.close();
            saida.close();

            System.out.println("Ficheiro copiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el ficheiro");
        }
    }

    //1-3
    public static void appendFicheiro(String rutaOriginal, String rutaCopia) {

        try {
            FileInputStream entrada = new FileInputStream(rutaOriginal);
            FileOutputStream saida = new FileOutputStream(rutaCopia, true);

            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                saida.write(byteLeido);
            }

            entrada.close();
            saida.close();

            System.out.println("Ficheiro copiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el ficheiro");
        }
    }

    //2-1
    public static void copiarImagen(String rutaOriginal, String rutaCopia) {

        try {
            FileInputStream entrada = new FileInputStream(rutaOriginal);
            FileOutputStream saida = new FileOutputStream(rutaCopia);

            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                saida.write(byteLeido);
            }

            entrada.close();
            saida.close();

            System.out.println("Imagen copiada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar la imagen.");
        }
    }


    //2-2
    public static void appendImagen(String rutaOriginal, String rutaCopia) {

        try {
            FileInputStream entrada = new FileInputStream(rutaOriginal);
            FileOutputStream saida = new FileOutputStream(rutaCopia,true);

            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                saida.write(byteLeido);
            }

            entrada.close();
            saida.close();

            System.out.println("Imagen copiada correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar la imagen.");
        }
    }

    //2-3

    public static void copiarFicheiroBuffer(String rutaOriginal, String rutaCopia) {

        try {
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream(rutaOriginal));
            BufferedOutputStream saida = new BufferedOutputStream(new FileOutputStream(rutaCopia));

            int byteLeido;

            while ((byteLeido = entrada.read()) != -1) {
                saida.write(byteLeido);
            }

            entrada.close();
            saida.close();

            System.out.println("Ficheiro copiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el ficheiro.");
        }
    }

    //3-1

    public static void grabar3(String rutaFich, String cadea) {


    }

}























