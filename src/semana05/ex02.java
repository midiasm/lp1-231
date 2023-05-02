package semana05;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        
    /*Utilizando as diretrizes de Índice de Massa Corporal (IMC) da Organização Mundial de Saúde (OMS), 
    crie uma calculadora em Java que solicita ao usuário seu peso (Kg) e sua altura (m) 
    e apresenta em qual classificação o indivíduo se encaixa. 
    Além disso, o programa deve apresentar quanto o indivíduo precisa perder ou ganhar de peso para chegar no peso normal (imc = 24,9).

    IMC = peso / altura * altura

    Classificação
    ----------------------------------
    IMC           Classificação
    ----------------------------------
    < 18,5         Baixo peso
    18,5 a 24,9     Peso normal
    25,0 a 29,9     Excesso de peso
    30,0 a 34,9     Obesidade de Classe 1
    35,0 a 39,9     Obesidade de Classe 2
    >= 40,00      Obesidade de Classe 3 */

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o seu peso em kg:");
    double peso = sc.nextDouble();
    System.out.println("Digite a sua altura em metros:");
    double altura = sc.nextDouble();

    double IMC = peso/(altura*altura);

    System.out.println("O seu IMC é:" + IMC);

        if (IMC<18.5) {
            System.out.println("Voce está abaixo do peso ideal");
        }

        if (IMC>= 1805 && IMC<=24.9) {
            System.out.println("Voce está no peso ideal");
        }

        if (IMC>=25.0 && IMC<=29.9) {
            System.out.println("Voce está com excesso de peso");
        }

        if (IMC>=30.0 && IMC<=34.9) {
            System.out.println("Voce está classificado como Obesidade de Classe 1");
        }

        if (IMC>=35.0 && IMC<=39.9) {
            System.out.println("Voce está classificado como Obesidade de Classe 2");
        }

        if (IMC>=40.0) {
            System.out.println("Voce está classificado como Obesidade de Classe 3");
        }


    double pesoIdeal = 24.9 * (altura*altura);
    double pesoPerder = peso - pesoIdeal;

    System.out.println("Voce precisa perder, em kg:" + pesoPerder);

    sc.close();

    }
}