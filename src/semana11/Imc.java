package semana11;

/*// considere esse código dentro do método main da class Programa

Pessoa p1 = new Pessoa();
p1.altura = 172;
p1.peso = 70.3;

double imc = p1.calcularImc();
String faixa = p1.getFaixa();
String situacao = p1.getSituacao(); // "GANHAR" = ganhar peso, "PERDER" = perder peso, "NORMAL" = peso ok*/

public class Imc{
    //atributos
    public double peso;
    public double altura;

    //metodos
    public double calcularImc(){
        return (peso/(altura*altura));
    }
}
    