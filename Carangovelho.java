public class Carangovelho {
    public int totalCarrosAte2000 =0;
    public int totalGeral =0;
    public double valor;

    public String continuar;

    public void inserirCarroseDescontos(){
        do{
            System.out.println("Informe o ano do veículo: ");
            int ano = Prompt.lerInteiro();
            double descontos;

            if (ano >=2000) {
                descontos = 0.12;
                totalCarrosAte2000++;
            }else{
                descontos = 0.07;
            }
            System.out.println("Imforme o valor do veículo: ");
            valor = Prompt.lerDecimal();
            double valorFinal = valor -(valor*descontos);

            System.out.printf("\nDesconto: R$ %.2f", (valor * descontos));
            System.out.printf("\nValor a ser pago: R$ %.2f", valorFinal);

            totalGeral++;

            System.out.println("\n\nDeseja continuar calculando os descontos?\n[S] Sim\n[N] Não");
            continuar = Prompt.lerLinha();

        }while(continuar.equals("S") || continuar.equals("s"));

    }
}
