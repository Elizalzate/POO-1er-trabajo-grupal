import java.util.*;

class EjercicioResuelto11 {
    public static void main(String[] args) {
        System.out.println("Algoritmo para indicar el número mayor entre tres valores.");
        double N1, N2, N3, MAYOR;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del primer numero: ");
        N1 = entrada.nextDouble();
        System.out.println("Ingrese el valor del segundo numero: ");
        N2 = entrada.nextDouble();
        System.out.println("Ingrese el valor del tercer numero: ");
        N3 = entrada.nextDouble();

        if ((N1 > N2) && (N1 > N3)) {
            MAYOR = N1;
        }
        else if ((N2 > N3) && (N2 > N1)) {
            MAYOR = N2;
        }
        else {
            MAYOR = N3;
        }
        System.out.println("El valor mayor entre " + N1 + ", " + N2 + " y " + N3 + " es " + MAYOR);
    }
}
