algoritmo "ParOuImparProcedimento"
// =============================================================
// Algoritmo para verificar se um valor e par ou impar usando
// rotinas internas.
//
// AUTOR: Gustavo Guanabara
// Curso COMPLETO disponivel GRATIS no site www.cursoemvideo.com
// =============================================================
var
   N: Inteiro
Procedimento ParOuImpar(V: Inteiro)
inicio
      Se (V % 2 = 0) entao
         Escreval ("O n�mero ",V," � par.")
      senao
         Escreval ("O n�mero ",V," � �mpar.")
      FimSe
FimProcedimento
inicio
      Escreva ("Digite um n�mero: ")
      Leia (N)
      ParOuImpar(N)
fimalgoritmo
