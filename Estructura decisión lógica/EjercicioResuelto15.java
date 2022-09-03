import java.util.*;

public class EjercicioResuelto15 {
    public static void main(String[] args) {
        double pesoA, pesoB, pesoC, pesoD;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = entrada.nextDouble();

        if ((pesoA == pesoB) && (pesoA == pesoC)) {
            if (pesoD > pesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        }
        else if ((pesoA == pesoB) && (pesoA == pesoD)) {
            if (pesoC > pesoA) {
                System.out.println("La esfera C es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
        }
        else if ((pesoA == pesoC) && (pesoA == pesoD)) {
            if (pesoB > pesoD) {
                System.out.println("La esfera B es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        }
        else {
            System.out.println("La esfera A es la diferente");
            if (pesoA > pesoB) {
                System.out.println("La esfera A es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
    }
}