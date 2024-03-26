public class Exercicio12 {
    public static void executar(){
        System.out.println("--- Carango Velho---");
        Carangovelho carango = new Carangovelho();
        do{
            System.out.println("Informe o ano do veículo: ");
            carango.ano = Prompt.lerInteiro();

            System.out.println("Imforme o valor do veículo: ");
            carango.valor = Prompt.lerDecimal();

            carango.gerarDesconto();
            System.out.printf("\nDesconto: R$ %.2f", (carango.descontos));

            carango.gerarValorFinal();
            System.out.printf("\nValor a ser pago: R$ %.2f", carango.valorFinal);

            System.out.println("\n\nDeseja continuar calculando os descontos?\n[S] Sim\n[N] Não");
            carango.continuar = Prompt.lerLinha();

        }while(carango.continuar.equals("S") || carango.continuar.equals("s"));

        System.out.println("Total de carros até 2000: "+ carango.totalCarrosAte2000);
        System.out.println("Total geral de carros: "+ carango.totalGeral);

    }
}
