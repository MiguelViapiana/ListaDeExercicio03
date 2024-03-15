public class Exercicio02 {
    public static void executar(){
        System.out.println("---Consumo médio de combustível---");
        Carro carro = new Carro();
        carro.distanciaTotal = Prompt.lerDecimal("Digite a distãncia total da viagem: ");
        carro.totalDeCombustivel = Prompt.lerDecimal("Digite o total de combustível gasto na viagem: ");
        System.out.printf("O consumo médio foi de: %.2fL", carro.distanciaTotal/carro.totalDeCombustivel);

    }
    
    
}
