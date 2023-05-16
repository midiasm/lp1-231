package semana12;

public class Retangulo {
    public double base;
    public double altura;
    
    //construtor

    public Retangulo(double valor){
        if(valor <=0)
        throw new IllegalArgumentException("valor inválido");
    }

    public Retangulo(double base, double altura){
        if(base <= 0)
        throw new IllegalArgumentException("base inválida");
    }

    public Retangulo(double base, double altura){
        if(altura <= 0)
        throw new IllegalArgumentException("altura inválida");
    }
    
    public double calcularArea(){
        return this.base * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }
}
