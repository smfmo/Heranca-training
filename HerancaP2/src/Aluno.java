public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //métodos
    public void pagarMensal(){
        System.out.println("===PAGAMENTO DA MENSALIDADE===");
        System.out.println(this.getNome() + " está pagando a mensalidade!");
    }

    //métodos acessores
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
