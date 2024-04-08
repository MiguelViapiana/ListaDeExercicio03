package br.edu.up.models;

public class VerificarNum {
    private double[] num = new double[80];
    private double[] numIntervalo = new double[80];
    private int i, p;

    public void analisarNums(){
        p =0;
        for(i =0; i <80; i++){
            if (num[i] <= 10 || num[i] >= 150) {
                
            }else{
                numIntervalo[p] = num[i];
                p++;
            }
        }
    }

    public void setNum(double d, double num) {
        this.num[(int) d] = num;
    }

    public double getNumIntervalo(int num) {
        return numIntervalo[num];
    }

    public int getP() {
        return p;
    }
    
    
    
}
