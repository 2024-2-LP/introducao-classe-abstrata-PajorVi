package school.sptech;

import java.sql.DriverPropertyInfo;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    public Triangulo(){}

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return (base * altura) / 2;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
