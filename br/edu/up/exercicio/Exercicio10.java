package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio10 {
    public static void executar(){
        IdadeVerif idade = new IdadeVerif();
        System.out.println("---Verificador de Idades ---");
        System.out.println("Digite quantas pessoas quer analisar: ");
        idade.setI(Prompt.lerInteiro());
        int[] idades = new int[idade.getI()];

        System.out.println("Digite as idades das pessoas: ");
        for(int p =0; p<idade.getI(); p++){
            System.out.printf("%d° pessoa: ",  (p+1));
            idades[p] = Prompt.lerInteiro();
        }
        idade.verificarIdades(idades);
        
        for(int p =0; p < idade.getI(); p++){
            System.out.printf("A pessoa [%d] é %s\n", p+1, idade.getMaiorMenor(p));
        }
        
        
    }
}
