package lucas.heranca;

//@author Lucas Moreira

public class Pessoa {
    // Atributos protegidos para serem acessados pelas classes filhas
    protected String nome;
    protected int idade;
    protected String cpf;

    // Construtor padrão
    public Pessoa() {
    }

    // Construtor com parâmetros para facilitar a criação de objetos
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Método para exibir os dados da pessoa
    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
}
    
