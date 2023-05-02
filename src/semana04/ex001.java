package semana04;

import java.util.Scanner;

public class ex001{
    public static void main(String[] args) {
        /*Escreva um programa em Java que solicita ao usuário um número inteiro e apresenta seu antecessor e sucessor. */

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um número inteiro");
        
        int numInteiro = sc.nextInt();
        int sucessor = sc.nextInt();
        int antecessor = sc.nextInt();

        sucessor = numInteiro + 1;
        antecessor = numInteiro - 1;

        System.out.println("O número sucessor é:" + sucessor);
        System.out.println("O número antecessor é:" + antecessor);

        sc.close();

    }

}