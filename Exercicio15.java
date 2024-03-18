public class Exercicio15 {
    public static void executar(){
        System.out.println("--- Concessionária CARANGO ---");
        Carango carango = new Carango();
        carango.inserirDados();
        System.out.println("Insira os dados do veículo: ");
        System.out.printf("O total de desconto foi de R$ %.2f\n",carango.precoCarro* carango.desconto);
        System.out.printf("E o valor final é de: R$ %.2f", carango.precoFinal);
    }
}
