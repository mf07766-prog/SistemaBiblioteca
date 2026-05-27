public class Biblioteca {

    private String nome;

    // Agregação
    private Livro[] livros;

    // Construtor
    public Biblioteca(String nome, Livro[] livros) {
        this.nome = nome;
        this.livros = livros;
    }

    // Método para mostrar dados
    public void exibirBiblioteca() {

        System.out.println("Biblioteca: " + nome);

        System.out.println("\nLista de Livros:");

        for (int i = 0; i < livros.length; i++) {
            livros[i].exibirLivro();
            System.out.println("-----------------------");
        }
    }
}