package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar(Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        Double somaAreas = 0.0;
        for (Figura figura : figuras) {
            if (figura instanceof Circulo circulo) {
                somaAreas += circulo.calcularArea();
            } else if (figura instanceof Quadrado quadrado) {
                somaAreas += quadrado.calcularArea();
            } else if (figura instanceof Retangulo retangulo) {
                somaAreas += retangulo.calcularArea();
            } else if (figura instanceof Triangulo triangulo) {
                somaAreas += triangulo.calcularArea();
            }
        }
        return somaAreas;
    }

    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasEncontradas = new ArrayList<>();

        for (Figura figura : figuras) {
            if(figura.calcularArea() > 20) {
                figurasEncontradas.add(figura);
            }
        }
        return figurasEncontradas;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadradosEncontrados = new ArrayList<>();

        for (Figura figura : figuras) {
            if (figura instanceof Quadrado quadrado) {
                quadradosEncontrados.add(quadrado);
            }


        }

        return quadradosEncontrados;
    }
}
