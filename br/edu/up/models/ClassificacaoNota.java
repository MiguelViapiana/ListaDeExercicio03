package br.edu.up.models;

public class ClassificacaoNota {
    private String nome;
    private int matricula;
    private String classificaçao;
    private double lab;
    private double avsem;
    private double examfinal;
    private double media;

    public void calcMediaClassificacao() {

        if (lab < 0 || lab > 10 || avsem < 0 || avsem > 10 || examfinal < 0 || examfinal > 10) {
            System.out.println("Nota inválida!!");
        } else {
            media = ((lab * 2) + (avsem * 3) + (examfinal * 5)) / 10;
            if (media <= 5) {
                classificaçao = "R";
            } else if (media <= 6) {
                classificaçao = "D";
            } else if (media <= 7) {
                classificaçao = "C";
            } else if (media <= 8) {
                classificaçao = "B";
            } else {
                classificaçao = "A";
            }
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setLab(double lab) {
        this.lab = lab;
    }

    public void setAvsem(double avsem) {
        this.avsem = avsem;
    }

    public void setExamfinal(double examfinal) {
        this.examfinal = examfinal;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getClassificaçao() {
        return classificaçao;
    }

    public double getMedia() {
        return media;
    }
    
}
