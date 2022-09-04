public class PruebaFiguras {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(2);
        Rectangulo miRectangulo = new Rectangulo(1, 2);
        Cuadrado miCuadrado = new Cuadrado(3);
        TrianguloRectangulo miTrianguloRectangulo = new TrianguloRectangulo(3, 5);

        System.out.println("El área del círculo es = " + miCirculo.calcularArea());
        System.out.println("El perímetro del círculo es = " + miCirculo.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + miRectangulo.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + miRectangulo.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + miCuadrado.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + miCuadrado.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + miTrianguloRectangulo.calcularArea());
        System.out.println("El perímetro del triángulo es = " + miTrianguloRectangulo.calcularPerimetro());
        miTrianguloRectangulo.determinarTipoTriangulo();
    }
}

