package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio22 {
    public static void executar(){
        System.out.println("--- Conta de Luz ---");
        ContaDeLuz contlluz = new ContaDeLuz();
        System.out.println("Tipo de cliente: \n1(Residência)\n2(Comércio)\n3(Indústria)");
        contlluz.tipoDeCliente = Prompt.lerInteiro("Digite o seu tipo de cliente: ");
        contlluz.KWH = Prompt.lerInteiro("Insira quatos KW/H foram gastos ao todo no mês: ");
        contlluz.calcContaDeLuz();
        System.out.printf("A conta de energia ficou no total de: R$ %.2f",contlluz.contaFinal);
    }
}
