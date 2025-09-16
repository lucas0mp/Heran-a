package lucas.heranca;

//@author Lucas Moreira

public class Funcionario extends Pessoa {
    // Atributos protegidos
    protected String cargo;
    protected String dataAdmissao;
    protected double salario;

    // Construtor padrão
    public Funcionario() {
        // Chama o construtor da classe pai (Pessoa)
        super();
    }

    // Construtor com parâmetros
    public Funcionario(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario) {
        // Chama o construtor da classe pai para inicializar os atributos herdados
        super(nome, idade, cpf);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    // Sobrescrevendo o método mostrarDados para incluir informações do funcionário
    @Override
    public void mostrarDados() {
        System.out.println("--- Dados do Funcionário ---");
        // Chama o método da classe pai para mostrar os dados básicos
        super.mostrarDados();
        // Mostra os dados específicos do funcionário
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Data de Admissão: " + this.dataAdmissao);
        System.out.printf("Salário: R$ %.2f\n", this.salario);
    }

    // Método para calcular o salário anual
    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    // Método para aplicar um aumento no salário (com base em uma porcentagem)
    public void receberAumento(double porcentagem) {
        double aumento = this.salario * (porcentagem / 100);
        this.salario += aumento;
        System.out.printf("\nAumento de %.2f%% aplicado! Novo salário: R$ %.2f\n", porcentagem, this.salario);
    }
}
