algoritmo "CalculoIdade"
// =============================================================
// Algoritmo para verificar se uma pessoa ja atingiu a maioridade
//
// AUTOR: Gustavo Guanabara
// Curso COMPLETO disponivel GRATIS no site www.cursoemvideo.com
// =============================================================
var
  ano, nasc, idade: Inteiro
inicio
      Escreva("Em que ano estamos? ")
      Leia(ano)
      Escreva("Em que ano voc� nasceu? ")
      Leia(nasc)
      idade <- ano - nasc
      Escreva ("Em ", ano, " voc� ter� ", idade, " anos")
      Se (idade >= 18) entao
         EscrevaL (" e j� ter� atingido a maioridade. ")
      FimSe
fimalgoritmo
