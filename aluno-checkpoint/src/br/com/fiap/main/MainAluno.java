// Nome: Felipe Kirschner Modesto           RM: 561810
// Nome: Moisés Barsoti Andrade de Oliveira RM: 565049
// Nome: Sofia Siqueira Fontes              RM: 563829

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        // Instanciando o Aluno
        Aluno aluno = new Aluno();

        // auxiliar do JOptionpane
        String auxiliar;

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        try {
            // Atribuindo Valores
            aluno.setNomeCompleto("Sofia Siqueira Fontes");
            aluno.setAnoDeNascimento(2005);
            aluno.setRegistroMatricula(563829);

            // Exibindo os Valores
            System.out.printf("RM: %d\nNome completo: %s \nIdade: %d", aluno.getRegistroMatricula(),aluno.getNomeCompleto(), aluno.calcularIdade(dataAtual));

            // JOptionpane
            auxiliar = JOptionPane.showInputDialog(null, "Insira o RM: ");
            aluno.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog(null, "Insira o nome completo: ");
            aluno.setNomeCompleto(auxiliar);

            auxiliar = JOptionPane.showInputDialog(null, "Insira o ano de nascimento: ");
            aluno.setAnoDeNascimento(Integer.parseInt(auxiliar));

            // Mensagem do JOptionpane
            String mensagemFormatada = String.format("RM: %d \nNome completo: %s \nIdade: %d", aluno.getRegistroMatricula(), aluno.getNomeCompleto(), aluno.calcularIdade(dataAtual));
            JOptionPane.showMessageDialog(null, mensagemFormatada);

        } catch (Exception e) {
            System.out.println("Você não inseriu um dado de forma correta!");
        }
    }
}
