public class Circulo {
    int radio;

    /**
     * Constructor de la clase Circulo
     *
     * @param radio Parámetro que define el radio de un círculo
     */
    Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * Método que calcula área del círculo
     *
     * @return Área de un Circulo
     */
    double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Método que calcula el perímetro de un círculo
     * @return Perímetro de un Circulo
     */
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
