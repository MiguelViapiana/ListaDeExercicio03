package br.edu.up.exercicio;
import br.edu.up.models.*;

public class Exercicio13 {
    public static void executar() {
        System.out.println("--- Alistamento Militar ---");
        AlistamentoMilitar alistamento = new AlistamentoMilitar();
        System.out.println("Quantas pessoas quer inserir no sistema? ");
        alistamento.qtdpessoas = Prompt.lerInteiro();
        alistamento.declararArrays();
        for (int p = 0; p < alistamento.qtdpessoas; p++) {

            System.out.printf("Digite o nome da %d° pessoa: ", (p + 1));
            alistamento.nome[p] = Prompt.lerLinha();

            System.out.printf("Digite o sexo da %d° pessoa (M ou F): ", (p + 1));
            alistamento.sexo[p] = Prompt.lerLinha();
            if (!alistamento.sexo[p].equals("M") && !alistamento.sexo[p].equals("F")) {
                System.out.println("Sexo inválido!! Digite M ou F");
                break;
            }

            System.out.printf("Digite a idade da %d° pessoa: ", (p + 1));
            alistamento.idade[p] = Prompt.lerInteiro();
            alistamento.aptoPelaIdade(p);
            

            System.out.println("Digite se a sua está boa ou ruim \n[1] Boa\n[2] Ruim");
            alistamento.saude[p] = Prompt.lerInteiro();
            alistamento.aptoPelaSaude(p);


            if (alistamento.apto[p] == true) {
                System.out.printf("A pessoa com nome [%s] está apta para sevir!!\n\n", alistamento.nome[p]);
                alistamento.qtdAptas++;
            } else {
                System.out.printf("A pessoa com nome [%s] NÂO está apta para sevir!!\n\n", alistamento.nome[p]);
            }
        }
        System.out.println("A quantidade de pessoas aptas são de: " + alistamento.qtdAptas);
    }
}
