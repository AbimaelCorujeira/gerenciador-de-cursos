package br.com.corujeira;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Abimael Corujeira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Criando mais um aula", 24));

        Aluno a1 = new Aluno("Isa Marcela", 111);
        Aluno a2 = new Aluno("Bruna Gabrielle", 112);
        Aluno a3 = new Aluno("Paulo Silveira", 113);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Quem é o aluno com a matricula 112?");
        Aluno aluno = javaColecoes.buscaMatriculado(112);
        System.out.println("Aluno: " + aluno);
    }
}