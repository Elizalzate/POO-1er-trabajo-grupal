import java.util.*;

public class EjercicioPropuesto24 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A, B, C;
        System.out.println("Ingrese el peso de A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el peso de B: ");
        B = entrada.nextDouble();
        System.out.println("Ingrese el peso de C: ");
        C = entrada.nextDouble();

        if (A > B && A > C) {
            System.out.println("\nA es la esfera de mayor peso");
        } else if (B > A && B > C) {
            System.out.println("\nB es la esfera de mayor peso");
        } else {
            System.out.println("\nC es la esfera de mayor peso");
        }

    }
}
