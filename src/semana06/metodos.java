package semana06;

public class metodos{
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25)); 
        imprimirPalavra("Olá mundo");

        double soma = somar(10.0, 2.0);
        System.out.println(soma);

        System.out.println(calculadora.somar(10.0, 2.0));
    }

//soma dois numeros
public static double somar(double numero1, double numero2){
    return numero1 + numero2;
}

// public - modificador de acesso - qualquer classe em qualquer pacote pode acessar o método
// static - o método fica associado a classe e não a objetos dela
// void - tipo de retorno (void-sem retorno)
// imprimirPalavra - nome do método 
// parametros - referencias aos valores passados na chamada do metodo 

public static void imprimirPalavra(String palavra){
    System.out.println(palavra.toUpperCase());
} 


}