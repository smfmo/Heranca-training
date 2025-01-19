public class Bolsista extends Aluno{
    private double bolsa;


    public void renovarBolsa(){
        System.out.println("===RENOVAÇÃO DA BOLSA===");
        System.out.println(this.getNome() + " está renovando sua bolsa!!");
    }

    @Override
    public void pagarMensal(){
        System.out.println(this.getNome() + " é bolsista, Pagamento facilitado.");
    }

    //métodos acessores
    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
