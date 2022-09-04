public class Rectangulo {
    int base;
    int altura;

    /**
     * Constructor de la clase Rectangulo
     * @param base Parámetro que define la base de un rectángulo
     * @param altura Parámetro que define la altura de un rectángulo
     */
    Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula el área de un rectángulo
     * @return Área de un rectángulo
     */
    double calcularArea() {
        return base * altura;
    }

    /**
     * Método que calcula el perímetro de un rectángulo
     * @return Perímetro de un rectángulo
     */
    double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}