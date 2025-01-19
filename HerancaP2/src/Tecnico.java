public class Tecnico extends Aluno{
    private int registroProfissional;

    //métodos
    public void praticar(){
        System.out.println("Aluno do curso de " + this.getCurso());
        System.out.println(this.getNome() + " está praticando POO, e introduzindo em seu projeto");
    }

    //métodos acessores
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
