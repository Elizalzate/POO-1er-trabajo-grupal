
import java.util.Scanner; //importar paquete para ingresar datos por teclado


class EjercicioResuelto7 {
    public static void main(String[] args) { //programa principal
        System.out.println("Algoritmo que, dados dos valores numericos A y B, escribe un mensaje diciendo si A es mayor, menor o igual a B."); //descripcion del ejercicio
        int A,B; //valores de las variables, son enteros
        Scanner entrada = new Scanner(System.in); //se coloca System.in porque son datos de entrada
        System.out.println("Ingrese el valor de la variable A: "); //mensaje para pedir variable A
        A = entrada.nextInt(); //se asigna a A el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        System.out.println("Ingrese el valor de la variable B: "); //mensaje para pedir variable B
        B = entrada.nextInt(); //se asigna a B el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        //condicionales
        if(A>B){ //si
            System.out.println("A es mayor que B."); //imprimir resultado
        }
        else if(A==B){ //si no
            System.out.println("A es igual a B."); //imprimir resultado
        }
        else { //no
            System.out.println("A es menor que B."); //imprimir resultado
        }
    }
}

