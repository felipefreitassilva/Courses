algoritmo "AnalisadorStrings"
// =============================================================
// Algoritmo para demonstrar as principais funcoes de manipulacao
// de strings do visualg.
//
// AUTOR: Gustavo Guanabara
// Curso COMPLETO disponivel GRATIS no site www.cursoemvideo.com
// =============================================================
var
  N: Caractere
  C: Inteiro
inicio
   Escreva("Digite seu nome: ")
   Leia(N)
   EscrevaL("Total de letras do seu nome: ", Compr(N))
   EscrevaL("Seu nome em mai�sculas: ", Maiusc(N))
   EscrevaL("Seu nome em min�sculas: ", Minusc(N))
   EscrevaL("A primeira letra do seu nome � ", Copia(N, 1, 1))
   EscrevaL("A �ltima letra do seu nome � ", Copia(Maiusc(N), Compr(N), 1))
   Se Pos ("A", N) = 0 entao
         Escreval ("Seu nome n�o possui a letra 'A'")
     senao
     EscrevaL("Seu nome tem a letra A na posicao ", Pos("A", Maiusc(N)))
   FimSe
   EscrevaL("O c�digo da letra A � ", Asc("A"))
   EscrevaL("A letra de codigo 65 � ", Carac(65))

   Para C <- Compr(N) ate 1 passo -1 faca
        Escreva(Copia(Maiusc(N), C, 1))
   FimPara
fimalgoritmo
