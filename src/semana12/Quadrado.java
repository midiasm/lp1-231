package semana12;

public class Quadrado {
    //atributo
    public double lado; 

    //construtor
    public Quadrado(double l){
        this.lado = l;
    }

    //métodos
    public double calcularArea(){
        return lado * lado;
    }

    public double calcularPerimetro(){
        return 4 * lado;
    }
}
