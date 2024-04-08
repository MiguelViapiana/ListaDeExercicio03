package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio05 {
    public static void executar(){
        Prestacao prest = new Prestacao();
        System.out.println("Digite o valor final de sua compra: ");
        prest.valorFinalCompra = Prompt.lerDecimal();
        prest.valorPrestação();
        System.out.printf("O valor final foi divido em 5 prestações de R$ %.2f", prest.prestação);
    }
}
