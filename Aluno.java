public class Aluno {
    public String nome;
    public Double nota1;
    public double nota2;
    public double nota3; 
    public double notaFinal; 

    public void calcNotafinal(){
        notaFinal = (nota1 + nota2 + nota3)/3;
    }
}
