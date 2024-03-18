public class Exercicio12 {
    public static void executar(){
        System.out.println("--- Carango Velho---");
        Carangovelho carangovelho = new Carangovelho();
        carangovelho.inserirCarroseDescontos();
        System.out.println("Total de carros até 2000: "+ carangovelho.totalCarrosAte2000);
        System.out.println("Total geral de carros: "+ carangovelho.totalGeral);

    }
}
