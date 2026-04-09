package br.inatel.poo.turmas;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas = new double[3];

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarNotas(double p1, double p2, double p3) {
        this.notas[0] = p1;
        this.notas[1] = p2;
        this.notas[2] = p3;
    }

    public double calculaMedia() {
        double soma = 0;

        for(double nota : notas) {
            soma += nota;
        }

        return soma/3;
    }

    public void mostraInfo() {
        System.out.println("============================");
        System.out.printf("Aluno: %s\n", this.nome);
        System.out.printf("Matricula: %s\n", this.matricula);
        System.out.printf("P1: %f | P2: %f | P3: %f\n", this.notas[0], this.notas[1], this.notas[2]);
        System.out.printf("Media: %s\n", this.calculaMedia());
        System.out.println("============================");
    }
}
