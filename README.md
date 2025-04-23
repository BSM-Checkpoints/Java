# 🚀 Projeto Checkpoint - **DespesaFamiliar** 

🎓 **Professor:** Gilberto  
👥 **Grupo:** *Felipe Modesto - Moisés Barsoti - Sofia Siqueira*  
📋 **Nota Obtida:** 9,5 / 10,0 🎉  

---

## 💡 **Descrição do Projeto**

Este projeto foi desenvolvido para calcular:
1. **Total de Despesas:** Inclui gastos com luz, água, internet e academia para todos os moradores da residência.
2. **Renda Familiar Líquida:** O valor restante da renda familiar após subtração das despesas totais.

<div align="center">
  <img src="https://github.com/user-attachments/assets/c64497ec-ecda-46dc-86a6-09b43b2a8e85" width="30%">
</div>

🔢 Utilizamos uma classe chamada `DespesaFamiliar` que segue o modelo UML apresentado anteriormente.

---

## 🛠️ **Atributos da Classe**

| **Atributo**                   | **Descrição**                                  |
|--------------------------------|-----------------------------------------------|
| `rendaFamiliar`                | 💰 Total recebido mensalmente pela família.   |
| `numeroDeMoradores`            | 👨‍👩‍👧‍👦 Número de pessoas na residência.      |
| `gastoComLuz`                  | 💡 Valor gasto com energia elétrica mensal.   |
| `gastoComAgua`                 | 🚿 Valor gasto com água mensal.               |
| `gastoComInternet`             | 🌐 Valor gasto com plano de Internet.         |
| `valorMensalidadeDaAcademia`   | 🏋️ Mensalidade da academia por pessoa.        |

---

## 🧮 **Métodos Implementados**

### 🔗 `calcularTotalDeDespesas()`
- **Descrição:** Calcula o total de despesas mensais, considerando que **todos os moradores frequentam a academia**.

### 🔗 `calcularRendaFamiliarLiquida()`
- **Descrição:** Retorna o saldo restante após subtrair todas as despesas da renda familiar.

---

## 🏁 **Orientações para Execução**

1. **🎯 Comentários**: Inclua no topo de cada classe os **nomes e RMs de todos os integrantes** do grupo.
2. **✍️ Entrada de Dados**: Utilize a classe `Scanner` para capturar os seguintes valores:
   - **Renda familiar**, **número de moradores** e os **gastos mensais** (luz, água, internet, academia).
3. **📋 Atribuição**: Transfira os dados capturados para os respectivos atributos da classe.
4. **📊 Exibição**: Apresente os resultados formatados utilizando o método `printf`:
   - Renda familiar total.
   - Total das despesas.
   - Renda familiar líquida (valores exibidos com **3 casas decimais**).

---

## 🎨 **Formato de Saída**

Após a execução, o sistema deve exibir:
- 💰 **Renda Total da Família**
- 📉 **Total de Gastos com Despesas**
- 📈 **Renda Familiar Líquida**  

Exemplo:
```plaintext
Renda Total: R$ 5,000.000  
Total de Despesas: R$ 3,200.000  
Renda Líquida: R$ 1,800.000  
