package br.edu.up.models;

public class Curso {
    private double lab;
    private double avsem;
    private double examfinal;
    private double media;

    public void calcMediaPonderada(){
        
        if (lab < 0 || lab >10 || avsem < 0 || avsem >10 || examfinal < 0 || examfinal >10) {
            System.out.println("Nota inválida!!");
        }else{
           media = ((lab * 2) +(avsem * 3)+ (examfinal* 5))/10; 
        }
        
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

    public double getMedia() {
        return media;
    }
    

}
