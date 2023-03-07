package semana03;

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
    }
}
