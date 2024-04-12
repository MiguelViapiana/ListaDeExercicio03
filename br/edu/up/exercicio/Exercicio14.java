package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio14 {
    public static void executar(){
        int i=0;
        System.out.println("--- Lucro e prejuízo ---");
        Logistica produto = new Logistica();
        for(i=0; i<40; i++){
            System.out.printf("Produto %d:\n", i+1);

            System.out.println("Informe o preço de custo: ");
            produto.setPrecoCusto(i ,Prompt.lerDecimal());
            produto.setSomaPrecoCusto(produto.getPrecoCusto(i));

            System.out.println("informe o preço de venda: ");
            produto.setPrecoVenda(i, Prompt.lerDecimal());
            produto.setSomaPrecoVenda(produto.getPrecoVenda(i));

            produto.analisarLucroPrej(i);
            System.out.println(produto.getSituacao());
        }
        System.out.printf("\nA média dos preços de custo é de:  R$ %.2f\n", produto.getSomaPrecoCusto()/i);
        System.out.printf("A média dos preços de venda é de: R$ %.2f\n", produto.getSomaPrecoVenda()/i);
        
    }
}
