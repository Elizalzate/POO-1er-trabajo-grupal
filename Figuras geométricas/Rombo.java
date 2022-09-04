public class Rombo {
    int lado;
    int diametroMayor;
    int diametroMenor;

    /**
     * Constructor de la clase Rombo
     *
     * @param lado          Parámetro que define el lado de un rombo
     * @param diametroMayor Parámetro que define el diámetro mayor de un rombo
     * @param diametroMenor Parámetro que define el diámetro menor de un rombo
     */
    Rombo(int lado, int diametroMayor, int diametroMenor) {
        this.lado = lado;
        this.diametroMayor = diametroMayor;
        this.diametroMenor = diametroMenor;
    }

    /**
     * Método que calcula el área de un rombo
     * @return Área de un rombo
     */
    double calcularArea() {
        return (diametroMayor * diametroMenor) / 2.0;
    }

    /**
     * Método que calcula el perímetro de un rectángulo
     * @return Perímetro de un rectángulo
     */
    double calcularPerimetro() {
        return (4*lado);
    }
}
