public class Aluno extends Pessoa{
    //matricula
    private int matricula;
    private boolean matriculado;
    private String curso;

    //métodos
    public void cancelarMatr(){
        System.out.println("===============================");
        if (matricula > 0) {
            if (this.isMatriculado()) {
                System.out.println("Aluno: " + getNome() +
                        " \n da matrícula: " + getMatricula() +
                        " \n está cancelando sua matrícula....");
            }else {
                System.out.println("Não é possível cancelar uma matrícula inexistente!");
            }
        }
        System.out.println("=================================");
    }

    //métodos acessores
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public boolean isMatriculado(){
        return matricula > 0;
    }
    public void setMatriculado(boolean matriculado){
        this.matriculado = matriculado;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
