public class Exercicio06 {
    public static void executar(){
        Lucro lucro = new Lucro();
        System.out.println("Digite os dados do produto: ");
        lucro.precoDeCusto = Prompt.lerDecimal("Digite o preço de custo: ");
        lucro.acresimo = Prompt.lerDecimal("Digite o acrésimo desejado encima do preço de custo");
        lucro.calcLucro();
        System.out.printf("O valor final do produto é de: R$ %.2f", lucro.valorFinal);

    }
}
