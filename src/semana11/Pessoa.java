package semana11;

/*// considere esse código dentro do método main da class Programa

Pessoa p1 = new Pessoa();
p1.altura = 172;
p1.peso = 70.3;

double imc = p1.calcularImc();
String faixa = p1.getFaixa();
String situacao = p1.getSituacao(); // "GANHAR" = ganhar peso, "PERDER" = perder peso, "NORMAL" = peso ok*/

public class Pessoa{
    //atributos
    public double peso;
    public double altura;

    //metodos
    public double calcularImc(){
        return (peso/(altura*altura));
    }

    public String getFaixa() {
        double imc = calcularImc();
        if (imc < 18.5) {
            return "Você está abaixo do peso";
        }
        if (imc >= 18.5 && imc <= 24.9) {
            return "Você está no peso ideal";
        }
        if (imc >= 25 && imc <= 29) {
        return "Você está com excesso de peso";
        }
        if (imc >= 30 && imc <= 34.9) {
            return "Você está com obesidade de classe 1";
        }
        if (imc >= 35 && imc <= 39.9) {
            return "Você está com obesidade de classe 2";
        }
        if (imc >= 40) {
            return"Você está com obesidade de classe 3";
        }
        return "ERRO";
    }

    public String getSituacao(){
        double imc = calcularImc();
        if (imc < 18.5) {
            return "GANHAR PESO";//= ganhar peso
        } else if (imc >= 18.5 && imc <= 25) {
            return "PESO NORMAL";//= peso ok
        } else {
            return "PERDER PESO";//= perder peso
        }
    }
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.altura = 172;
        p1.peso = 70.3;

        double imc = p1.calcularImc();
        String faixa = p1.getFaixa();
        String situacao = p1.getSituacao();

        System.out.println("IMC: " + imc);
        System.out.println("Faixa: " + faixa);
        System.out.println("Situação: " + situacao);
    }

}

    
    