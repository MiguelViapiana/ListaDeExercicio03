package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio14 {
    public static void executar(){
        System.out.println("--- Lucro e prejuízo ---");
        ProdutoLucroPrej produto = new ProdutoLucroPrej();
        for(int i=0; i<40; i++){
            System.out.printf("Produto %d:\n", i+1);

            System.out.println("Informe o preço de custo: ");
            produto.precoCusto[i] = Prompt.lerDecimal();
            produto.somaPrecoCusto += produto.precoCusto[i];

            System.out.println("informe o preço de venda: ");
            produto.precoVenda[i] = Prompt.lerDecimal();
            produto.somaPrecoVenda += produto.precoVenda[i];

            produto.analisarLucroPrej(i);
            System.out.println(produto.situacao);
        }
        System.out.printf("\nA média dos preços de custo é de:  R$ %.2f\n", produto.somaPrecoCusto/40);
        System.out.printf("A média dos preços de venda é de: R$ %.2f\n", produto.somaPrecoVenda/40);
        
    }
}
