package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio12 {
    public static void executar(){
        System.out.println("--- Carango Velho---");
        Carangovelho carango = new Carangovelho();
        do{
            System.out.println("Informe o ano do veículo: ");
            carango.setAno(Prompt.lerInteiro());

            System.out.println("Imforme o valor do veículo: ");
            carango.setValor(Prompt.lerDecimal());

            carango.gerarDesconto();
            System.out.printf("\nDesconto: R$ %.2f", (carango.getDescontos()));

            carango.gerarValorFinal();
            System.out.printf("\nValor a ser pago: R$ %.2f", carango.getValorFinal());

            System.out.println("\n\nDeseja continuar calculando os descontos?\n[S] Sim\n[N] Não");
            carango.setContinuar( Prompt.lerLinha());

        }while(carango.getContinuar().equals("S") || carango.getContinuar().equals("s"));

        System.out.println("Total de carros até 2000: "+ carango.getTotalCarrosAte2000());
        System.out.println("Total geral de carros: "+ carango.getTotalGeral());

    }
}
