/* ======================================================================================================================== */
// Desafio 1
// Ordenando Números Pares e Ímpares

/* Crie um programa onde você receberá valores inteiros não negativos como
entrada.

Ordene estes valores de acordo com o seguinte critério:

- Primeiro os Pares
- Depois os Ímpares
- Você deve exibir os pares em ordem crescente e na sequência os ímpares em
ordem decrescente.

- Entrada

A primeira linha de entrada contém um único inteiro positivo N (1 < N < 10000)
Este é o número de linhas de entrada que vem logo a seguir. As próximas N
linhas terão, cada uma delas, um valor inteiro não negativo.

- Saída

Exiba todos os valores lidos na entrada segundo a ordem apresentada acima.
Cada número deve ser impresso em uma linha, conforme exemplo de saída abaixo.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class OrdenandoNumerosParesImpares {
  public static void main(String[] args) throws IOException {

    int N = 500;

    for(int i = 0; i <= N; i++) {
      if(i % 2 == 0) {
        System.out.println(i);
      }
    }
    for(int i = N; i >= 0; i--) {
      if(i % 2 != 0) {
        System.out.println(i);
      }
    }
  }
}

/* ======================================================================================================================== */
// Desafio 2
// Conversão de Tempo

/*
Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
dia/mês/ano horas:minutos:segundos.

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o tempo lido no arquivo de entrada (segundos), convertido para
horas:minutos:segundos, conforme exemplo fornecido.

- Obs

Utilize UTC (GMT-0)

- Exemplo:
    Entrada: 1693225566
    Saída: 28/Aug/2023 12:26:06
*/

import java.util.Scanner;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
  public static void main(String[] args) {
    int valor = 1693225566;
    Date date = new Date(valor*1000L);

    SimpleDateFormat padrao = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
    padrao.setTimeZone(TimeZone.getTimeZone("GMT-3"));
    String dataFormatada = padrao.format(date);

    System.out.println(dataFormatada);

  }
}

/* ======================================================================================================================== */
// Desafio 3
// Sequência de Fibonacci (Recursividade)

/*
A Sequência de Fibonacci tem como primeiros termos os números 0 e 1 e, a seguir,
cada termo subsequente é obtido pela soma dos dois termos predecessores:
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...

Fibonacci(0) = 0
Fibonacci(1) = 1
Fibonacci(n) = Fibonacci(n-1) + Fibonacci(n-2)

- Entrada

O arquivo de entrada contém um valor inteiro N.

- Saída

Imprima o valor relativo ao N número da sequência de Fibonacci, exemplo:

N = 0  => saída "Fib = 0"
N = 1  => saída "Fib = 1"
N = 3  => saída "Fib = 2"
M = 29 => saída "Fib = 514229"

 */

import java.util.Scanner;
import java.io.IOException;


public class Main {
  public static void main(String[] args) {
    int N1 = -1;
    int N2 = 1;
    int N3;
    int N = 29;
    // Esse 29 é o número que aparecia de exemplo na explicação do exercício.

    for (int i = 0; i <= N; i++) {
      N3 = N1 + N2;
      N1 = N2;
      N2 = N3;

      System.out.println("N = " + (i) + " => saida Fib = " + N3);
    }
  }

}
