import java.util.*;

public class EjercicioPropuesto22 {
    public static void main(String[] args) {
        String nombre;
        int horaTrabajo;
        double salario, salarioTotal;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el salario por hora del empleado:");
        salario = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        horaTrabajo = entrada.nextInt();
        salarioTotal = horaTrabajo * salario;

        if (salarioTotal > 450000) {
            System.out.println("\nNombre del empleado: " + nombre);
            System.out.println("Salario de " + nombre + ": " + salarioTotal);
        }
		else {
            System.out.println("\nNombre del empleado: " + nombre);
        }
    }
}
