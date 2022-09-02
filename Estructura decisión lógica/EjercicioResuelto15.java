
import java.util.Scanner;//importar paquete para ingresar datos por teclado
public class EjercicioResuelto15 {
	public static void main(String[] args){//programa principal
		double pesoa,pesob,pesoc,pesod;  //variables peso esfera A,B,C,D.
		Scanner entrada= new Scanner(System.in);//se coloca System.in porque son datos de entrada
		System.out.println("Ingrese el peso de la esfera A: ");//mensaje para pedir peso de la esfera A
		pesoa=entrada.nextDouble();//se asigna a pesoa el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		System.out.println("Ingrese el peso de la esfera B: ");//mensaje para pedir peso de la esfera B
		pesob=entrada.nextDouble();//se asigna a pesob el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		System.out.println("Ingrese el peso de la esfera C: ");//mensaje para pedir peso de la esfera C
		pesoc=entrada.nextDouble();//se asigna a pesoc el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		System.out.println("Ingrese el peso de la esfera D: ");//mensaje para pedir peso de la esfera D
		pesod=entrada.nextDouble();//se asigna a pesod el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		if ((pesoa==pesob)&&(pesoa==pesoc)) {  //si con conjuncion (representada por &&, indica que ambas condiciones deben ser verdaderas)
			if(pesod>pesoa) {//Verifica si la esfera D es de mayor peso a la A
				System.out.println("La esfera D es la diferente y es de mayor peso");//Mensaje para mostrar resultado
                
				
			}
			else {
				System.out.println("La esfera D es la diferente y es de menor peso");//Mensaje para mostrar resultado

			}
			
		}
		else if ((pesoa == pesob) && (pesoa == pesod)) {//si con conjuncion (representada por &&, indica que ambas condiciones deben ser verdaderas)
            System.out.println("La esfera C es la diferente");//Mensaje para mostrar resultado
            if (pesoc>pesoa) {//Verifica si la esfera C es de mayor peso a la A
                System.out.println("Y es de mayor peso");//Mensaje para mostrar resultado

            } else {
                System.out.println("Y es de menor peso");//Mensaje para mostrar resultado
            }
        } else if ((pesoa==pesoc) && (pesoa==pesod)) {//si con conjuncion (representada por &&, indica que ambas condiciones deben ser verdaderas)
            System.out.println("La esfera B es la diferente");//Mensaje para mostrar resultado
            if (pesob>pesod) {//Verifica si la esfera B es de mayor peso a la D
                System.out.println("Y es de mayor peso");//Mensaje para mostrar resultado

            } else {
                System.out.println("Y es de menor peso");//Mensaje para mostrar resultado
            }
        } else {
            System.out.println("La esfera A es la diferente");//Mensaje para mostrar resultado
            if (pesoa>pesob) {//Verifica si la esfera A es de mayor peso a la B
                System.out.println("Y es de mayor peso");//Mensaje para mostrar resultado

            } else {
                System.out.println("Y es de menor peso");//Mensaje para mostrar resultado
            }
        }
    }
}