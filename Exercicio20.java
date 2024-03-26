public class Exercicio20 {
    public static void executar(){
        System.out.println("--- Escola APRENDER ---");
        Professor prof = new Professor();
        prof.nivel = Prompt.lerInteiro("Digite o nível do professor(1-2-3): ");
        prof.horas = Prompt.lerInteiro("Quantas horas o professor trabalha? ");
        prof.calcSalarioProfessor();
        System.out.printf("O profesor ganha: R$ %.2f", prof.salarioFinal);
    }
}
