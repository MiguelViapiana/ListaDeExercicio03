package br.edu.up.models;

public class Aluno {
    private String nome;
    private Double nota1;
    private double nota2;
    private double nota3; 
    private double notaFinal; 

    public void calcNotafinal(){
        notaFinal = (nota1 + nota2 + nota3)/3;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public String getNome() {
        return nome;
    }
    public double getNotaFinal() {
        return notaFinal;
    }
    
    
}
