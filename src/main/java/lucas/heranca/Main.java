package lucas.heranca;

// @author Lucas Moreira

public class Main {
    public static void main(String[] args) {
        
        System.out.println("--------------------------------------");
        System.out.println("CRIANDO UM OBJETO FUNCIONÁRIO");
        System.out.println("--------------------------------------");
        
        Funcionario func1 = new Funcionario("Carlos Santana", 35, "111.222.333-44", "Desenvolvedor Pleno", "10/03/2021", 5500.00);
        
        // Mostrando dados iniciais
        func1.mostrarDados();
        
        // Usando métodos de Funcionario
        System.out.printf("Salário Anual do Funcionário: R$ %.2f\n", func1.calcularSalarioAnual());
        func1.receberAumento(10); // Aumento de 10%
        
        System.out.println("\n======================================\n");

        System.out.println("--------------------------------------");
        System.out.println("CRIANDO UM OBJETO GERENTE");
        System.out.println("--------------------------------------");

        Gerente gerente1 = new Gerente("Ana Oliveira", 42, "999.888.777-66", "Gerente de Projetos", "22/07/2018", 12000.00, 8, 1500.00);

        // Mostrando dados do gerente (note que o método foi sobrescrito)
        gerente1.mostrarDados();
        
        // Usando métodos de Gerente e métodos herdados
        System.out.printf("\nSalário Anual do Gerente (com bônus): R$ %.2f\n", gerente1.calcularSalarioComBonus());
        gerente1.receberAumento(5); // Aumento de 5% herdado de Funcionario
        gerente1.gerenciarEquipe(); // Método específico de Gerente
    }
}
