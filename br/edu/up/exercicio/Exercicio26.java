package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio26 {
    public static void executar(){
        System.out.println("--- Seguradoria ---");
        System.out.println("Digite os dados da pessoa: ");
        Seguradoria seguro = new Seguradoria();
        seguro.setNome(Prompt.lerLinha("Digite o seu nome: "));
        seguro.setIdade(Prompt.lerInteiro("Digite a sua idade: "));
        seguro.setGrupoDeRisco(Prompt.lerLinha("Digite o seu grupo de risco(Baixo, Medio, Alto)"));
        seguro.calcSeguro();
        System.out.println("\n---- Dados ----\n");
        System.out.printf("Nome: %s | Idade: %d | Grupo de Risco: %s | Categoria: %d", seguro.getNome(), seguro.getIdade(), seguro.getGrupoDeRisco(), seguro.getCategoria());
    }
}
