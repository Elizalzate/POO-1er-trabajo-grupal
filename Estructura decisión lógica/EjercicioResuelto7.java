import java.util.*;

class EjercicioResuelto7 {
    public static void main(String[] args) {
        System.out.println("Algoritmo que, dados dos valores numéricos A y B, escribe un mensaje diciendo si A es mayor, menor o igual a B. \n");
        double A, B;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la variable A: ");
        A = entrada.nextDouble();
        System.out.println("Ingrese el valor de la variable B: ");
        B = entrada.nextDouble();

        if (A > B) {
            System.out.println("\nA es mayor que B.");
        } else if (A == B) {
            System.out.println("\nA es igual a B.");
        } else {
            System.out.println("\nA es menor que B.");
        }
    }
}

