

import java.util.Scanner;//importar paquete para ingresar datos por teclado

public class EjercicioResuelto14 {
	public static void main(String[] args){//programa principal
		int vd1,vd2,vd3,totven;//variables ventas de los departamentos 1,2,3 y total de ventas.
		double salar,porven,salar1,salar2,salar3;//variables salarios de empleados,porcentaje de ventas, salario1,salario2,salario3;
		Scanner entrada= new Scanner(System.in);//se coloca System.in porque son datos de entrada
		System.out.println("Ingrese ventas del departamento 1: ");//mensaje para pedir ventas del departamento 1
		vd1=entrada.nextInt();//se asigna a vd1 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
		System.out.println("Ingrese ventas del departamento 2: ");//mensaje para pedir ventas del departamento 2
		vd2=entrada.nextInt();//se asigna a vd2 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
		System.out.println("Ingrese ventas del departamento 3: ");//mensaje para pedir ventas del departamento 3
		vd3=entrada.nextInt();//se asigna a vd3 el dato ingresado anteriormente de tipo entero (por eso el nextInt)
		System.out.println("Ingrese el salario de los vendedores: ");//mensaje para pedir salario de los vendedores
		salar=entrada.nextDouble();//se asigna a saalar el dato ingresado anteriormente de tipo double (por eso el nextDouble)
		
		totven=vd1+vd2+vd3;  //calcula el total de ventas
		porven=0.33*totven;  //calcula el porcentaje sobre las ventas totales 
		if (vd1>porven) { //verifica si las ventas del departamento son mayores al porcentaje de ventas totales
			salar1=salar+0.2*salar; //calcula salario del departamento
			
		}
		else {
			salar1=salar;    
		}
		if (vd2>porven) {    //verifica si las ventas del departamento son mayores al porcentaje de ventas totales
			salar2=salar+0.2*salar;//calcula salario del departamento
			
		}
		else {
			salar2=salar;	
	}
		if (vd3>porven) {//verifica si las ventas del departamento son mayores al porcentaje de ventas totales
			salar3=salar+0.2*salar;//calcula salario del departamento
			
		}
		else {
			salar3=salar;	
	}
		System.out.println("El salario para los vendedores del departamento 1 es: "+salar1);//muestra resultado
		System.out.println("El salario para los vendedores del departamento 2 es: "+salar2);//muestra resultado
		System.out.println("El salario para los vendedores del departamento 3 es: "+salar3);//muestra resultado

	}
}