public class Autor {

    private String nome;
    private int idade;

    // Construtor
    public Autor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Método para mostrar dados
    public void exibirAutor() {
        System.out.println("Autor: " + nome);
        System.out.println("Idade: " + idade);
    }
}