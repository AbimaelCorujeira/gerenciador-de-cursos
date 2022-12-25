package br.com.corujeira;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {

        Collection<String> alunos = new HashSet<>();
        alunos.add("Abimael Corujeira");
        alunos.add("Isa Marcela");
        alunos.add("Nico Steppat");
        alunos.add("Bruna Gabrielle");
        alunos.add("Bla Blo Blu");
        alunos.add("Steve Vai");
        alunos.add("Steve Vai");

        boolean abimaelEstaPresente = alunos.contains("Abimael Corujeira");
        alunos.remove("Bla Blo Blu");
        System.out.println(abimaelEstaPresente);

        System.out.println(alunos.size());

        for ( String aluno : alunos ) {
            System.out.println(aluno);
        }

        System.out.println("--------------");

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);
    }
}
