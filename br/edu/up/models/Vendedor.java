package br.edu.up.models;

public class Vendedor {
    private String nome;
    private double salFix;
    private int totalVendas;
    private double comissao;
    private double salFinal;

    public void calcSalFinal(){
        comissao = totalVendas * 0.15;
        salFinal = salFix + comissao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalFix(double salFix) {
        this.salFix = salFix;
    }

    public void setTotalVendas(int totalVendas) {
        this.totalVendas = totalVendas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalFix() {
        return salFix;
    }

    public double getSalFinal() {
        return salFinal;
    }
    
    
}