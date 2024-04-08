package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio26 {
    public static void executar(){
        System.out.println("--- Seguradoria ---");
        System.out.println("Digite os dados da pessoa: ");
        Seguradoria seguro = new Seguradoria();
        seguro.nome = Prompt.lerLinha("Digite o seu nome: ");
        seguro.idade = Prompt.lerInteiro("Digite a sua idade: ");
        seguro.grupoDeRisco = Prompt.lerLinha("Digite o seu grupo de risco(Baixo, Medio, Alto)");
        seguro.calcSeguro();
        System.out.printf("Nome: %s | Idade: %d | Grupo de Risco: %s | Categoria: %d", seguro.nome, seguro.idade, seguro.grupoDeRisco, seguro.categoria);
    }
}
