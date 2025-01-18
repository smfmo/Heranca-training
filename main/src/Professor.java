public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private double salario;

    //métodos
    public void receberAum(){
        if (getSalario() == 3000) {
            setSalario(salario + 2000);
            System.out.println("senhor(a) " + getNome() + ", você obteve um aumento de 2.000,00R$");
        } else if (getSalario() <= 2000) {
            setSalario(salario + 1500);
            System.out.println("Senhor(a) " + getNome() + ", você obteve um aumento de 1.500,00R$");
        } else if (getSalario() > 3000) {
            System.out.println("Senhor(a) " + getNome() +  ", sua bonificação será no próximo semestre!");
        }
    }

    //métodos especiais
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
