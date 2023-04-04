package semana07;

public class revisao {
public static void main(String[] args) {
    double numero1 = 9;
    double numero2 = 10;
    double numero3 = 10;
    System.out.println(somar(numero1+numero2+numero3));
    }
    }


    /*1. Escreva um método estático em Java que recebe três parâmetros double e devolve 
    a soma dos valores;*/

    public static double somar(double numero1, double numero2, double numero3) {
        return numero1 + numero2 + numero3;
    }

    /*2. Escreva um método estático em Java que recebe três parâmetros double e devolve
    a média aritmética simples dos valores; */

    public static double mediAritmetica(double numero1, double numero2, double numero3) {
        return (numero1 + numero2 + numero3)/3;
    }

    /*3. Escreva um método estático em Java que recebe três parâmetros int e devolve o maior valor;*/

    public static int maiorValor(int numero1, int numero2, int numero3, int maior) {
        if(numero1 > numero2 && numero1 > numero3)
            numero1 = maior;
        else{
        if(numero2 > numero1 && numero2 > numero3)
            numero2 =  maior;
        }
        if(numero3 > numero1 && numero3 > numero2)
            numero3 = maior;
    }

    /*4. Escreva um método estático em Java que recebe três parâmetros int e devolve o menor valor; */

    public static int menorValor(int numero1, int numero2, int numero3, int maior) {

        if(numero1 < numero2 && numero1 < numero3)
            numero1 = maior;
        else{
        if(numero2 < numero1 && numero2 < numero3)
            numero2 = maior;
        }
        if(numero3 < numero1 && numero3 < numero2)
            numero3 = maior;
    }

    /*5. Escreva um método estático em Java que recebe três parâmetros double devolve um array com os 
    valores passados nos parâmetros; */

    public static double [] devolveArrayTresNumeros(double numero1, double numero2, double numero3) {
        double [] valores = new double [3]; 

        valores[0] = numero1;
        valores[1] = numero2;
        valores[2] = numero3;

        return valores;
    }

    /*6. Escreva um método estático em Java que recebe um array de double e devolve a soma dos valores; */

    public static double [] devolveSomaValores(double numero1, double numero2, double numero3) {
        double [] valores = new double[3];

        valores[0] = numero1;
        valores[1] = numero2;
        valores[2] = numero3;

        return valores;
    }

    /*7. Escreva um método estático em Java que recebe um array de double e devolve a média aritmética; */

    public static double devolveMediAritmetica(double [] array) {
        double [] valores = new double[3];

        valores[0] = numero1;
        valores[1] = numero2;
        valores[2] = numero3;

        return (numero1 + numero2 + numero3)/3;
    }

    /*8. Escreva um método estático em Java que recebe um array de double e devolve o maior valor; */

    public static double devolveMaiorValor(double numero1, double numero2, double numero3, double ) {
        String [] valores = new String[2];

        valores[0] = String.valueOf(numero1);
        valores[1] = String.valueOf(numero2);
        valores[2] = String.valueOf(numero3);

        if(valores[0] > valores[1] && valores[0]>valores[2])
        valores[0];
        else{
        if(valores[1] > valores[0] && valores[1]>valores[2])
        return valores[1];
        }
        if(valores[2] > valores[0] && valores[2]>valores[1])
        return valores[2];
    }

    /*9. Escreva um método estático em Java que recebe um array de double e devolve o menor valor; */

    public static double devolveMenorValor(String [] valores, double numero1, double numero2, double numero3) {

        valores[0] = String.valueOf(numero1);
        valores[1] = String.valueOf(numero2);
        valores[2] = String.valueOf(numero3);

        if(valores[0] < valores[1] && valores[0] < valores[2])
        return valores[0];
        if(valores[1] < valores[0] && valores[1] < valores[2])
        return valores[1];
        if(valores[2] < valores[0] && valores[2] < valores[1])
        return valores[2];
    }

    /*10. Escreva um método em Java que recebe dois array de inteiros e devolve um array com todos os 
    elementos do primeiro e do segundo array. */

    public static int [] juntarArrays(int[] array1, int[] array2) {
        int [] resultado = new int[array1.length + array2.length];
        int indice = 0;
        for (int valor : array1)
    }

}