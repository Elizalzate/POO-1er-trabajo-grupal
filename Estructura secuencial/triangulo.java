import java.util.Scanner;

class Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1, lado2, lado3, perimetro, semiperimetro;
        String area;
        System.out.print("Ingrese el tamaño del lado: ");
        lado1 = entrada.nextDouble();
        lado2 = entrada.nextDouble();
        lado3 = entrada.nextDouble();
        perimetro = perimetro(lado1, lado2, lado3);
        semiperimetro = perimetro / 2;
        area = area(lado1, lado2, lado3, semiperimetro);

        System.out.println("\nEl perímetro es de " + perimetro + ", el semiperímetro " + semiperimetro +
                " y área es de " + area);

    }

    public static double perimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public static String area(double a, double b, double c, double sp) {
        return String.format("%.02f", (Math.sqrt(sp * (sp - a) * (sp - b) * (sp * c))));
    }
}