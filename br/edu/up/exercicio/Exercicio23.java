package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio23 {
    public static void executar(){
        System.out.println("--- Peso Ideal ---");
        PesoCorporal peso = new PesoCorporal();
        peso.setSexo(Prompt.lerLinha("Digite o sexo(M-F)"));
        peso.setAltura(Prompt.lerDecimal("Digite a sua altura(0.00)"));
        peso.setIdade(Prompt.lerInteiro("Digite a sua idade: "));
        peso.calcPesoIdeal();
        System.out.println("\n---- Dados ----\n");
        System.out.printf("Sexo : %s| Altura: %.2f | Idade: %d | Peso ideal: %.1fKg",peso.getSexo(), peso.getAltura(), peso.getIdade(), peso.getPesoIdeal());  
    }

}
