public class Main {
    public static void main(String[] args) {
        Pessoa p0 = new Pessoa();
        Aluno p1 = new Aluno();
        Professor p2 = new Professor();
        Funcionario p3 = new Funcionario();

        p0.setNome("maria clara");
        p1.setNome("Samuel");
        p2.setNome("Raimundo");
        p3.setNome("suzy");

        p1.setSexo("Masculino");
        p3.setSexo("Feminino");
        p0.setIdade(18);
        p1.setCurso("Engenharia de Software");
        p2.setSalario(2500.75);

        System.out.println(p0.toString());
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}