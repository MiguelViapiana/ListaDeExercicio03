public class Exercicio23 {
    public static void executar(){
        System.out.println("--- Peso Ideal ---");
        PesoIdeal peso = new PesoIdeal();
        peso.sexo = Prompt.lerLinha("Digite o sexo(M-F)");
        peso.altura = Prompt.lerDecimal("Digite a sua altura(0.00)");
        peso.idade = Prompt.lerInteiro("Digite a sua idade: ");
        peso.calcPesoIdeal();
        System.out.printf("Sexo : %s| Altura: %.2f | Idade: %d | Peso ideal: %.1fKg",peso.sexo, peso.altura, peso.idade, peso.pesoIdeal);  
    }

}
