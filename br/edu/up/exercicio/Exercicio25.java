package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio25 {
    public static void executar() {
        System.out.println("--- Classificação das Notas ---");
        System.out.println("Digite os dados do aluno: ");
        ClassificacaoNota classNota = new ClassificacaoNota();
        classNota.setNome(Prompt.lerLinha("Digite o nome do aluno: "));
        classNota.setMatricula(Prompt.lerInteiro("Digie o número da matrícula"));
        classNota.setLab(Prompt.lerDecimal("Digite a nota do Laborátorio: "));
        classNota.setAvsem(Prompt.lerDecimal("Digite a nota da Avaliação Semestral: "));
        classNota.setExamfinal(Prompt.lerDecimal("Digite a nota do Exame Final: "));
        classNota.calcMediaClassificacao();
        System.out.printf("Nome: %s | Matrícula: %d | Nota Final: %.1f | Classificação: %s\n",classNota.getNome(), classNota.getMatricula(), classNota.getMedia(), classNota.getClassificaçao());
    }
}
