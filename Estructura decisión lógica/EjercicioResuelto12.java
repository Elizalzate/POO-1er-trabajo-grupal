import java.util.*;
public class EjercicioResuelto12 {
    public static void main(String[] args) {
        System.out.println("""
                Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas\s
                semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden\s
                de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando\s
                no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo\s
                que se paga una hora normal y el resto al triple.\s
                """);
        String nombre;
        double valorHora, horasExtrasTrabajadas, horasExtrasExcedentes, salario, horasTrabajadas;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese número de horas trabajadas: ");
        horasTrabajadas = entrada.nextInt();
        System.out.println("Ingrese el salario por hora trabajada: ");
        valorHora = entrada.nextDouble();

        if (horasTrabajadas > 40) {
            horasExtrasTrabajadas = horasTrabajadas - 40;
            if (horasExtrasTrabajadas > 8) {
                horasExtrasExcedentes = horasExtrasTrabajadas - 8;
                salario = (40 * valorHora) + (8 * valorHora * 2) + (horasExtrasExcedentes * 3 * valorHora);
            }
            else {
                salario = (40 * valorHora) + (horasExtrasTrabajadas * 2 * valorHora);
            }
        }
        else {
            salario = horasTrabajadas * valorHora;
        }
        System.out.println("El trabajador " + nombre + " devengó: $" + salario);
    }
}

