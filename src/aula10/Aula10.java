package aula10;

public class Aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        p2.setCurso("Informática");
        p3.setSalario(2500.75);
        p4.setSetor("Estoque");
        p3.receberAumento(550.20);
        p4.mudarTrabalho("Dev Júnior");
        p2.cancelarMatricula();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
