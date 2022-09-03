import java.util.*;

public class EjercicioResuelto14 {
    public static void main(String[] args) {
        System.out.println("""
                Una empresa con tres departamentos tiene establecido un plan de incentivos para sus\s
                vendedores. Al final del período, a cada departamento se le pide el importe global de las\s
                ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al\s
                salario de los vendedores un porcentaje equivalente al 20% del salario mensual.
                """);
        double ventasDepartamento1, ventasDepartamento2, ventasDepartamento3, totalVentas;
        double salario, porcentajeVentas, salarioDepartamento1, salarioDepartamento2, salarioDepartamento3;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese ventas del departamento 1: ");
        ventasDepartamento1 = entrada.nextDouble();
        System.out.println("Ingrese ventas del departamento 2: ");
        ventasDepartamento2 = entrada.nextDouble();
        System.out.println("Ingrese ventas del departamento 3: ");
        ventasDepartamento3 = entrada.nextDouble();
        System.out.println("Ingrese el salario de los vendedores: ");
        salario = entrada.nextDouble();

        totalVentas = ventasDepartamento1 + ventasDepartamento2 + ventasDepartamento3;
        porcentajeVentas = 0.33 * totalVentas;

		/*
		 * Se comprueba cuál fue el departamento con mayor porcentaje de ventas y se le da una
		 * bonificación del 20% en su salario
		 */
        if (ventasDepartamento1 > porcentajeVentas) {
            salarioDepartamento1 = salario + 0.2 * salario;
        }
		else {
            salarioDepartamento1 = salario;
        }
        if (ventasDepartamento2 > porcentajeVentas) {
            salarioDepartamento2 = salario + 0.2 * salario;
        }
		else {
            salarioDepartamento2 = salario;
        }
        if (ventasDepartamento3 > porcentajeVentas) {
            salarioDepartamento3 = salario + 0.2 * salario;
        }
		else {
            salarioDepartamento3 = salario;
        }
        System.out.println("El salario para los vendedores del departamento 1 es: $" + salarioDepartamento1);
        System.out.println("El salario para los vendedores del departamento 2 es: $" + salarioDepartamento2);
        System.out.println("El salario para los vendedores del departamento 3 es: $" + salarioDepartamento3);
    }
}