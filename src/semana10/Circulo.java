package semana10;

public class Circulo {
    // atributos
    public double raio;
    
    // metodos
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
