package br.edu.up.models;

public class Vendedor {
    public String nome;
    public double salFix;
    public int totalVendas;
    public double comissao;
    public double salFinal;

    public void calcSalFinal(){
        comissao = totalVendas * 0.15;
        salFinal = salFix + comissao;
    }
    
}