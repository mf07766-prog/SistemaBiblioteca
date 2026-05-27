public class Capitulo {

    private String titulo;
    private int numero;

    // Construtor
    public Capitulo(String titulo, int numero) {
        this.titulo = titulo;
        this.numero = numero;
    }

    // Método para mostrar dados
    public void exibirCapitulo() {
        System.out.println("Capítulo " + numero + ": " + titulo);
    }
}