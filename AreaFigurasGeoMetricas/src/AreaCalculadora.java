public class AreaCalculadora {
    public double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }

    public double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
}
