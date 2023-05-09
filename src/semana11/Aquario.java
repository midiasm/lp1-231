package semana11;

/*1. Com base no Ex01. da semana 5 e 6 crie uma classe Aquario que possui os atributos comprimento,
altura e largura 
e os métodos calcularVolume, calcularPotenciaDoTermostato e calcularQuantidadeLitrosFiltro.
Teste todos os métodos da classe Aquario utilizando testes de unidade*/

public class Aquario{
    //atributos
    public double comprimento;
    public double altura;
    public double largura;

    //metodos
    public double calcularVolume(){
        return (comprimento*altura*largura)/1000;
    }

    public double calcularPotenciaDoTermostato(double temperaturaDesejada, double temperaturaAmbiente){
        return (calcularVolume() *0.05*(temperaturaAmbiente-temperaturaDesejada));
    }

    public double calcularQuantidadeLitrosFiltro(){
        double filtragem = calcularVolume() * 2;
        return filtragem;
    }
}