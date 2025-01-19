public class Main {
    public static void main(String[] args) {
        //herança de implementação/pobre (somente vai herdar da superclasse)
        /*Visitante v1 = new Visitante();
        v1.setNome("Samuel");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

        //herança para diferença (Aluno tem os atributos herdados de
        // Pessoa e também tem suas especializações)
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Eng de Software");
        a1.setIdade(19);
        a1.setSexo("Masculino");

        Bolsista b1 = new Bolsista();
        b1.setNome("Junior");
        b1.setCurso("ADS");
        b1.setMatricula(121212);
        b1.setBolsa(50.00);
        b1.setSexo("Masculino");

        Professor p1 = new Professor();
        p1.setNome("Vin diesel");
        p1.setEspecialidade("Professor de POO em Java");
        p1.setIdade(38);
        p1.setSalario(3.000);

        Tecnico t1 = new Tecnico();
        t1.setNome("Robson");
        t1.setRegistroProfissional(123321);
        t1.setCurso("ADS");
        t1.setIdade(25);
        t1.praticar();


    }
}