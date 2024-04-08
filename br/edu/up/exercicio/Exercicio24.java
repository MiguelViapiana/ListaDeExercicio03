package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio24 {
    public static void executar(){
        System.out.println("--- Média Ponderada ---");
        CursoCienciaComputacao curso = new CursoCienciaComputacao();
        System.out.println("Digite as notas para calcular a média ponderada: ");
        curso.lab = Prompt.lerDecimal("Digite a nota do Laborátorio: ");
        curso.avsem = Prompt.lerDecimal("Digite a nota da Avaliação Semestral: ");
        curso.examfinal = Prompt.lerDecimal("Digite a nota do Exame Final: ");
        curso.calcMediaPonderada();
        System.out.printf("A média das notas foi de: %.1f", curso.media); 
    }
}
