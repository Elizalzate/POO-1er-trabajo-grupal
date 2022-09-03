import java.util.Scanner;

class Empleado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String codigoEmpleado, nombre;
        System.out.println("Ejercicio propuesto 18\n");
        double horasTrabajadasMes, valorHora, porcentajeReteFuente, salarioBruto, salarioNeto;
        System.out.print("Ingresa el código de empleado: ");
        codigoEmpleado = entrada.next();
        System.out.print("Ingresa el nombre del empleado: ");
        entrada.nextLine();
        nombre = entrada.nextLine();
        System.out.print("Ingresa las horas trabajadas en el mes: ");
        horasTrabajadasMes = entrada.nextDouble();
        System.out.print("Ingresa el valor de la hora de trabajo: ");
        valorHora = entrada.nextDouble();
        System.out.print("Ingresa el porcentaje de retención en la fuente: ");
        porcentajeReteFuente = entrada.nextDouble() / 100;

        salarioBruto = calcularSalarioBruto(horasTrabajadasMes, valorHora);
        salarioNeto = calcularSalarioNeto(salarioBruto, porcentajeReteFuente);

        System.out.println("\nEl empleado " +codigoEmpleado + " " + nombre + " trabajó " + horasTrabajadasMes + " horas este mes, "
                + "su salario bruto fue $" + salarioBruto + " y su salario neto fue de $" + salarioNeto);
    }

    /*
     * Método para calcular salario bruto
     */
    public static double calcularSalarioBruto(double horasTrabajadas, double valorHora) {
        return horasTrabajadas * valorHora;
    }

    /*
     * Método para calcular salario neto
     */
    public static double calcularSalarioNeto(double salarioBruto, double porcentajeReteFuente) {
        return salarioBruto - (salarioBruto * porcentajeReteFuente);
    }
}