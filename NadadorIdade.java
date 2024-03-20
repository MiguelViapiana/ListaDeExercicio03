public class NadadorIdade {
    public int idade;
    public String categoria;

    public void categoriaIdade(){
        System.out.println("Digite a sua idade: ");
        idade = Prompt.lerInteiro();
        if (idade >=5 && idade <=7) {
            categoria = "Infantil A";
        }else if (idade<=10) {
            categoria = "Infantil B";
        }else if (idade <= 13) {
            categoria = "Juvenil A";
        }else if(idade <= 17){
            categoria = "Juvenil B";
        }else if (idade <=25) {
            categoria = "Sênior";
        }else{
            System.out.println("Idade fora da faixa etária!");
        }

        System.out.printf("A categoria do nadador é: %s", categoria);
    }
}
