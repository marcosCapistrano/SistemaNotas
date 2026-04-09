package br.inatel.poo.turmas;

public class Turma {
    private Aluno [] alunos = new Aluno[10];
    private int quantidadeAlunos = 0;

    public void adicionarAluno(Aluno aluno) {
        if(quantidadeAlunos < 10) { // maximo de alunos é 10
            this.alunos[quantidadeAlunos] = aluno;
            quantidadeAlunos++;
        } else {
            System.out.println("Limite maximo de alunos na turma atingido!");
        }
    }

    public void listarAlunos() {
        for(Aluno aluno : this.alunos) {
            if(aluno != null) {
                aluno.mostraInfo();
            }
        }
    }

    public Aluno buscarMelhorAluno() {
        Aluno melhorAluno = null;

        for(Aluno aluno : this.alunos) {
            if(aluno != null) {
                if(melhorAluno != null) {
                    if(aluno.calculaMedia() > melhorAluno.calculaMedia()) {
                        melhorAluno = aluno;
                    }
                } else {
                    melhorAluno = aluno;
                }
            }
        }
        return melhorAluno;
    }
}
