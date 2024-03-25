public class Exercicio01 {
    public static void executar(){

        Aluno novoAluno = new Aluno();
        System.out.println("Digite os dados do aluno:\n");
        novoAluno.nome = Prompt.lerLinha("Digite o nome do aluno");
        novoAluno.nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        novoAluno.nota2  = Prompt.lerDecimal("Digite a segunda nota: ");
        novoAluno.nota3 = Prompt.lerDecimal("Digite a terceira nota: ");
        novoAluno.calcNotafinal();

        System.out.println("Nome: "+ novoAluno.nome);
        System.out.println("Média: "+ novoAluno.notaFinal);

    }
    

}
