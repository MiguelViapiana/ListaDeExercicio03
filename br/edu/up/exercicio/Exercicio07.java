package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio07 {
    public static void executar(){
        Imposto imp = new Imposto();
        System.out.println("--- Preço Final de produto ---");
        System.out.println("\nDigite o preco de fábrica do carro: ");
        imp.setPrecoDeFabrica(Prompt.lerDecimal());
        imp.calcPrecoFinal();
        System.out.println("O preço com imposto e porcentagem do vendedor é de: "+ imp.getPrecoFinal());
    }
}
