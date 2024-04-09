package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio15 {
    public static void executar(){
        System.out.println("--- Concessionária CARANGO ---\n");
        System.out.println("Insira os dados do veículo: ");
        Carango carango = new Carango();
        System.out.println("\nDigite o preço do carro: ");
        carango.setPrecoCarro(Prompt.lerDecimal());

        System.out.println("Qual tipo de combustível o carro usa(alcool, gasolina e diesel): ");
        carango.setCombustivel(Prompt.lerLinha());  
        carango.calcDesconto();
        carango.calcPrecoFinal();
        
        System.out.printf("O total de desconto foi de R$ %.2f\n",carango.getPrecoCarro()* carango.getDesconto());
        System.out.printf("E o valor final é de: R$ %.2f", carango.getPrecoFinal());
    }
}
