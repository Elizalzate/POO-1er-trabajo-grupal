import java.util.*;

class EjercicioResuelto10 {
    public static void main(String[] args) {
        System.out.println("""
                La universidad cobra un valor constante para cada estudiante de $50.000. Si el patrimonio\s
                es mayor que $2´000.000 y el estrato superior a 3, se le incrementa un porcentaje del 3%\s
                sobre el patrimonio
                """);
        int estrato;
        String nombre, numeroInscripcion;
        double patrimonio, pagoMatricula = 50000;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su número de inscripción: ");
        numeroInscripcion = entrada.next();
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese su patrimonio en pesos colombianos (sin signos): ");
        patrimonio = entrada.nextDouble();
        System.out.println("Ingrese su estrato social: ");
        estrato = entrada.nextInt();
        if ((patrimonio > 2000000) && (estrato > 3)) {
            pagoMatricula += 0.03 * patrimonio;
        }
        System.out.println("El estudiante " + nombre + " con numero de inscripción " + numeroInscripcion +
                " debe pagar: $" + pagoMatricula);
    }
}