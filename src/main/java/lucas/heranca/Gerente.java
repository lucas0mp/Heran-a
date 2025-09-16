package lucas.heranca;

//@author Lucas Moreira

public class Gerente extends Funcionario {
    // Atributos privados, específicos do Gerente
    private int equipe;
    private double bonus;

    // Construtor padrão
    public Gerente() {
        super();
    }

    // Construtor com parâmetros
    public Gerente(String nome, int idade, String cpf, String cargo, String dataAdmissao, double salario, int equipe, double bonus) {
        // Chama o construtor da classe pai (Funcionario)
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    // Sobrescrevendo o método mostrarDados para incluir informações do gerente
    @Override
    public void mostrarDados() {
        System.out.println("====== DADOS DO GERENTE ======");
        // Chama o método da classe pai (Funcionario) para mostrar os dados de funcionário
        super.mostrarDados();
        // Mostra os dados específicos do gerente
        System.out.println("Nº de pessoas na equipe: " + this.equipe);
        System.out.printf("Bônus mensal: R$ %.2f\n", this.bonus);
    }
    
    // Método para calcular o salário anual somado ao bônus anual
    public double calcularSalarioComBonus() {
        double salarioAnual = super.calcularSalarioAnual();
        double bonusAnual = this.bonus * 12;
        return salarioAnual + bonusAnual;
    }
    
    // Método específico do gerente
    public void gerenciarEquipe() {
        System.out.println("\nO gerente " + this.nome + " está gerenciando sua equipe de " + this.equipe + " pessoas.");
    }
}
