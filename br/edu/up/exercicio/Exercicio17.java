package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio17 {
    public static void executar(){
        System.out.println("--- Reajuste e listamento dos funcionários ---");
        DadosFuncionario dados = new DadosFuncionario();
        System.out.println("Digite o salário mínimo: ");
        dados.salarioMinimo = Prompt.lerDecimal();

        for(int i =0; i < 8; i++){
            System.out.printf("Digite o nome do %d° funcionário: ", (i+1));
            dados.nome[i] = Prompt.lerLinha();

            System.out.printf("Digite o salário do %d° funcionário: ", (i+1));
            dados.salarioInicial[i] = Prompt.lerDecimal();
            dados.ajusteSalario(i);

        }
        System.out.println("\n--- Salário Ajustado ---\n");
        for(int i=0; i < 8; i++){
            System.out.printf("Funcionario[%d]: Nome: %s | Salario inicial: R$ %.2f | Salario final: R$ %.2f\n\n",(i+1),dados.nome[i], dados.salarioInicial[i], dados.salarioFinal[i]);
        }
        System.out.printf("A empresa vai aumentar R$ %.2f na folha de pagamento!\n"); //dados.totalReajuste);
    }
}
