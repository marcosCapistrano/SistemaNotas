package br.inatel.poo;

import br.inatel.poo.turmas.Aluno;
import br.inatel.poo.turmas.Turma;

public class Main {
    public static void main(String[] args) {
        Aluno rafael = new Aluno("Rafael", "1095");
        Aluno aline = new Aluno("Aline", "1098");
        Aluno marcos = new Aluno("Marcos", "1198");

        rafael.adicionarNotas(40, 30, 75);
        aline.adicionarNotas(60, 80, 40);
        marcos.adicionarNotas(60, 60, 50);

        Turma turma = new Turma();
        turma.adicionarAluno(rafael);
        turma.adicionarAluno(aline);
        turma.adicionarAluno(marcos);

        turma.listarAlunos();

        Aluno melhorAluno = turma.buscarMelhorAluno();

        System.out.println("============================");
        System.out.println("Melhor aluno:");
        melhorAluno.mostraInfo();
        System.out.println("============================");
    }
}