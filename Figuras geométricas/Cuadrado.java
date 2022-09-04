public class Cuadrado {
    int lado;
    /**
     * Constructor de la clase Cuadrado
     * @param lado Parámetro que define la longitud de la base de un
     * cuadrado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula el área de un cuadrado
     * @return Área de un Cuadrado
     */
    double calcularArea() {
        return lado*lado;
    }

    /**
     * Método que calcula el perímetro de un cuadrado
     * @return Perímetro de un cuadrado
     */
    double calcularPerimetro() {
        return (4*lado);
    }
}
