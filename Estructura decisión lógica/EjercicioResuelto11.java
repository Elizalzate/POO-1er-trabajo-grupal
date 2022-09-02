

import java.util.Scanner; //importar paquete para ingresar datos por teclado


class EjercicioResuelto11 {
    public static void main(String[] args) { //programa principal
        System.out.println("Algoritmo para indicar el numero mayor entre tres valores."); //descripcion del ejercicio
        int N1, N2, N3, MAYOR; //numeros que van a compararse (N1, N2, N3) y variable que almacenara el mayor de ellos (MAYOR)
        Scanner entrada = new Scanner(System.in); //se coloca System.in porque son datos de entrada
        System.out.println("Ingrese el valor del primer numero: "); //mensaje para pedir variable N1
        N1 = entrada.nextInt(); //se asigna a N1 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        System.out.println("Ingrese el valor del segundo numero: "); //mensaje para pedir variable N2
        N2 = entrada.nextInt(); //se asigna a N2 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        System.out.println("Ingrese el valor del tercer numero: "); //mensaje para pedir variable N3
        N3 = entrada.nextInt(); //se asigna a N3 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        // condicional
        if ((N1 > N2) && (N1 > N3)){ //si con conjuncion (representada por &&, indica que ambas condiciones deben ser verdaderas)
            MAYOR = N1; //se concluye que el numero mayor es N1
        }
        else if (N2 > N3){ //si no
            MAYOR = N2; //se concluye que el numero mayor es N2
        }
        else { //no
            MAYOR = N3; //se concluye que el numero mayor es N3
        }
        System.out.println("El valor mayor entre " + N1 + ", " + N2 + " y " + N3 + " es " + MAYOR); 
    }
}
