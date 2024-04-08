package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio02 {
    public static void executar(){
        System.out.println("---Consumo médio de combustível---");
        Carro carro = new Carro();
        carro.setDistanciaTotal(Prompt.lerDecimal("Digite a distãncia total da viagem: "));
        carro.setTotalDeCombustivel(Prompt.lerDecimal("Digite o total de combustível gasto na viagem: "));
        carro.calcConsumoMedio();

        System.out.printf("O consumo médio foi de: %.2fL", carro.getConsumoMedio());

    }
    
    
}
