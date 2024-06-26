package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio16 {
    public static void executar() {
        System.out.println("--- Reajuste de Salário ---");
        System.out.println("Digite o salário mínimo: ");
        Salario salario = new Salario();
        salario.setSalarioMinimo(Prompt.lerDecimal());
        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o salário do %d° funcionário: ", (i + 1));
            salario.setSalarioInicial(i, Prompt.lerDecimal());
            salario.ajusteSalario(i);

        }
        System.out.println("\n--- Salário Ajustado ---\n");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Funcionario[%d]: Salario inicial: R$ %.2f  Salario final: R$ %.2f\n", (i + 1),
                    salario.getSalarioInicial(i), salario.getSalarioFinal(i));

        }
    }
}
