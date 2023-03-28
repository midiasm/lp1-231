package semana04;

import java.util.Scanner;

public class ex004{
    public static void main(String[] args) {

    /*O código identificador de funcionários de uma empresa contém 7 caracteres, 
    inicia com a sequência de caracteres BR, em seguida apresenta um número inteiro entre 0001 e 9999 e finaliza com o
    caractere X. 
    Exemplos válidos:
    BR0001X
    BR1236X
    BR9999X
    Exemplos inválidos:
    br0001X
    BR126X
    BR99999X
    BR9999Y
    Avalie os métodos da classe String e Integer e identifique quais poderiam ser utilizados para validar 
    todos os critérios do código identificador (Não utilizar expressões regulares) 
    (https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html  
    https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Integer.html)
    Crie um programa em Java que solicita ao usuário um identificador e apresenta se o que foi informado é um valor 
    válido ou inválido.  */

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Insira seu código de funcionário: ");

        final String codigo = sc.nextLine();
        
        if (codigo.length() != 7) {
            System.out.println("Este código é inválido");
        } 
        
        else if (codigo.startsWith("BR")||codigo.endsWith("X")) {
            System.out.println("Este código é válido");
        } 
        
        else {
        final int val = Integer.parseInt(codigo, 2, 6, 10);
        
        if (val < 1 || val > 9999) {
            System.out.println("Este código é inválido");
        } 
        
        else {
            System.out.println("Este código é válido");
        }

        }
        
        } catch (Exception ex) {
            System.out.println("Este código é inválido");
        }

        }

        }