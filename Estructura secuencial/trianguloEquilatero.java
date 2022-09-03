import java.util.*;

class TrianguloEquilatero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado, perimetro;
        String altura, area;
        System.out.print("Ingrese el tamaño del lado: ");
        lado = entrada.nextDouble();
        perimetro = perimetro(lado);
        altura = altura(lado);
        area = area(lado);

        System.out.println("\nEl perimetro es de " + perimetro + ", la altura es de " + altura + " y área es de " + area);

    }

    public static double perimetro(double lado) {
        return lado * 3;
    }

    public static String altura(double lado) {
        return String.format("%.02f", (Math.sqrt(3)*lado) / 2);
    }

    public static  String area(double lado){
        return String.format("%.02f", (Math.sqrt(3)*(lado*lado)) / 4);
    }
}