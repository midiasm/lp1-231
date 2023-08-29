package semana21;

import java.util.ArrayList;

//interface é uma estrutura de código que tem em algumas linguagens de programação
//interaface = contrato
//conjunto de métodos (somente assinatura, sem corpo)
//classe concreta que implementa a interface

//Quadrado - lado - calcular area/perimetro
//Retangulo - base, altura - calcular area/perimetro
//Circulo - ?

public class Main {
    public static void main(String[] args) {
        System.out.println("Main...");

        Tela tela = new Tela();

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);
        Retangulo r1 = new Retangulo(10, 5);

        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);

        System.out.println(tela.areaTotal());
        System.out.println(tela.perimetroTotal());

        //List
        //Set
        //Map

        ArrayList<String> nomes = new ArrayList<>();

        //Adicionar
        nomes.add("Maria"); //0
        nomes.add("João"); //1
        nomes.add("Pedro"); //2

        //Tamanho
        System.out.println(nomes.size());

        //Remover um elemento
        nomes.remove(1); //ou "João" que remove somente o primeiro João que aparecer

        //Remove todos os elementos do ArrayList
        nomes.clear();

        //Pegar valor
        System.out.println(nomes.get(0));

        for (int 1 = 0; i < nomes.size(); i++) {
            String nome = nomes.get(i);
        }

        for (String nome : nomes){
            
        }
    }
}
