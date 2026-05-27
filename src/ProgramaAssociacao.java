public class ProgramaAssociacao {

    public static void main(String[] args) {

        // Criando autor
        Autor autor1 = new Autor("Machado de Assis", 69);

        // Criando capítulos
        Capitulo cap1 = new Capitulo("Introdução", 1);
        Capitulo cap2 = new Capitulo("Desenvolvimento", 2);
        Capitulo cap3 = new Capitulo("Conclusão", 3);

        // Vetor de capítulos
        Capitulo[] capitulosLivro = {cap1, cap2, cap3};

        // Criando livro
        Livro livro1 = new Livro(
                "Dom Casmurro",
                autor1,
                capitulosLivro
        );

        // Vetor de livros
        Livro[] livrosBiblioteca = {livro1};

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca(
                "Biblioteca Central",
                livrosBiblioteca
        );

        // Exibindo dados
        biblioteca.exibirBiblioteca();
    }
}