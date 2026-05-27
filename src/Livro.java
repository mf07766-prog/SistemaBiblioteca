public class Livro {

    private String titulo;
    private Autor autor;

    // Composição
    private Capitulo[] capitulos;

    // Construtor
    public Livro(String titulo, Autor autor, Capitulo[] capitulos) {
        this.titulo = titulo;
        this.autor = autor;
        this.capitulos = capitulos;
    }

    // Método para mostrar dados
    public void exibirLivro() {

        System.out.println("Livro: " + titulo);

        System.out.println("\nDados do Autor:");
        autor.exibirAutor();

        System.out.println("\nCapítulos:");

        for (int i = 0; i < capitulos.length; i++) {
            capitulos[i].exibirCapitulo();
        }
    }
}