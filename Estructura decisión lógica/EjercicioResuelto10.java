

import java.util.Scanner; //importar paquete para ingresar datos por teclado


class EjercicioResuelto10 {
    public static void main(String[] args) { //programa principal
        System.out.println("Algoritmo para liquidar el pago de matricula de un estudiante."); //descripcion del ejercicio
        int NI, PAT, EST; //variables que son de tipo entero: numero de matricula (NI), patrimonio (PAT), estrato (EST)
        String NOM; //variable que es de tipo texto: nombre (NOM)
        double PAGMAT; //variable que es de tipo real doble: pago por matricula (PAGMAT)
        Scanner entrada = new Scanner(System.in); //se coloca System.in porque son datos de entrada
        System.out.println("Ingrese su numero de inscripcion: "); //mensaje para pedir variable NI
        NI = entrada.nextInt(); //se asigna a NI el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        System.out.println("Ingrese su nombre: "); //mensaje para pedir variable NOM
        NOM = entrada.next(); //se asigna a NOM el dato ingresado anteriormente de tipo texto (por eso va solamente next)
        System.out.println("Ingrese su patrimonio en pesos colombianos (sin signos): "); //mensaje para pedir variable PAT
        PAT = entrada.nextInt(); //se asigna a PAT el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        System.out.println("Ingrese su estrato social: "); //mensaje para pedir variable EST
        EST = entrada.nextInt(); //se asigna a EST el dato ingresado anteriormente de tipo entero (por eso el nextInt)
        PAGMAT = 50000; //valor constante definido por la Universidad
        // condicional
        if ((PAT > 2000000) && (EST > 3)){ //si con conjuncion (representada por &&, indica que ambas condiciones deben ser verdaderas)
            PAGMAT = PAGMAT + 0.03*PAT; //se incrementa el 3% sobre el patrimonio
        }
        System.out.println("El estudiante con numero de inscripcion " + NI + " y nombre " + NOM + " debe pagar: $" + PAGMAT); 
    }
}