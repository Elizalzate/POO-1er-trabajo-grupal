

import java.util.Scanner;//importar paquete para ingresar datos por teclado
public class EjercicioResuelto12 {
	public static void main(String[] args){//programa principal
	String nom; //variable nombre
	double vhn,het,hee8,salario;//variables valor hora normal,horas extras trabajadas,horas extras excedentes a 8, salario.
	int nht;//variable numero de horas trabajadas
	Scanner entrada= new Scanner(System.in);//se coloca System.in porque son datos de entrada
	System.out.println("Ingrese nombre: ");//mensaje para pedir variable nom
	nom= entrada.nextLine();//se asigna a nom el dato ingresado anteriormente de tipo String (por eso el nextLine)
	System.out.println("Ingrese número de horas trabajadas: ");         //mensaje para pedir numero de horas trabajadas
	nht=entrada.nextInt();//se asigna a nht el dato ingresado anteriormente de tipo entero (por eso el nextInt)
	System.out.println("Ingrese el salario por hora normal trabajada: ");  //mensaje para pedir variable salario por hora
	vhn=entrada.nextDouble();//se asigna a vhn el dato ingresado anteriormente de tipo entero (por eso el nextInt)
	
	
	if(nht>40) {  //compara las horas trabajadas con el limite estipulado
		het=nht-40;  //calcula horas extras
		if (het>8) { // //compara las horas extras con el limite estipulado
			hee8=het-8;         //calcula horas extras que excedan las 8.
			salario=40*vhn+16*vhn+hee8*3*vhn; //calcula salario
			
		}
		else {
			salario=40*vhn+het-2*vhn;//calcula salario
		}
	}
	else {
		salario=nht*vhn;//calcula salario
		
		
	}
	System.out.println("El trabajador "+nom+" devengó: $"+salario );//muestra resultado
	}
	}

