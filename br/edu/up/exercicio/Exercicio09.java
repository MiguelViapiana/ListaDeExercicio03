package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio09 {
    public static void executar(){
        
        VerificarNum verifnum = new VerificarNum();
        System.out.println("Digite 80 números quisquer: ");
        for(int i =0; i< 80; i++){
            System.out.printf("Digite o %d° número: ", (i+1));
            verifnum.setNum(i, Prompt.lerDecimal());
        }
        verifnum.analisarNums();

        System.out.println("Os números que estão no intervalo entre 10 e 150 são: ");
        for(int i =0; i < verifnum.getP(); i++){
            System.out.print(verifnum.getNumIntervalo(i)+"  " );
        }
    }
}
