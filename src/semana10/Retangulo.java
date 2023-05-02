package semana10;

// classe - representa um conceito/abstração que deve ser implementado no programa 
class retangulo {
    // atributos
    public double base;
    public double altura;

    // metodos
    public double calcularArea(){
        return base * altura;
    }

    public double calcularPerimetro(){
        return 2 * (base + altura);
    }
}
