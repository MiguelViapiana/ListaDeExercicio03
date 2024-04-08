package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio21 {
    public static void executar(){
        System.out.println("--- Categoria de Natação ---");
        NadadorIdade nat = new NadadorIdade();
        System.out.println("Digite a sua idade: ");
        nat.idade = Prompt.lerInteiro();
        nat.categoriaIdade();
        System.out.printf("A categoria do nadador é: %s", nat.categoria);
    }
}
