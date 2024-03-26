public class Abono {
    public String nome;
    public String sexo;
    public int idade;
    public double salarioFixo;
    public double salarioLiquido;

    public void calcAbono() {
        if (sexo.equals("M")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 100;
            } else {
                salarioLiquido = salarioFixo + 50;
            }
        }
        if (sexo.equals("F")) {
            if (idade >= 30) {
                salarioLiquido = salarioFixo + 200;
            } else {
                salarioLiquido = salarioFixo + 80;
            }
        }
    }
}
