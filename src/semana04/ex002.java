package semana04;

import java.util.Scanner;

public class ex002{
    public static void main(String[] args) {
        /*Ex02 - Escreva um programa em Java que solicita ao usuário três números e apresenta a média aritmética dos números informados. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o primeiro número");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Escreva o segundo número");
        double segundoNumero = sc.nextDouble();
        System.out.println("Escreva o segundo número");
        double terceiroNumero = sc.nextDouble();

        double mediaAritm = (primeiroNumero + segundoNumero + terceiroNumero)/3;
        
        System.out.println("A média aritmética dos tres números é:" + mediaAritm);

    }


}