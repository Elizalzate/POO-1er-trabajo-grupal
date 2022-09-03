import java.util.*;

public class EjercicioPropuesto23 {
    public static void main(String[] args) {
        double A, B, C, x1, x2, raizEcuacionCuadratica;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = entrada.nextDouble();
        System.out.println("Ingrese el valor de C: ");
        C = entrada.nextDouble();
        raizEcuacionCuadratica = Math.pow(B, 2) - (4 * A * C);

        if (raizEcuacionCuadratica < 0) {
            System.out.println("Las soluciones para la ecuación cuadratica son soluciones complejas");

        }
        else if (raizEcuacionCuadratica == 0) {
            System.out.println("La ecuación cuadratica tiene sólo una solución " +
                    "X= " + (-B + Math.sqrt(raizEcuacionCuadratica)) / (2 * A));
        }
        else {
            x1 = (-B + Math.sqrt(raizEcuacionCuadratica)) / (2 * A);
            x2 = (-B - Math.sqrt(raizEcuacionCuadratica)) / (2 * A);
            System.out.println("Las dos posibles soluciones para la ecuación de segundo grado " +
                    "son: X1= " + x1 + " y X2= " + x2);
        }
    }
}
