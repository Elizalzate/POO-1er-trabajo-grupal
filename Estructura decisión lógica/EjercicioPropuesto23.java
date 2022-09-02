
import java.util.Scanner;//importar paquete para ingresar datos por teclado
public class EjercicioPropuesto23{
	public static void main(String[] args){//programa principal
		double a,b,c,x1,x2;//variables a,b,c,x1,x2
		Scanner entrada= new Scanner(System.in);//se coloca System.in porque son datos de entrada
		System.out.println("Ingrese el valor de A: ");//mensaje para pedir variable A
		a=entrada.nextDouble();//se asigna a A el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		System.out.println("Ingrese el valor de B: ");//mensaje para pedir variable B
		b=entrada.nextDouble();//se asigna a B el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		System.out.println("Ingrese el valor de C: ");//mensaje para pedir variable C
		c=entrada.nextDouble();//se asigna C pesoa el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		if (Math.pow(b, 2)-4*a*c<0){           //verifica si las soluciones son complejas
			System.out.println("Las soluciones para la ecuación cuadratica son soluciones complejas");//mensaje de resultado
			
		}
		else if(Math.sqrt(Math.pow(b, 2)-4*a*c)==0) { //verifica si solo hay una solucion y la calcula
			System.out.println("La ecuación cuadratica tiene una unica solución dada "
					+ "por X= "+(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a));                 //mensaje de resultado
		}
		else {                       //calcula las dos posibles soluciones
			
		
		x1= (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a); 
		x2= (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		
		System.out.println("Las dos posibles soluciones para la ecuación de segundo grado "
				+ "son: X= "+x1+" y X= "+x2);//mensaje de resultado
		}
	}
}
