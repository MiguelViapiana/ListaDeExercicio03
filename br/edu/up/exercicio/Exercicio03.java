package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio03 {
    public static void executar(){
        Vendedor vendedor = new Vendedor();
        System.out.println("Digite os dados do vendedor: ");
        vendedor.setNome(Prompt.lerLinha("Nome: "));
        vendedor.setSalFix(Prompt.lerDecimal("Salário fixo: "));
        vendedor.setTotalVendas(Prompt.lerInteiro("Total de vendas(em dinheiro): "));
        vendedor.calcSalFinal();

        System.out.printf("Nome: %s\nSalário fixo: %.2f\nSalário final: %.2f", vendedor.getNome(), vendedor.getSalFix(), vendedor.getSalFinal());
    }
}

