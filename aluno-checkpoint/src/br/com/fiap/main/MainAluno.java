// Nome: Felipe Kirschner Modesto           RM: 561810
// Nome: Moisés Barsoti Andrade de Oliveira RM: 565049
// Nome: Sofia Siqueira Fontes              RM: 563829

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;

public class MainAluno {
    public static void main(String[] args) {
        // Declaramos o Aluno
        Aluno aluno1;
        Aluno aluno2;
        Aluno aluno3;
        Aluno aluno4;

        // auxiliar do JOptionpane
        String auxiliar;

        // Data atual
        LocalDate dataAtual = LocalDate.now();

        try {
            // Aluno 1
            aluno1 = new Aluno("Sofia Siqueira Fontes", 2005, 563829);

            // Exibindo os Valores
            System.out.printf("RM: %d\nNome completo: %s \nIdade: %d", aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdade(dataAtual));

            // Aluno 2
            aluno2 = new Aluno("Felipe Kirschner Modesto", 2007, 561810);

            // Exibindo os Valores
            System.out.printf("\nRM: %d\nNome completo: %s \nIdade: %d\n", aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdade(dataAtual));

            // Aluno 3
            aluno3 = new Aluno();

            // JOptionpane
            auxiliar = JOptionPane.showInputDialog(null, "Insira o RM: ");
            aluno3.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog(null, "Insira o nome completo: ");
            aluno3.setNomeCompleto(auxiliar);

            auxiliar = JOptionPane.showInputDialog(null, "Insira o ano de nascimento: ");
            aluno3.setAnoDeNascimento(Integer.parseInt(auxiliar));

            // Mensagem do JOptionpane
            String mensagemFormatada = String.format("RM: %d \nNome completo: %s \nIdade: %d", aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdade(dataAtual));

            // Exibindo Mensagem
            JOptionPane.showMessageDialog(null, mensagemFormatada);

            // Aluno 4
            aluno4 = new Aluno();

            // JOptionpane
            auxiliar = JOptionPane.showInputDialog(null, "Insira o RM: ");
            aluno4.setRegistroMatricula(Integer.parseInt(auxiliar));

            auxiliar = JOptionPane.showInputDialog(null, "Insira o nome completo: ");
            aluno4.setNomeCompleto(auxiliar);

            auxiliar = JOptionPane.showInputDialog(null, "Insira o ano de nascimento: ");
            aluno4.setAnoDeNascimento(Integer.parseInt(auxiliar));

            // Mensagem do JOptionpane
            String mensagemFormatada2 = String.format("RM: %d \nNome completo: %s \nIdade: %d", aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdade(dataAtual));

            // Exibindo a mensagem
            JOptionPane.showMessageDialog(null, mensagemFormatada2);

        } catch (Exception e) {
            System.out.println("Você não inseriu um dado de forma correta!");
        }
    }
}
