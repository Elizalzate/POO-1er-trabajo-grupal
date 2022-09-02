
import java.util.Scanner;//importar paquete para ingresar datos por teclado
public class EjercicioPropuesto22 {
	public static void main(String[] args){//programa principal
		String nombre; // variable nombre
		int hr_tr;   // variable horas trabajadas
		double salario,salariot;//variables salario, salario total
		Scanner entrada= new Scanner(System.in);//se coloca System.in porque son datos de entrada
		System.out.println("Ingrese nombre del empleado: ");//mensaje para pedir variable nombre
		nombre=entrada.nextLine();//se asigna a nombre el dato ingresado anteriormente de tipo String (por eso el nextLine)
		System.out.println("Ingrese el salario basico por hora del empleado: ");//mensaje para pedir variable salario
		salario=entrada.nextDouble();//se asigna a salario el dato ingresado anteriormente de tipo String (por eso el nextLine)
		System.out.println("Ingrese el número de horas trabajadas en el mes: ");//mensaje para pedir variable horas trabajadas
		hr_tr=entrada.nextInt();//se asigna a hr_tr el dato ingresado anteriormente de tipo String (por eso el nextLine)
		salariot= hr_tr*salario;      //calculo del salario total
		if (salariot>450000) {            //compara el salario con el limite estipulado
			
			System.out.println("Nombre del empleado: "+nombre);             //muestra nombre del empleado
			System.out.println("salario de "+nombre+" : "+salariot);  //muestra salario del empleado
			
		}
		else {
			System.out.println("Nombre del empleado: "+nombre);          //muestra nombre del empleado
			
		}
		
	}

}
