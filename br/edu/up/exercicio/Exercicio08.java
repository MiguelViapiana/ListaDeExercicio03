package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio08 {
    public static void executar(){
        TesteDeAprovacao aprov = new  TesteDeAprovacao();
        System.out.println("Digite o nome: ");
        aprov.setNome(Prompt.lerLinha());
        System.out.println("digte 3 notas: ");
        aprov.setNota1( Prompt.lerDecimal());
        aprov.setNota2(Prompt.lerDecimal());
        aprov.setNota3( Prompt.lerDecimal());
        aprov.calcMedia();
        System.out.println("Nome: "+ aprov.getNome());
        System.out.println(aprov.getSituacao());
    }
}
