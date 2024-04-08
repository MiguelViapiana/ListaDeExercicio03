package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio06 {
    public static void executar(){
        Lucro lucro = new Lucro();
        System.out.println("Digite os dados do produto: ");
        lucro.setPrecoDeCusto(Prompt.lerDecimal("Digite o preço de custo: "));
        lucro.setAcresimo(Prompt.lerDecimal("Digite o acrésimo desejado encima do preço de custo em porcentagem(%)"));
        lucro.calcLucro();
        System.out.printf("O valor final do produto é de: R$ %.2f", lucro.getValorFinal());

    }
}
