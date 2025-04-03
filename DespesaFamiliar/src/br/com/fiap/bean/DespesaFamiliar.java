// Nome: Felipe Kirschner Modesto           RM: 561810
// Nome: Moisés Barsoti Andrade de Oliveira RM: 565049
// Nome: Sofia Siqueira Fontes              RM: 563829


package br.com.fiap.bean;

// Objeto - São representações de objetos do mundo real
public class DespesaFamiliar {

    // Atributos - São características do objeto
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    // Métodos - São as ações do objeto

    public double calcularTotalDeDespesas() {
        double despesas =  gastoComLuz + gastoComInternet + gastoComAgua + (valorMensalidadeDaAcademia * numeroDeMoradores);
        return despesas;
    };

    public double rendaFamiliarLiquida() {
        double rendaLiquida =  rendaFamiliar - calcularTotalDeDespesas();
        return rendaLiquida;
    };
}
