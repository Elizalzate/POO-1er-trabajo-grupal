public class TrianguloRectangulo {
    double base; // Atributo que define la base de un triángulo rectángulo
    double altura; // Atributo que define la altura de un triángulo rectángulo

    /**
     * Constructor de la clase TriánguloRectángulo
     *
     * @param base   Parámetro que define la base de un triángulo
     *               rectángulo
     * @param altura Parámetro que define la altura de un triángulo
     *               rectángulo
     */
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula el área de un triángulo rectángulo
     *
     * @return Área de un triángulo rectángulo
     */
    double calcularArea() {
        return (base * altura / 2);
    }

    /**
     * Método que calcula el perímetro de un triángulo rectángulo
     * @return Perímetro de un triángulo rectángulo
     */
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    /**
     * Método que calcula la hipotenusa de un triángulo rectángulo
     * @return Hipotenusa de un triángulo rectángulo
     */
    double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }
    /**
     * Método que determina si un triángulo es:
     * - Equilatero: si sus tres lados son iguales
     * - Escaleno: si sus tres lados son todos diferentes
     * - Escaleno: si dos de sus lados son iguales y el otro es diferente de
     * los demás
     */
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa())){
            System.out.println("Es un triángulo equilátero"); 
        }
        else if ((base != altura) && (base != calcularHipotenusa()) &&
                (altura != calcularHipotenusa())){
            System.out.println("Es un triángulo escaleno");
        }
        else{
            System.out.println("Es un triángulo isósceles");
        }
    }
}