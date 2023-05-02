package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main(String[] args){
       // Comentario de uma linha

       /*
        * Comentario de varias linhas
        */

        // Tipos primitivos
        // Inteiros
        //byte, short, int, long

        byte n1 = 100; // 1 byte - -128 a 127
        short n2 = 3000; // 2 bytes - -32768 a 32767
        int n3 = 321312321; // 4 bytes - 2 bilhoes
        long n4 = 3232323232L; // 8 bytes

        // ponto flutuante
        float nota1 = 10.34343f; // 4 bytes
        double nota2 = 10.3434343; // 8 bytes

        // char
        char letra = 'A';

        // boolean
        boolean ligado = true;
        boolean teste = false;

        // String
        String nome = "Joao da Silva";
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());

        //variaveis e constantes
        int idade = 20;
        int idade2;
        idade2 = 30;

        // Java 10 - inferencia de tipo com var
        var idade3 = 15;
        var nome2 = "Maria";

        // Constante - keyword final

        final double TESTE = 20.2;
        final double PI = 3.13;

        // entrada e saida de dados

        // entrada - classe scanner
        // saida - system.out 

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("Entre com a sua idade");
        int idadeInformada = sc.nextInt();

        System.out.println(nomeInformado + " " + idadeInformada);
        System.out.println("%s %d \n", nomeInformado, idadeInformada);

        sc.close();
    }
}
