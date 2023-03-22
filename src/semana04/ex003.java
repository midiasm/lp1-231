package semana04;

public class ex003{
    public static void main(String[] args) {
     
    /*Ex03 - Crie um programa em Java que recebe como entrada o valor de uma compra e apresenta como saída o valor final com desconto 
    e o desconto aplicado com base nas seguintes regras:

    Compras entre R$ 0,01 e R$ 9,99 - 0% de desconto
    Compras entre R$ 10,00 e R$ 99,99 - 5% de desconto
    Compras entre R$ 100,00 e R$ 499,99 - 10% de desconto
    Compras iguais ou superiores a R$ 500,00 - 15% de desconto */

    Scanner sc = new Scanner(System.in);

    System.out.println("Insira o valor da compra");
    double valorInicial = sc.nextDouble();

    if (valorInicial>= 0.01 && valorInicial<= 9.99) {
        System.out.println("O valor final da compra é: " + valorInicial);
    }
    
    if (valorInicial>= 10.0 && valorInicial<= 99.99) {
        double valorDesc = valorInicial * 0.05;
        double valorFinal = valorInicial - valorDesc;
        System.out.println("O valor da sua compra com o desconto é: " + valorFinal);
    }

    if (valorInicial>= 100.0 && valorInicial<= 499.0) {
        double valorDesc = valorInicial * 0.010;
        double valorFinal = valorInicial - valorDesc;
        System.out.println("O valor final da sua compra, com o desconto, é:" + valorFinal);
    }

    if(valorInicial>= 500.0){
        double valorDesc = valorInicial * 0.015;
        double valorFinal = valorInicial - valorDesc;
        System.out.println("O valor final da sua compra, com o desconto, é:" + valorFinal);
    }

    sc.close();


    }

}