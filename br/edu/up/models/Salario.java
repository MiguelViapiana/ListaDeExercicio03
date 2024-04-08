package br.edu.up.models;

public class Salario {
    public double[] salarioInicial = new double[584];
    public double[] salarioFinal = new double[584];
    public double salarioMinimo;

    public void ajusteSalario(int i){
    
        double tresSalariosMin = salarioMinimo * 3;
        double dezSalariosMin = salarioMinimo * 10;
        double vinteSalariosMin = salarioMinimo * 20;

        if(salarioInicial[i] < tresSalariosMin){
            salarioFinal[i] = salarioInicial[i] * 1.50;

        }else if (salarioInicial[i] <= dezSalariosMin){
            salarioFinal[i] = salarioInicial[i] * 1.20;

        }else if(salarioInicial[i] < vinteSalariosMin && salarioInicial[i] > dezSalariosMin){
            salarioFinal[i] = salarioInicial[i] * 1.15;

        }else{
            salarioFinal[i] = salarioInicial[i] * 1.10;
        }
        
        }

    }

