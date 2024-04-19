import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome!");
        System.out.println("Escolha qual Figura deseja calcular a área:\n" +
                "Trapezio\n Circulo\n Quadrado\n Retangulo");
        String figura = scanner.nextLine();

        AreaCalculadora calculadora = new AreaCalculadora();

        double area = 0;
        switch (figura) {
            case "Trapezio":
                System.out.println("Informe a Base Maior:");
                double baseMaior = scanner.nextDouble();
                System.out.println("Informe a Base Menor:");
                double baseMenor = scanner.nextDouble();
                System.out.println("Informe a Altura:");
                double altura = scanner.nextDouble();
                area = calculadora.calcularAreaTrapezio(baseMaior, baseMenor, altura);
                break;
            case "Circulo":
                System.out.println("Informe o Raio:");
                double raio = scanner.nextDouble();
                area = calculadora.calcularAreaCirculo(raio);
                break;
            case "Quadrado":
                System.out.println("Informe o Lado:");
                double lado = scanner.nextDouble();
                area = calculadora.calcularAreaQuadrado(lado);
                break;
            case "Retangulo":
                System.out.println("Informe a Base:");
                double base = scanner.nextDouble();
                System.out.println("Informe a Altura:");
                double alturaRetangulo = scanner.nextDouble();
                area = calculadora.calcularAreaRetangulo(base, alturaRetangulo);
                break;
            default:
                System.out.println("Figura incorreta!");
        }

        System.out.println("A área da figura escolhida é: " + area);

        scanner.close();
    }
}
