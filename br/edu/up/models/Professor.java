package br.edu.up.models;

public class Professor {
    public int nivel;
    public int horas;
    public double salarioFinal;

    public void calcSalarioProfessor(){
        if (nivel == 1 || nivel == 2 || nivel == 3) {
            if (nivel == 1) {
                salarioFinal = horas * 12;
            }else if(nivel ==2){
                salarioFinal = horas * 17;
            }else{
                salarioFinal = horas * 25;
            }
        }else{
           System.out.println("Nível inválido!!"); 
        }
        
    }
}
