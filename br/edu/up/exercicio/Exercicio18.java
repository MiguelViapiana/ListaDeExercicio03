package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio18 {
    public static void executar(){
        System.out.println("--- Calculo de Abono salarial ---");
        Abono abono = new Abono();
        abono.setNome(Prompt.lerLinha("Digite o seu nome: "));
        abono.setSexo(Prompt.lerLinha("Digite o sexo (M ou F)"));
        if(!abono.getSexo().equals("M") && !abono.getSexo().equals("F")){
            System.out.println("Sexo inválido!!");
        }
        abono.setIdade(Prompt.lerInteiro("Digite a sua idade: "));
        abono.setSalarioFixo(Prompt.lerDecimal("Digite o salário fixo: "));
        abono.calcAbono();
        System.out.println("\n---- Dados ----\n");
        System.out.printf("Nome: %s\nIdade: %d\nSexo: %s\nSalario Fixo: R$ %.2f\nSalario Liquido: R$ %.2f\n",abono.getNome(), abono.getIdade(), abono.getSexo(), abono.getSalarioFixo(), abono.getSalarioLiquido());
    }
}
