public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    //métodos
    public void receberAum(){
        System.out.println("===AUMENTO===");
        System.out.println("senhor" + this.getNome() + " o senhor recebeu um aumento!!");
    }

    //métodos Acessores
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{\n" +
                "especialidade='" + especialidade + '\'' +
                "\n salario= " + salario +
                '}';
    }
}
