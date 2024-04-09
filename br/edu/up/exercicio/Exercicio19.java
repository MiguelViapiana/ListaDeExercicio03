package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio19 {
    public static void executar(){
        System.out.println("--- Triângulo ---");
        Triangulo trian = new Triangulo();
        System.out.println("Digite os lados do triângulo: ");
        trian.setLado1(Prompt.lerInteiro("Digite o primeiro lado: "));
        trian.setLado2(Prompt.lerInteiro("Digite o segundo lado: "));
        trian.setLado3(Prompt.lerInteiro("Digite o terceiro lado: "));
        trian.verificarLados();
        System.out.println(trian.getTipoTriangulo());

    }
}
