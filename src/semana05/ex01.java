package semana05;

import java.util.Scanner;

public class ex01{
    public static void main(String[] args) {

        /*Crie um programa em Java que recebe como entrada o comprimento, altura e a largura de um aquário e calcule as seguintes informações.

        O volume do aquário em litros;
        A potência do termostato necessária para manter a temperatura adequada dentro do aquário;
        A quantidade em litros de filtragem por hora necessária para manter a qualidade da água.

        Volume é dado por (comprimento * altura * largura) / 1000
        A potência do termostato depende do tamanho do aquário e da temperatura ambiente. Para o cálculo utilizar a fórmula: potencia = volume * 0,05 * (temperatura desejada - temperatura ambiente)
        A quantidade de filtragem por hora deve ser no mínimo 2 a 3 vezes o volume do aquário. */

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o comprimento do seu aquario em centrimetos");
        double comprimento = sc.nextDouble();
        System.out.println("Entre com a largura do seu aquario em centrimetos");
        double largura = sc.nextDouble();
        System.out.println("Entre com a altura do seu aquario em centrimetros:");
        double altura = sc.nextDouble();

        double volume = (comprimento*altura*largura)/1000;

        System.out.println("O valor do volume de seu aquario em litros e: " + volume);

        System.out.println("Insira a temperatura ambiente do local que o seu aquario está:");
        double temperatura_ambiente = sc.nextDouble();
        System.out.println("Insira a temperatura que voce quer para o aquario:");
        double temperatura_desejada = sc.nextDouble();
        sc.close();

        double potencia = volume*0.05*(temperatura_ambiente-temperatura_desejada);

        System.out.println("A potencia necessaria do termostato para manter a temperatura desejada para o seu aquario é: " + potencia);

    }

}