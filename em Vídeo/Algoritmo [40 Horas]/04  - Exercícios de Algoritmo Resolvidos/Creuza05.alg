algoritmo "exercicioCreuza05"
var
   emprestimo, parcelas, juros, total: Real
inicio
      Escreva ("Quanto voc� quer pegar de empr�stimo? ")
      Leia (emprestimo)
      Escreva ("Em quantas vezes posso parcelar? ")
      Leia (parcelas)
      juros <- emprestimo*20/100
      total <- (emprestimo + juros)/parcelas
      Escreva ("Vou pagar ",parcelas," parcelas de R$",total)
fimalgoritmo
