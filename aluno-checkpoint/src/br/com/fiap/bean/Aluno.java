// Nome: Felipe Kirschner Modesto           RM: 561810
// Nome: Moisés Barsoti Andrade de Oliveira RM: 565049
// Nome: Sofia Siqueira Fontes              RM: 563829

package br.com.fiap.bean;

import java.time.LocalDate;

public class Aluno {
    // Atributos
    private String nomeCompleto;
    private int registroMatricula;
    private int anoDeNascimento;

    // Construtores
    public Aluno() {
    }

    public Aluno(String nomeCompleto, int anoDeNascimento , int registroMatricula) {
        this.nomeCompleto = nomeCompleto;
        setAnoDeNascimento(anoDeNascimento);
        setRegistroMatricula(registroMatricula);
    }


    // Métodos get/set

    // registroMatricula
    public int getRegistroMatricula() {
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula) {
        try {
            if (registroMatricula >= 80000 && registroMatricula <= 599999) {
                this.registroMatricula = registroMatricula;
            } else {
                throw new Exception("Para retornar verdadeiro tem que ser maior ou igual a 80000 e menor ou igual a 599999");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    // nomeCompleto
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    // anoDeNascimento
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    public void setAnoDeNascimento(int anoDeNascimento) {
        try {
            LocalDate dataAtual = LocalDate.now();
            int anoAtual = dataAtual.getYear();
            if (anoDeNascimento >= 1945 && anoDeNascimento <= anoAtual) {
                this.anoDeNascimento = anoDeNascimento;
            } else {
                throw new Exception("O ano deve ser maior ou igual a 1945 e menor ou igual ao ano atual");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // Metodos da Classe

    public int calcularIdade(LocalDate dataAtual) {
         return dataAtual.getYear() - anoDeNascimento;
    }
}
