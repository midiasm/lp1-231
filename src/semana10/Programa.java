package semana10;

public class Programa {
    public static void main(String[] args) {
        //calcular a ara e perimetro retangulo
        //area = base * altura
        //perimetro = 2 * (base + altura)

        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;

        double areaRet1 = baseRet1 * alturaRet1;
        double perimetRet1 = 2 * (baseRet1 + alturaRet1);

        System.out.println(areaRet1);
        System.out.println(perimetRet1);

        //retangulo 2

        double baseRet2 = 10.0;
        double alturaRet2 = 5.0;

        double areaRet2 = baseRet2 * alturaRet2;
        double perimetRet2 = 2 * (baseRet2 + alturaRet2);

        System.out.println(areaRet2);
        System.out.println(perimetRet2);

        //

        retangulo ret1 = new retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        retangulo ret2 = new retangulo();
        ret2.base = 30.0;
        ret2.altura = 30.0;

        System.out.println(ret1.calcularArea());
        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());
        System.out.println(ret2.calcularPerimetro());

    }

        //metodo estatico

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }


}
