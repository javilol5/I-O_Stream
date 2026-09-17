public class Main {

    public static void main(String[] args) {

        Metodos.copiarFicheiro("src/texto1.txt", "src/texto2.txt");

        Metodos.appendFicheiro("src/texto1.txt","src/texto2.txt");

        Metodos.copiarImagen("src/java.png","src/java2.png");

        Metodos.appendImagen("src/java.png","src/java2.png");

        Metodos.copiarFicheiroBuffer("src/java.png","src/java.png");
    }
}