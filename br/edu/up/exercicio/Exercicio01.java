package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio01 {
    public static void executar(){

        Aluno novoAluno = new Aluno();
        System.out.println("Digite os dados do aluno:\n");
        novoAluno.setNome(Prompt.lerLinha("Digite o nome do aluno")); 
        novoAluno.setNota1(Prompt.lerDecimal("Digite a primeira nota: ")) ;
        novoAluno.setNota2(Prompt.lerDecimal("Digite a segunda nota: "));
        novoAluno.setNota3(Prompt.lerDecimal("Digite a terceira nota: "));
        novoAluno.calcNotafinal();

        System.out.println("Nome: "+ novoAluno.getNome());
        System.out.println("Média: "+ novoAluno.getNotaFinal());

    }
    

}
