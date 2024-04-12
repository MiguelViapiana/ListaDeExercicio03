package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio11 {
    public static void executar(){
        System.out.println("--- Lista de nome sexo das pessoas ---");
        System.out.println("Digite o nome e sexo(M ou F) das pessoas: ");
        Pessoa nomeSex = new Pessoa();
        for(int i=0; i <5; i++){
            System.out.printf("Nome da %d° pessoa: ", (i+1));
            nomeSex.setNome(i, Prompt.lerLinha());
            System.out.printf("Sexo da %d° pessoa: ", (i+1));
            nomeSex.setSexo(i, Prompt.lerLinha());
        }
        nomeSex.contarSexos();
        System.out.println("--- Impressão dos dados das pessoas ---");
        for(int i=0; i<5; i++){
            System.out.printf("Nome [%d]: %s\n",(i+1), nomeSex.getNome(i));
            System.out.printf("Sexo [%d]: %s\n\n", (i+1), nomeSex.getSexo(i));
        }
        System.out.printf("Ao todo, tem %d homens e %d mulheres na lista.\n", nomeSex.getQtdM(), nomeSex.getQtdF());
    }
}
