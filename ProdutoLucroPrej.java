public class ProdutoLucroPrej {
    public double[] precoCusto = new double[40];
    public double[] precoVenda = new double[40];
    public double somaPrecoCusto=0;
    public double somaPrecoVenda=0;


    public void inserirPrecoProdutos(){
        for(int i=0; i<40; i++){
            System.out.printf("Produto %d:\n", i+1);

            System.out.println("Informe o preço de custo: ");
            precoCusto[i] = Prompt.lerDecimal();
            somaPrecoCusto += precoCusto[i];

            System.out.println("informe o preço de venda: ");
            precoVenda[i] = Prompt.lerDecimal();
            somaPrecoVenda += precoVenda[i];

            if (precoCusto[i] < precoVenda[i]) {
                System.out.println("Houve lucro!!");
            }else if(precoCusto[i] > precoVenda[i]){
                System.out.println("Houve prejuízo!!");
            }else if(precoCusto[i] == precoVenda[i]){
                System.out.println("Houve empate!!");
            }
        }
        System.out.printf("\nA média dos preços de custo é de:  R$ %.2f\n", somaPrecoCusto/40);
        System.out.printf("A média dos preços de venda é de: R$ %.2f\n", somaPrecoVenda/40);
    }
}
