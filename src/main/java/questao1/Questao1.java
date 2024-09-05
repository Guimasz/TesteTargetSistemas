package questao1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {

    /*Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
     (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
     ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
     IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;*/




    public static void fibonacci(int numero) {

        int j = 0;
        int i = 1;
        int atual = i;

        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(j);
        lista.add(i);

        while (atual <numero) {
            atual = j + i;
            j = i;
            i = atual;
            lista.add(atual);

        }
        System.out.println("Sequencia Fibonacci "+ lista);
        if (lista.contains(numero)){
            System.out.println("o número " + numero + " pertence à sequência");
        } else {
            System.out.println("O número " + numero + " não pertence á sequência");
        }

    }

}
