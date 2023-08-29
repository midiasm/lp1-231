package semana21;

import java.util.ArrayList;

public class Tela {
    private int numeroFiguras;
    private ArrayList<FiguraGeometrica> figuras;

    public Tela(){
        numeroFiguras = 0;
        figuras = new ArrayList<>();
    }

    public void addFigura(FiguraGeometrica f){
        figuras.add(f);
        numeroFiguras += 1;
    }

    public double areaTotal(){
        double total = 0.0;

        for (FiguraGeometrica figura : figuras) {
            total += figura.calcularArea();
        }

        return total;
    }

    public double calcularPerimetro(){

    }
}
