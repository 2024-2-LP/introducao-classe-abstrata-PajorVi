package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){}

    public Circulo(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * (Math.pow(raio, 2));
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
