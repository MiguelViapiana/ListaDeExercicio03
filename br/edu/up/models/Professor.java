package br.edu.up.models;

public class Professor {
    private int nivel;
    private int horas;
    private double salarioFinal;

    public void calcSalarioProfessor() {
        if (nivel == 1) {
            salarioFinal = horas * 12;
        } else if (nivel == 2) {
            salarioFinal = horas * 17;
        } else {
            salarioFinal = horas * 25;
        }
    }
    public void setNivel(int nivel) {
        if (nivel == 1 || nivel == 2 || nivel == 3) {
            this.nivel = nivel;
        } else {
            System.out.println("Nível inválido!!");
            this.nivel = 0;
        }

    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public double getSalarioFinal() {
        return salarioFinal;
    }

}
