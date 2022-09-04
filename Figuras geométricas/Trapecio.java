public class Trapecio {
    int baseMayor;
    int baseMenor;
    int altura;

    /**
     * Constructor de la clase Rombo
     *
     * @param baseMayor Parámetro que define la base mayor de un trapecio
     * @param baseMenor Parámetro que define la base menor de un trapecio
     * @param altura Parámetro que define la altura de un trapecio
     */
    Trapecio(int baseMayor, int baseMenor, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    /**
     * Método que calcula el área de un rombo
     * @return Área de un rombo
     */
    double calcularArea() {
        return ((baseMayor + baseMenor) / 2.0)*altura;
    }

    /**
     * Método que calcula el perímetro de un rectángulo
     * @return Perímetro de un rectángulo
     */
    double calcularPerimetro() {
        return baseMenor + baseMayor + 2*Math.sqrt(Math.pow((baseMayor-baseMenor)/2.0,2) + Math.pow(altura,2)) ;
    }
}
