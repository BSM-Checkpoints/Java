// Nome: Felipe Kirschner Modesto           RM: 561810
// Nome: Moisés Barsoti Andrade de Oliveira RM: 565049
// Nome: Sofia Siqueira Fontes              RM: 563829

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos o objeto DespesaFamiliar
        DespesaFamiliar despesa = new DespesaFamiliar();
        Scanner scan = new Scanner(System.in);

        try {
            // Renda Familiar
            System.out.println("Digite o valor da renda familiar: ");
            double renda = scan.nextDouble();

            // Quantidade de moradores
            System.out.println("Digite o valor de moradores: ");
            int moradores = scan.nextInt();

            // Conta de luz
            System.out.println("Digite o valor da conta de luz: ");
            double gastoComLuz = scan.nextDouble();

            // Conta de água
            System.out.println("Digite o valor da conta de água: ");
            double gastoComAgua = scan.nextDouble();

            // Conta de internet
            System.out.println("Digite o valor da conta de internet: ");
            double gastoComInternet = scan.nextDouble();

            // Mensalidade da academia
            System.out.println("Digite o valor de mensalidade da academia: ");
            double valorMensalidadeDaAcademia = scan.nextDouble();

            // Enviando valores para os atributos
            despesa.rendaFamiliar = renda;
            despesa.numeroDeMoradores = moradores;
            despesa.gastoComLuz = gastoComLuz;
            despesa.gastoComAgua = gastoComAgua;
            despesa.gastoComInternet = gastoComInternet;
            despesa.valorMensalidadeDaAcademia = valorMensalidadeDaAcademia;

            // Exibindo os resultados
            System.out.printf("\nRenda Familiar Bruta: R$ %.3f\nTotal de Despesas: R$ %.3f \nRenda Familiar Líquida: R$ %.3f\n", despesa.rendaFamiliar, despesa.calcularTotalDeDespesas(), despesa.rendaFamiliarLiquida());
        } catch (Exception e) {
            System.out.println("Digite o valor correto!");
        }
    }
}
