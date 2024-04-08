package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio04 {
    public static void executar(){
        Dolar dol = new Dolar();
        System.out.println("---Conversão de dólar para real---");
        dol.cotação = Prompt.lerDecimal("Digite a cotação atual do dólar para real: ");
        dol.qtdDol = Prompt.lerDecimal("digite quantos dolares você possui:");
        dol.conversãoDolar();
        System.out.printf("O resultado da conversão é de R$ %.2f\n", dol.valorFinal);
    }
}
